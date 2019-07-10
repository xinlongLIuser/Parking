package com.qhit.parking.service;

import com.qhit.parking.entity.Orders;

import java.util.List;

/**
 * Created by Administrator on 2019/5/27.
 */
public interface OrdersService {
//    List<Orders> selectAll();
    List<Orders> selectAllUser();

    List<Orders> selectId(Integer id);

    List<Orders> getOrderName(String name);

    boolean deleteByPrimaryKey(Integer id);

}
