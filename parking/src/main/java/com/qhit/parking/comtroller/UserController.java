package com.qhit.parking.comtroller;


import com.qhit.parking.entity.Orders;
import com.qhit.parking.entity.User;
import com.qhit.parking.service.OrdersService;
import com.qhit.parking.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.util.List;

/**
 * Created by Administrator on 2019/5/27.
 */
@Controller
@RequestMapping("/user")
public class UserController {
    @Autowired
    private UserService userService;
    @Autowired
    private OrdersService ordersService;

    @RequestMapping("/user-list")
    public String selectAll( Model model){
        List<User> list=userService.selectAll();
        model.addAttribute("userList",list);
        return "user/user-list";

    }
    @RequestMapping("/findUserByName")
    public String adminName(@RequestParam("nameTmp") String nameTmp,Model model)throws IOException{
        List<User> list=userService.getUserName(nameTmp);
        if (list!=null){
            model.addAttribute("userList",list);
        }
        return "user/user-list";
    }


    @RequestMapping("/startUser")
    public void updateStart(@RequestParam("userId") Integer id,HttpServletResponse response)throws IOException{
        String result="";
        int i=userService.updateStart(id);
        if(i>0){
            result="Y";
        }else {
            result="N";
        }
        response.getWriter().write(result);
    }
    @RequestMapping("/stopUser")
    public void updateStop(@RequestParam("userId") Integer id,HttpServletResponse response)throws IOException{
        String result="";
        int i=userService.updateStop(id);
        if(i>0){
            result="Y";
        }else {
            result="N";
        }
        response.getWriter().write(result);
    }
    @RequestMapping("/deluser")
    public void deleteByPrimaryKey(@RequestParam("userId")Integer id,HttpServletResponse response)throws IOException{
        List<Orders> orders=ordersService.selectId(id);
        String result="";
        if(orders!=null){
        int i=userService.updateStatus(id);
        if(i>0){
            result="Y";
        }else{
            result="N";
        }
    }else{
            int i=userService.deleteByPrimaryKey(id);
            if(i>0){
                result="Y";
            }else{
                result="N";
            }
    }
    response.getWriter().write(result);

    }
}
