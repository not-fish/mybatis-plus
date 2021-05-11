package com.peko.mbp.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

/**
 * @author Peko
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class UserRole{
    private String id;
    private String name;
    private Integer age;
    private String roleId;
}
