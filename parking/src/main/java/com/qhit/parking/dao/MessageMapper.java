package com.qhit.parking.dao;

import com.qhit.parking.entity.Message;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;
@Mapper
public interface MessageMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Message record);

    Message selectByPrimaryKey(Integer id);

    List<Message> selectAll();

    int updateByPrimaryKey(Message record);


}