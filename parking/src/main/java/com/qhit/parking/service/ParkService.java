package com.qhit.parking.service;

import com.qhit.parking.entity.Park;

import java.util.List;

/**
 * Created by Administrator on 2019/5/27.
 */
public interface ParkService {
    List<Park> selectAll();

    List<Park> getName(String name);

    boolean insert(Park record);

    boolean deleteByPrimaryKey(Integer id);

    Park selectByPrimaryKey(Integer id);
    int updateByPrimaryKey(Park record);

    int batchInsert(List<Park> parks);

    List<Park> selectRf();

}
