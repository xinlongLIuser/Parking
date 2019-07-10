package com.qhit.parking.service.Impl;

import com.qhit.parking.dao.ParkMapper;
import com.qhit.parking.entity.Park;
import com.qhit.parking.service.ParkService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by Administrator on 2019/5/27.
 */
@Service
public class ParkServceImpl implements ParkService {
    @Autowired
    private ParkMapper parkMapper;

    @Override
    public List<Park> selectAll() {
        return parkMapper.selectAll();
    }

    @Override
    public List<Park> getName(String name) {
        return parkMapper.getName(name);
    }

    @Override
    public boolean insert(Park record) {
        int i=parkMapper.insert(record);
        if(i>0){
            return  true;
        }
        return false;
    }

    @Override
    public boolean deleteByPrimaryKey(Integer id) {
        int i=parkMapper.deleteByPrimaryKey(id);
        if(i>0){
            return  true;
        }
        return false;
    }

    @Override
    public Park selectByPrimaryKey(Integer id) {
        return parkMapper.selectByPrimaryKey(id);
    }

    @Override
    public int updateByPrimaryKey(Park record) {
        return parkMapper.updateByPrimaryKey(record);
    }

    @Override
    public int batchInsert(List<Park> parks) {
        return parkMapper.batchInsert(parks);
    }

    @Override
    public List<Park> selectRf() {
        return parkMapper.selectRf();
    }
}
