package com.peko.mbp.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;
import lombok.experimental.Accessors;

/**
 * @author Peko
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Accessors(chain = true)
//将实体类与数据库表做映射
@TableName(value = "user")
public class User {
    @TableId(value = "id",type = IdType.AUTO)
    private String id;
    @TableField(value = "name")
    private String name;
    @TableField(value = "age")
    private Integer age;

    //不与数据库表做映射
    @TableField(exist = false)
    private String noExist;
}
