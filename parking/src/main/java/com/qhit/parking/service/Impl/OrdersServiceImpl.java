package com.qhit.parking.service.Impl;

import com.qhit.parking.dao.OrdersMapper;
import com.qhit.parking.entity.Orders;
import com.qhit.parking.service.OrdersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by Administrator on 2019/5/27.
 */
@Service
public class OrdersServiceImpl  implements OrdersService {
    @Autowired
    private OrdersMapper ordersMapper;

    @Override
    public List<Orders> selectAllUser() {
        return ordersMapper.selectAllUser();
    }

    @Override
    public List<Orders> selectId(Integer id) {
        return ordersMapper.selectId(id);
    }

    @Override
    public List<Orders> getOrderName(String name) {
        return ordersMapper.getOrderName(name);
    }

    @Override
    public boolean deleteByPrimaryKey(Integer id) {
        int i=ordersMapper.deleteByPrimaryKey(id);
        if (i>0) {
            return true;
        }
        return false;
    }

}
