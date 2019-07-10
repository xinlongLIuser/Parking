package com.qhit.parking.comtroller;

import com.qhit.parking.entity.Message;
import com.qhit.parking.service.MessageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

/**
 * Created by Administrator on 2019/5/28.
 */
@Controller
@RequestMapping("/message")
public class MessageController {
    @Autowired
    private MessageService messageService;
    @RequestMapping("/message-list")
    public String selectAll( Model model){
        List<Message> list=messageService.selectAll();
        model.addAttribute("messageList",list);
        return "message/message-list";

    }
}
