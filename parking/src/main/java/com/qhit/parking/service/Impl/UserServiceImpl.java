package com.qhit.parking.service.Impl;

import com.qhit.parking.dao.UserMapper;
import com.qhit.parking.entity.User;
import com.qhit.parking.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by Administrator on 2019/5/27.
 */
@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserMapper userMapper;
    @Override
    public List<User> selectAll() {
        return userMapper.selectAll();
    }

    @Override
    public List<User> getUserName(String name) {
        return userMapper.getUserName(name);
    }

    @Override
    public int updateStart(Integer id) {
        return userMapper.updateStart(id);
    }

    @Override
    public int updateStop(Integer id) {
        return userMapper.updateStop(id);
    }

    @Override
    public int updateStatus(Integer id) {
        return userMapper.updateStatus(id);
    }

    @Override
    public int deleteByPrimaryKey(Integer id) {
        return userMapper.deleteByPrimaryKey(id);
    }
}
