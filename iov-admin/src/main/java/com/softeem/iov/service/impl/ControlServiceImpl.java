package com.softeem.iov.service.impl;

import com.softeem.iov.entity.Control;
import com.softeem.iov.mapper.ControlMapper;
import com.softeem.iov.service.IControlService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 控制记录表 服务实现类
 * </p>
 *
 * @author softeem
 * @since 2023-09-19
 */
@Service
public class ControlServiceImpl extends ServiceImpl<ControlMapper, Control> implements IControlService {

}
