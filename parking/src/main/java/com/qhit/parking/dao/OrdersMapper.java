package com.qhit.parking.dao;

import com.qhit.parking.entity.Orders;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;
@Mapper
public interface OrdersMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Orders record);

    Orders selectByPrimaryKey(Integer id);

    List<Orders> selectAll();

    int updateByPrimaryKey(Orders record);

    List<Orders> selectId(Integer id);

    List<Orders> selectAllUser();

    List<Orders> getOrderName(String name);
}