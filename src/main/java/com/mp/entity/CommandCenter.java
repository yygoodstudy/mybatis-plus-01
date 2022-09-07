package com.mp.entity;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @Description TODO
 * @Date 2022/9/6 20:55
 */
@Data
@TableName("t_command_center")
@AllArgsConstructor
@NoArgsConstructor
public class CommandCenter {
    @TableId
    private Integer id;
    @TableField("user_type_code")
    private Integer userTypeCode;
    @TableField("type_name")
    private String typeName;
    private String data;
}
