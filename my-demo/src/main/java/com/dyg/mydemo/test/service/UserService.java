package com.dyg.mydemo.test.service;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.dyg.mydemo.test.entity.User;

import java.util.List;

/**
 * @author Duan Yigui
 * @date 2020-05-12
 * @copyright 江西金磊科技发展有限公司 All rights reserved. Notice
 * 仅限于授权后使用，禁止非授权传阅以及私自用于商业目的
 */
public interface UserService {
    /**
     * 获取用户信息
     * @return
     */
    IPage<User> getUser(Page<User> page);
}
