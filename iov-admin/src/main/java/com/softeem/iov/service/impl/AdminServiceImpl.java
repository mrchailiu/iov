package com.softeem.iov.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.toolkit.Wrappers;
import com.softeem.iov.entity.Admin;
import com.softeem.iov.mapper.AdminMapper;
import com.softeem.iov.service.IAdminService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 管理员表 服务实现类
 * </p>
 *
 * @author softeem
 * @since 2023-09-19
 */
@Service
public class AdminServiceImpl extends ServiceImpl<AdminMapper, Admin> implements IAdminService {

    @Override
    public Admin userLogin(Admin admin) {
        //创建查询包装器
        QueryWrapper<Admin> query = Wrappers.query(Admin.class);
        query.eq("username",admin.getUsername());
        //执行查询
        Admin admin1 = getBaseMapper().selectOne(query);
        return admin1;
    }
}
