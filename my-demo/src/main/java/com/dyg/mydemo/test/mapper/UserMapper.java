package com.dyg.mydemo.test.mapper;


import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.dyg.mydemo.test.entity.User;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * @author Duan Yigui
 * @date 2020-05-11
 */
@Mapper
public interface UserMapper extends BaseMapper<User> {

    /**
     * 获取用户测试
     * @return
     */
    IPage<User> getUser(Page<User> page);
}
