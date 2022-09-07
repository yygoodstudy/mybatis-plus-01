package com.mp;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.mp.entity.User;
import com.mp.mapper.UserMapper;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import javax.annotation.Resource;
import java.util.Date;
import java.util.List;
import java.util.Map;

/**
 * mapper单独测试
 */
@SpringBootTest
class MybatisPlus01ApplicationTests {

    @Resource
    private UserMapper userMapper;

    @Test
    void query() {
        User user = userMapper.selectById(1094590409767661570L);
        System.out.println("user = " + user);
    }

    @Test
    void add() {
        User user = new User(null, "橘子妹", 22, "juzimei@baomidou.com", 1087982257332887666L, new Date());
        int row = userMapper.insert(user);
        System.out.println("row = " + row);
        // MP插入完一条数据之后可以直接获得插入的主键
        Long id = user.getId();
        System.out.println("id = " + id);
    }

    @Test
    void update() {
        User oldUser = userMapper.selectById(1540595971325247490L);
        System.out.println("oldUser = " + oldUser);
        User user = new User(1540595971325247490L, "萧亚轩", 42, "XYX@xyx.com", 1087982257332887553L, new Date());
        int row = userMapper.updateById(user);
        if (row > 0) {
            System.out.println("更新成功~");
        } else {
            System.out.println("更新失败~");
        }

        User newUser = userMapper.selectById(1540595971325247490L);
        System.out.println("newUser = " + newUser);
    }

    @Test
    public void queryGroupBy() {
        QueryWrapper<User> wrapper = new QueryWrapper<>();
        wrapper.groupBy("manager_id");
        userMapper.selectList(wrapper).forEach(System.out::println);
    }

    @Test
    public void queryBetween() {
        QueryWrapper<User> wrapper = new QueryWrapper<>();
        wrapper.between("age", 20, 30);
        userMapper.selectList(wrapper).forEach(System.out::println);

        QueryWrapper<User> wrapper1 = new QueryWrapper<>();
        wrapper1.notBetween("age", 20, 30);
        userMapper.selectList(wrapper1).forEach(System.out::println);
    }

    @Test
    public void queryForGroupBy() {
        QueryWrapper<User> wrapper = new QueryWrapper<>();
        wrapper.select("manager_id managerId", "max(age) age").groupBy("manager_id");
        userMapper.selectList(wrapper).forEach(System.out::println);

        List<Map<String, Object>> maps = userMapper.selectMaps(wrapper);
        System.out.println(maps);
    }

    @Test
    public void testSelfMethod1(){
        List<User> maxAgeByGroup = userMapper.findMaxAgeByGroup();
        maxAgeByGroup.forEach(System.out::println);
    }

    @Test
    public void testSelfMethod2(){
        Map<String, Object> params = userMapper.findByParams(1566089046797430785L);
        System.out.println("params = " + params);
    }

}
