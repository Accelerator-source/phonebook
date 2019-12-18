package com.java.mapper;

import com.java.entity.AdminEntity;

/**
 *  管理员Mapper接口
 * @author Wangxw
 * @date 2019-12-17 11:46
 */
public interface AdminMapper {

    /**
     *  用户登录
     * @author Wangxw
     * @param  admin 管理员实体
     * @date 2019-12-17 12:11
     * @return AdminEntity 管理员实体
     */
    AdminEntity login(AdminEntity admin);
}
