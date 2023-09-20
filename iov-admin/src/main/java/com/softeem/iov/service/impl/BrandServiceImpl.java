package com.softeem.iov.service.impl;

import com.softeem.iov.entity.Brand;
import com.softeem.iov.mapper.BrandMapper;
import com.softeem.iov.service.IBrandService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 车辆品牌表 服务实现类
 * </p>
 *
 * @author softeem
 * @since 2023-09-19
 */
@Service
public class BrandServiceImpl extends ServiceImpl<BrandMapper, Brand> implements IBrandService {

}
