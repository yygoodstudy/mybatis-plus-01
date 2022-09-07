package com.mp.controller;

import com.mp.entity.CommandCenter;
import com.mp.service.ICommandCenterService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Description TODO
 * @Date 2022/9/7 21:03
 */
@RestController
@RequestMapping("/command_center")
public class CommandCenterController {

    @Autowired
    private ICommandCenterService commandCenterService;

    @PostMapping("/select")
    public CommandCenter findCommandCenter(@RequestBody CommandCenter commandCenter) {
        return commandCenterService.findCommandCenter(commandCenter);
    }

    @PostMapping("/update")
    public int updateCommandCenter(@RequestBody CommandCenter commandCenter){
        return commandCenterService.updateCommandCenter(commandCenter);
    }
}
