package com.mp.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.mp.entity.CommandCenter;

public interface ICommandCenterService extends IService<CommandCenter> {
    CommandCenter findCommandCenter(CommandCenter commandCenter);

    int updateCommandCenter(CommandCenter commandCenter);
}
