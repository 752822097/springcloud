package com.dyg.mydemo.test.service.impl;


import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.dyg.mydemo.test.entity.User;
import com.dyg.mydemo.test.mapper.UserMapper;
import com.dyg.mydemo.test.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author Duan Yigui
 * @date 2020-05-12
 */
@Service
@RequiredArgsConstructor
public class UserServiceImpl implements UserService {

    private final UserMapper userMapper;

    @Override
    public IPage<User> getUser(Page<User> page) {
        System.out.println("service");

        return userMapper.getUser(page);
    }
}
