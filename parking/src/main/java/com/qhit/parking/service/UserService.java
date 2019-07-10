package com.qhit.parking.service;

import com.qhit.parking.entity.User;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by Administrator on 2019/5/27.
 */

public interface UserService {
    List<User> selectAll();

    List<User> getUserName(String name);

    int updateStart(Integer id);

    int updateStop(Integer id);

    int updateStatus(Integer id);

    int deleteByPrimaryKey(Integer id);
}
