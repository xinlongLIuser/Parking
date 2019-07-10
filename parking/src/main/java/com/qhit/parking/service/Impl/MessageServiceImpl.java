package com.qhit.parking.service.Impl;

import com.qhit.parking.dao.MessageMapper;
import com.qhit.parking.entity.Message;
import com.qhit.parking.service.MessageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by Administrator on 2019/5/28.
 */
@Service
public class MessageServiceImpl implements MessageService {
    @Autowired
   private MessageMapper messageMapper;
    @Override
    public List<Message> selectAll() {
        return messageMapper.selectAll();
    }
}
