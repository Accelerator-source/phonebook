package com.java.service.impl;

import com.java.entity.AdminEntity;
import com.java.mapper.AdminMapper;
import com.java.service.AdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *  管理员登录service实现类
 * @Author Wangxw
 * @Date 2019/12/17 12:21
 * @Version 1.0
 */
@Service("adminService")
public class AdminServiceImpl implements AdminService {

    @Autowired
    private AdminMapper adminMapper;


    @Override
    public AdminEntity login(AdminEntity admin) {
        return adminMapper.login(admin);
    }
}
