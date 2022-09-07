package com.mp.entity;


import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

// MP默认使用pojo类名作为表名，如果表名和类名不一致，可以使用@TableName作为表名
@Data
@AllArgsConstructor
@NoArgsConstructor
@TableName("t_user")
public class User {
    // IdType.ASSIGN_ID：指定id的生成策略-全局不唯一
    @TableId(value = "id", type = IdType.ASSIGN_ID)
    private Long id;
    private String name;
    private Integer age;
    private String email;
    @TableField("manager_id") // 当数据库列名与实体类属性名不一致时指定
    private Long managerId;
    @TableField("create_time")
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private Date createTime;
}
