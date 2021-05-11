package com.peko.mbp.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.peko.mbp.entity.UserRole;
import org.apache.ibatis.annotations.Param;

/**
 * @author Peko
 * 使用自定义mapper
 */
public interface UserRoleMapper extends BaseMapper<UserRole> {
    /**
     * 自定义函数使用分页
     * @param page
     * @return
     */
    IPage<UserRole> myFindAll(@Param("page") Page<UserRole> page);
}
