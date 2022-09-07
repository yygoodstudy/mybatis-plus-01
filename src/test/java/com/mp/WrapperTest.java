package com.mp;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.mp.entity.User;
import com.mp.service.UserService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

@SpringBootTest
public class WrapperTest {
    @Autowired
    private UserService userService;


    /**
     * 通过单个主键ID进行查询
     */
    @Test
    public void getById() {
        User user = userService.getById(1094592041087729666L);
        System.out.println("user = " + user);
    }

    /**
     * 通过多个主键ID批量查询
     */
    @Test
    public void selectByIdBatch() {
        List<Long> ids = Arrays.asList(1094592041087729690L, 1540595971325247490L, 1094592041087729666L);
        List<User> userList = userService.listByIds(ids);
        System.out.println("userList = " + userList);
    }

    /**
     * 通过listByMap方法传入参数Map查询List
     */
    @Test
    public void selectByMap() {
        HashMap<String, Object> paramMap = new HashMap<>();
        paramMap.put("name", "王心凌");
//        paramMap.put("email", "sdfsf@qq.com");
        List<User> userList = userService.listByMap(paramMap);
        for (User user : userList) {                
            System.out.println(user);
        }
    }

    @Test
    public void selectByQueryWrapper() {
        QueryWrapper<User> queryWrapper = new QueryWrapper<>();
        QueryWrapper<User> wrapper = queryWrapper.like("name", "王")
                .eq("age", 36);
        List<User> users = userService.list(wrapper);
        for (User user : users) {
            System.out.println(user);
        }
    }
}
