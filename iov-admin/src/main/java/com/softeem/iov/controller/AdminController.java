package com.softeem.iov.controller;

import com.softeem.iov.entity.Admin;
import com.softeem.iov.service.IAdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * <p>
 * 管理员表 前端控制器
 * </p>
 *
 * @author softeem
 * @since 2023-09-19
 */
@RestController
@RequestMapping("/iov/admin")
public class AdminController {

    @Autowired
    private IAdminService adminService;

    /**
     * 管理员列表
     * @return
     */
    @GetMapping("/list")
    public List<Admin> list(){
        List<Admin> list = adminService.list();
        return list;
    }
}
