package com.softeem.iov.service.impl;

import com.softeem.iov.entity.Product;
import com.softeem.iov.mapper.ProductMapper;
import com.softeem.iov.service.IProductService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 汽车型号表 服务实现类
 * </p>
 *
 * @author softeem
 * @since 2023-09-19
 */
@Service
public class ProductServiceImpl extends ServiceImpl<ProductMapper, Product> implements IProductService {

}
