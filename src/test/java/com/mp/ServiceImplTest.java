package com.mp;

import com.mp.entity.User;
import com.mp.service.UserService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.Arrays;
import java.util.Date;
import java.util.List;

/**
 * service关联mapper测试
 */
@SpringBootTest
public class ServiceImplTest {

    @Autowired
    private UserService userService;

    @Test
    void getTest() {
        User user = userService.getById(1540595971325247490L); // 通过ID查询
        System.out.println("user = " + user);
        List<User> userList = userService.list(); // 查询列表
        System.out.println("userList = " + userList);

        List<User> users = userService.listByIds(Arrays.asList(1094592041087729690L, 1540595971325247490L, 1094590409767661570L));
        System.out.println("users = " + users);
    }

    @Test
    public void testSaveOrUpdate() {

        boolean b = userService.saveOrUpdate(new User(1566103752224325633L, "林小柯", 28, "linxiaoke@xiaoke.com", 1087982257332887666L, new Date()));
        System.out.println("b = " + b);
    }
}
