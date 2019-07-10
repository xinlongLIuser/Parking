package com.qhit.parking.comtroller;

import cn.afterturn.easypoi.excel.ExcelImportUtil;
import cn.afterturn.easypoi.excel.entity.ImportParams;
import com.qhit.parking.entity.Park;
import com.qhit.parking.service.ParkService;
import com.qhit.parking.utils.ExcelUtiles;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/**
 * Created by Administrator on 2019/5/27.
 */
@Controller
@RequestMapping("/park")
public class ParkController {
    @Autowired
    private ParkService parkService;


    @RequestMapping("/list")
    public String selectAll(Model model){
        List<Park> list=parkService.selectAll();
        model.addAttribute("parkList",list);
        return "park/park-list";

    }
    @RequestMapping("/findCarByKey")
    public String adminName(@RequestParam("keyTmp")String keyTmp, Model model)throws IOException {
        List<Park> list=parkService.getName(keyTmp);
        if (list!=null){
            model.addAttribute("parkList",list);
        }
        return "park/park-list";
    }
    @RequestMapping("/park-add")
    public  String adminAdd(){
        return "park/park-add";
    }

    @RequestMapping("/park-save")
    public void  insert(Park park,HttpServletResponse response)throws IOException{
        String result="";
        Boolean falg=parkService.insert(park);
        response.getWriter().write(result= falg? "Y" : "N");
    }
    @RequestMapping("/park-delete")
    public void deleteByPrimaryKey(@RequestParam("parkId")Integer id,HttpServletResponse response)throws IOException{
        String result="";
        Boolean falg=parkService.deleteByPrimaryKey(id);
        response.getWriter().write(result= falg? "Y" : "N");
    }
    @RequestMapping("/park-load")
    public String selectByPrimaryKey(@RequestParam("parkId")Integer id,Model model)throws IOException{
        Park park=parkService.selectByPrimaryKey(id);
        model.addAttribute("park",park);
        return "park/park-edit";
    }
    @RequestMapping("/park-edit")
    public void updateByPrimaryKeySelective(Park park,HttpServletResponse response)throws IOException{
        String result="";
        int i=parkService.updateByPrimaryKey(park);
        if(i>0){
            result="Y";
        }else {
            result="N";
        }
        response.getWriter().write(result);
    }


//导出
    @RequestMapping("/export")
    public void exportStuInfoExcel(HttpServletResponse response){
        List<Park> ParkList=parkService.selectAll();
        ExcelUtiles.exportExcel( ParkList,"车位管理表","订单",Park.class,"报表.xls",response);
    }



//导入
    @RequestMapping("/importfile")
    public  String importfile(){
        return "importfile/import";
    }
    @RequestMapping("/exportTemplate")
    @ResponseBody
    public void exportStuInfoExcels(HttpServletResponse response){
        List<Park> list=new ArrayList();

        ExcelUtiles.exportExcel(list,"车位列表","车位",Park.class,"车位列表.xls",response);
    }
    @RequestMapping("/import")
    @ResponseBody
    public HashMap importPark(@RequestParam("file") MultipartFile file) throws Exception {
        System.out.println(file.getInputStream());
        HashMap map=new HashMap();
        ImportParams params = new ImportParams();
        params.setTitleRows(1);
        params.setHeadRows(1);
        List<Park> list = ExcelImportUtil.importExcel(file.getInputStream(), Park.class, params);
        int i = parkService.batchInsert(list);
        if(i>0){
            map.put("res","0");
        }
        return map;
    }
//柱形图
    @RequestMapping("/Histogram")
    public  String selectRf(){
        return "park/demo1";
    }
    @RequestMapping("/echarts-list")
    //返回json类型的注解
    @ResponseBody
    public  List selectRflist(){
        List<Park> parks=parkService.selectRf();
        return parks;
    }
    //饼状图
    @RequestMapping("/pie")
    public  String select(){
        return "park/demo2";
    }

}
