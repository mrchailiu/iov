package com.softeem.iov.service.impl;

import com.softeem.iov.entity.User;
import com.softeem.iov.mapper.UserMapper;
import com.softeem.iov.service.IUserService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 用户信息表 服务实现类
 * </p>
 *
 * @author softeem
 * @since 2023-09-19
 */
@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, User> implements IUserService {

}
