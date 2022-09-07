package com.mp.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.conditions.update.UpdateWrapper;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.mp.entity.CommandCenter;
import com.mp.mapper.CommandCenterMapper;
import com.mp.service.ICommandCenterService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @Description TODO
 * @Date 2022/9/7 20:53
 */
@Service
public class ICommandCenterServiceImpl extends ServiceImpl<CommandCenterMapper, CommandCenter> implements ICommandCenterService {

    @Autowired
    private CommandCenterMapper commandCenterMapper;

    @Override
    public CommandCenter findCommandCenter(CommandCenter commandCenter) {
        QueryWrapper<CommandCenter> wrapper = new QueryWrapper<>();
        wrapper.eq("user_type_code", commandCenter.getUserTypeCode())
                .eq("type_name", commandCenter.getTypeName());
        CommandCenter center = commandCenterMapper.selectOne(wrapper);
        return center;
    }

    @Override
    public int updateCommandCenter(CommandCenter commandCenter) {
        UpdateWrapper<CommandCenter> wrapper = new UpdateWrapper<>();
        wrapper.eq("user_type_code", commandCenter.getUserTypeCode())
                .eq("type_name", commandCenter.getTypeName())
                .set("data", commandCenter.getData());
        return commandCenterMapper.update(null, wrapper);
    }
}
