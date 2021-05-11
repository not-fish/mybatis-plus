package com.peko.mbp.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.peko.mbp.entity.User;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import java.util.List;

/**
 * @author Peko
 * 这里使用的是自带的mapper
 */
public interface UserMapper extends BaseMapper<User> {
    @Select("Select * from user where id = #{id}")
    List<User> selfFind(@Param("id") String id);
}
