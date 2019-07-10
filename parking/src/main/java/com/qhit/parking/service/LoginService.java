package com.qhit.parking.service;

import com.qhit.parking.entity.Admin;

import java.util.List;

/**
 * Created by lenovo on 2019/5/25.
 */
public interface LoginService {

    Admin Login( String name, String password);

    List<Admin> selectAll();

    List<Admin> adminName(String name);

    boolean insert(Admin record);

    boolean deleteByPrimaryKey(Integer id);

    Admin selectByPrimaryKey(Integer id);

    int updateByPrimaryKey(Admin record);

    int updateStart(Integer id);

    int updateStop(Integer id);

    boolean updatePwd(Admin record);
}
