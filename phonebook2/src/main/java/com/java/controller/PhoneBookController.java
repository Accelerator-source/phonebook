package com.java.controller;

import com.java.entity.R;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 电话簿controller
 * @Author Wangxw
 * @Date 2019/12/17 18:15
 * @Version 1.0
 */
@RestController
@RequestMapping("/phoneBook")
public class PhoneBookController {

    @RequestMapping("/loadAll")
    public R loadAll(){
        return R.ok("电话簿列表");
    }
}
