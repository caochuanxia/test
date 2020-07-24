package com.itgaoshu.service.impl;

import com.itgaoshu.bean.Tuser;
import com.itgaoshu.mapper.UserMapper;
import com.itgaoshu.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author 曹小花
 * @Title: UserServiceImpl
 * @Description: SpringCloudAlibaba课程
 * @date 2020/7/20 0020 17:02
 */
@Service
public class UserServiceImpl implements UserService {
    //依赖注入Mapper层对象
    @Autowired
    private UserMapper userMapper;

    /**
     * 为此注解指定value属性值,此value属性值表示在缓存区域中开启的缓存的名称空间
     * 并且将方法中的数据存储到该缓存中
     * @return
     */
    @Cacheable("selectUserList")
    public List<Tuser> selectUserList() {
        System.out.println("如果这段文字第二次不会被打印出来,说明就是从缓存中查询的数据");
        return userMapper.selectAll();
    }
}
