package com.qhit.parking.service;

import com.qhit.parking.entity.Notice;

import java.util.List;

/**
 * Created by Administrator on 2019/5/27.
 */
public interface NoticeService {
    List<Notice> selectAll();
}
