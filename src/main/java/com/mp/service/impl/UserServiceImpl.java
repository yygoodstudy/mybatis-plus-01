package com.mp.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.mp.entity.User;
import com.mp.mapper.UserMapper;
import com.mp.service.UserService;
import org.springframework.stereotype.Service;

/**
 * Service实现类需要继承MP提供的通用的service基类 ServiceImpl
 * 需要给ServiceImpl<T,M>传入两个泛型
 * 泛型
 * 1.UserMapper mapper接口
 * 2.实体类 User
 */
@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, User> implements UserService {
}
