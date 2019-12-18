package com.java.controller;

import com.java.constant.SystemConstant;
import com.java.entity.AdminEntity;
import com.java.entity.R;
import com.java.service.AdminService;
import com.java.util.JwtUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *  管理员登录controller
 * @Author Wangxw
 * @Date 2019/12/17 12:28
 * @Version 1.0
 */
@RestController
@RequestMapping("/")
public class AdminController {

    @Autowired
    private AdminService adminService;

    /**
     *   管理员登录
     * @author Wangxw
     * @param  * @Param: null
     * @date 2019-12-17 12:29
     * @return String
     */
    @RequestMapping("/login")
    public R login(@RequestBody AdminEntity adminEntity){
        R r = new R();
        AdminEntity admin = adminService.login(adminEntity);
        if(admin == null){
            return R.error("用户名或密码错误");
        }else{
            String token = JwtUtils.createJWT(admin.getId().toString(), admin.getUserName(), SystemConstant.JWT_TTL);
            r.put("token",token);
            return r;
        }
    }
}
