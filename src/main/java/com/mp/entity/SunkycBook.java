package com.mp.entity;


import com.baomidou.mybatisplus.annotation.*;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;


/**
 * <p>
 * 权限图书测试数据
 * </p>
 *
 * @author sunkyc
 * @since 2022-06-10
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
@TableName("sunkyc_book")
//@ApiModel(value = "SunkycBook对象", description = "权限图书测试数据")
public class SunkycBook {

    private static final long serialVersionUID = 1L;

    //    @ApiModelProperty(value = "主键")
    @TableId(value = "book_id", type = IdType.AUTO)
    private Long bookId;

    //    @ApiModelProperty(value = "图书名称")
//    @NotBlank(message = "图书名称不能为空")
    private String bookName;


    private String bookAuthro;


    private String bookIsbn;


    private String bookCbs;


    private String bookCbTime;


    private String bookPic;


    private String bookPages;

    /**
     * 填充字段，主要为了权限测试前端视图区分
     */
    @TableField(exist = false)
    private String createByStr;


}
