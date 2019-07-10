package com.qhit.parking.dao;

import com.qhit.parking.entity.User;
import io.lettuce.core.dynamic.annotation.Param;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;
@Mapper
public interface UserMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(User record);

    User selectByPrimaryKey(Integer id);

    List<User> selectAll();

    int updateByPrimaryKey(User record);

    List<User> getUserName(@Param("name") String name);

    int updateStart(Integer id);

    int updateStop(Integer id);
    //伪删除
    int updateStatus(Integer id);
}