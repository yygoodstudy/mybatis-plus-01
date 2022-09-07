package com.mp.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.mp.entity.User;

import java.util.List;
import java.util.Map;

public interface UserMapper extends BaseMapper<User> {
    IPage<User> selectPage(IPage<User> page, Integer state);

    List<User> findMaxAgeByGroup();

    Map<String, Object> findByParams(Long id);

}
