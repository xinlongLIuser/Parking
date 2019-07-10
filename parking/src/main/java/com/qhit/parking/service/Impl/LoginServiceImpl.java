package com.qhit.parking.service.Impl;

import com.qhit.parking.dao.AdminMapper;
import com.qhit.parking.entity.Admin;
import com.qhit.parking.service.LoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by lenovo on 2019/5/25.
 */
@Service
public class LoginServiceImpl implements LoginService {

@Autowired
 private AdminMapper adminMapper;
    @Override
    public Admin Login(String name, String password) {
        return adminMapper.Login(name, password);
    }

    @Override
    public List<Admin> selectAll() {
        return adminMapper.selectAll();
    }

    @Override
    public List<Admin> adminName(String name) {
        return adminMapper.adminName(name);
    }

    @Override
    public boolean insert(Admin record) {
        int i=adminMapper.insert(record);
        if(i>0){
            return true;
        }
        return false;
    }

    @Override
    public boolean deleteByPrimaryKey(Integer id) {
        int i=adminMapper.deleteByPrimaryKey(id);
        if(i>0){
            return true;
        }
        return false;
    }

    @Override
    public Admin selectByPrimaryKey(Integer id) {
        return adminMapper.selectByPrimaryKey(id);
    }

    @Override
    public int updateByPrimaryKey(Admin record) {
        return adminMapper.updateByPrimaryKey(record);
    }

    @Override
    public int updateStart(Integer id) {
        return adminMapper.updateStart(id);
    }

    @Override
    public int updateStop(Integer id) {
        return adminMapper.updateStop(id);
    }

    @Override
    public boolean updatePwd(Admin record) {
        int i=adminMapper.updatePwd(record);
        if(i>0){
            return true;
        }
        return false;
    }
}
