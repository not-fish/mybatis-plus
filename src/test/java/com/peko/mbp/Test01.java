package com.peko.mbp;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.peko.mbp.mapper.UserMapper;
import com.peko.mbp.entity.User;
import com.peko.mbp.entity.UserRole;
import com.peko.mbp.service.UserRoleService;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author Peko
 */
@SpringBootTest
public class Test01 {

    @Resource
    private UserMapper userMapper;

    @Resource
    private UserRoleService userRoleService;

    /**
     * 查询所有（MybatisPlus自带）
     */
    @Test
    public void testFindAll(){
        List<User> users = userMapper.selectList(null);
        users.forEach(System.out::println);
    }

    /**
     * 条件查询（MybatisPlus自带）
     */
    @Test
    public void testFind(){
        QueryWrapper<User> queryWrapper = new QueryWrapper<>();
        //等值查询（小于 lt,小于等于 le,大于 gt,大于等于 ge）
        queryWrapper.eq("age",7);

        List<User> users = userMapper.selectList(queryWrapper);
        users.forEach(System.out::println);
    }

    /**
     * 模糊查询（MybatisPlus自带）
     */
    @Test
    public void testFindLike(){
        QueryWrapper<User> queryWrapper = new QueryWrapper<>();
        queryWrapper.like("name","2");
        List<User> users = userMapper.selectList(queryWrapper);
        users.forEach(System.out::println);
    }

    /**
     * 保存（MybatisPlus自带）
     */
    @Test
    public void testSave(){
        User entity = new User();
        entity.setName("zz").setAge(12);
        userMapper.insert(entity);
    }

    /**
     * 修改（MybatisPlus自带）
     */
    @Test
    public void testUpdateById(){
        User entity = userMapper.selectById("10");
        entity.setName("ac").setAge(13);
        userMapper.updateById(entity);
    }

    /**
     * 批量修改（MybatisPlus自带）
     */
    @Test
    public void testUpdate(){
        User entity = new User();
        //要修改什么属性就设置什么属性
        entity.setName("bcddee");
        QueryWrapper<User> queryWrapper = new QueryWrapper<>();
        //设置条件
        queryWrapper.eq("age",13);
        userMapper.update(entity,queryWrapper);
    }

    /**
     * 删除（MybatisPlus自带）
     */
    @Test
    public void testDeleteById(){
        userMapper.deleteById("19");
    }

    /**
     * 批量删除（MybatisPlus自带）
     */
    @Test
    public void testDelete(){
        QueryWrapper<User> queryWrapper = new QueryWrapper<>();
        queryWrapper.eq("age",15);
        userMapper.delete(queryWrapper);
    }

    /**
     * 查询（注解方式自定义sql）
     */
    @Test
    public void testSeleSql(){
        List<User> lists =  userMapper.selfFind("1");
        System.out.println(lists);
    }

    /**
     *  分页查询
     *  （需要配置分页拦截器，这里配置了 config包下的MybatisPlusConfig）
     *  注意：这里使用的分页的方法的基础是要使用mybatisplus下的查询函数，对于连接查询的操作是不支持的
     */
    @Test
    public void testFindPage(){
        //参数1：当前页（默认值为1）  参数2：每页显示记录数（默认值为10）
        Page<User> page = new Page<>(1,2);
        IPage<User> userIPage = userMapper.selectPage(page,null);
        System.out.println("总记录数："+userIPage.getTotal());
        userIPage.getRecords().forEach(System.out::println);
    }

    /**
     * 分页查询（自定义mapper.xml使用）
     */
    @Test
    public void testMyFindPage(){
        //参数1：当前页（默认值为1）  参数2：每页显示记录数（默认值为10）
        Page<UserRole> page = new Page<>(1,2);
        IPage<UserRole> userIPage = userRoleService.myFindAll(page);
        System.out.println("总记录数："+userIPage.getTotal());
        userIPage.getRecords().forEach(System.out::println);
    }


}
