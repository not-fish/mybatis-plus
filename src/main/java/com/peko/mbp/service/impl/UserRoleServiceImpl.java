package com.peko.mbp.service.impl;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.peko.mbp.mapper.UserRoleMapper;
import com.peko.mbp.entity.UserRole;
import com.peko.mbp.service.UserRoleService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @author Peko
 */
@Service
public class UserRoleServiceImpl extends ServiceImpl<UserRoleMapper, UserRole> implements
        UserRoleService {

    @Resource
    private UserRoleMapper userRoleMapper;

    @Override
    public IPage<UserRole> myFindAll(Page<UserRole> page) {
        return userRoleMapper.myFindAll(page);
    }
}
