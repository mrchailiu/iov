package com.softeem.iov.service.impl;

import com.softeem.iov.entity.Trip;
import com.softeem.iov.mapper.TripMapper;
import com.softeem.iov.service.ITripService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 行程记录表 服务实现类
 * </p>
 *
 * @author softeem
 * @since 2023-09-19
 */
@Service
public class TripServiceImpl extends ServiceImpl<TripMapper, Trip> implements ITripService {

}
