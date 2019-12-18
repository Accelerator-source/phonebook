package com.java.service;

import com.java.entity.AdminEntity;

/**
 *  管理员登录service
 * @author Wangxw
 * @date 2019-12-17 12:15
 */
public interface AdminService {
    
    /**
     *  管理员登录
     * @author Wangxw
     * @param  admin 管理员实体
     * @date 2019-12-17 12:15
     * @return AdminEntity 管理员实体
     */
    public AdminEntity login(AdminEntity admin);
}
