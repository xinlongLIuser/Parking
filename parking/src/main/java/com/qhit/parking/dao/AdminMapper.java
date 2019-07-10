package com.qhit.parking.dao;

import com.qhit.parking.entity.Admin;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface AdminMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Admin record);

    Admin selectByPrimaryKey(Integer id);

    List<Admin> selectAll();

    int updateByPrimaryKey(Admin record);

    Admin Login(@Param("name") String name,@Param("password") String password);

    List<Admin> adminName(@Param("name") String name);

    int updateStart(Integer id);

    int updateStop(Integer id);

    int updatePwd(Admin record);


}