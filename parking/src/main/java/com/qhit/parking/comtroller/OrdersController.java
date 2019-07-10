package com.qhit.parking.comtroller;

import com.qhit.parking.entity.Orders;
import com.qhit.parking.service.OrdersService;
import com.qhit.parking.utils.ExcelUtiles;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

/**
 * Created by Administrator on 2019/5/27.
 */
@Controller
@RequestMapping("/order")
public class OrdersController {
    @Autowired
    private OrdersService ordersService;
    @RequestMapping("/exportStuInfoExcel")
    public void exportStuInfoExcel(HttpServletResponse response){
        List<Orders> ParkList=ordersService.selectAllUser();
        ExcelUtiles.exportExcel( ParkList,"车位管理表","订单",Orders.class,"订单.xls",response);
    }
    @RequestMapping("/order-list")
    public String selectAllUser(Model model){
        List<Orders> list=ordersService.selectAllUser();
        model.addAttribute("orderList",list);
        return "order/order-list";
    }




    @RequestMapping("/findOrderByKey")
    public String adminName(@RequestParam("keyTmp")String keyTmp, Model model)throws IOException {
        List<Orders> list=ordersService.getOrderName(keyTmp);
        if (list!=null){
            model.addAttribute("orderList",list);
        }
        return "order/order-list";
    }

    @RequestMapping("/delOrder")
    public void deleteByPrimaryKey(@RequestParam("orderId")Integer id,HttpServletResponse response)throws IOException{
        String result="";
        Boolean falg=ordersService.deleteByPrimaryKey(id);
        response.getWriter().write(result= falg? "Y" : "N");
    }
}
