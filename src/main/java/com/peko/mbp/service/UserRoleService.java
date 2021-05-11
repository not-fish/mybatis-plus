package com.peko.mbp.service;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.IService;
import com.peko.mbp.entity.UserRole;
import org.apache.ibatis.annotations.Param;

/**
 * @author Peko
 */
public interface UserRoleService extends IService<UserRole> {
    /**
     * 自定义函数使用分页
     * @param page
     * @return
     */
    IPage<UserRole> myFindAll(@Param("page") Page<UserRole> page);
}
