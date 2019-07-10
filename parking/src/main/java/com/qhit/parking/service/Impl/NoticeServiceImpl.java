package com.qhit.parking.service.Impl;

import com.qhit.parking.dao.NoticeMapper;
import com.qhit.parking.entity.Notice;
import com.qhit.parking.service.NoticeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by Administrator on 2019/5/27.
 */
@Service
public class NoticeServiceImpl implements NoticeService {
    @Autowired
    private NoticeMapper noticeMapper;

    @Override
    public List<Notice> selectAll() {
        return noticeMapper.selectAll();
    }
}
