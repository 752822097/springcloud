package com.dyg.mydemo;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.dyg.mydemo.test.entity.User;
import com.dyg.mydemo.test.mapper.UserMapper;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;
@RunWith(SpringRunner.class)
@SpringBootTest
class MyDemoApplicationTests {

//    @Test
//    public void test2() {
//        System.out.println(("----- selectAll method test ------"));
//        List<User> userList = BaseMapper.selectList(null);
//        userList.forEach(System.out::println);
//    }

}
