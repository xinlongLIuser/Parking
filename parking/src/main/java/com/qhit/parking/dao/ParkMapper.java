package com.qhit.parking.dao;

import com.qhit.parking.entity.Park;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;
@Mapper
public interface ParkMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Park record);

    Park selectByPrimaryKey(Integer id);

    List<Park> selectAll();

    int updateByPrimaryKey(Park record);

    List<Park> getName(@Param("name") String name);

    int batchInsert(List<Park> parks);

    List<Park> selectRf();
}