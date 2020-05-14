package com.dyg.mydemo.test.controller;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.dyg.mydemo.test.entity.User;
import com.dyg.mydemo.test.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Duan Yigui
 * @date 2020-05-12
 */
@RestController
@RequiredArgsConstructor
@RequestMapping("/")
public class UserController {

    private final UserService userService;

    /**
     * 查询
     * @param page：{current：1，size：2}
     * @return
     */
    @GetMapping("/getUser")
    public IPage<User> getUser(Page<User> page){
        IPage<User> ipage=userService.getUser(page);
        return ipage;
    }


}
