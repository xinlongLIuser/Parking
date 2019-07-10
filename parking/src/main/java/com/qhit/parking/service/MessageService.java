package com.qhit.parking.service;

import com.qhit.parking.entity.Message;

import java.util.List;

/**
 * Created by Administrator on 2019/5/28.
 */
public interface MessageService {
    List<Message> selectAll();
}
