package com.itgaoshu.mapper;

import com.itgaoshu.bean.Tuser;
import org.apache.ibatis.annotations.Select;
import tk.mybatis.mapper.common.Mapper;

/**
 * @author 曹小花
 * @Title: UserMapper
 * @Description: 自定义UserMapper接口继承tk.mybatis.mapper.common.Mapper<T>,泛型:UserMapper接口操作表对应实体类
 *                 接口中无需定义方法也不需要对应的Mapper.xml,泛型的实体类需要实现序列化接口
 * @date 2020/7/20 0020 17:01
 */
//@Mapper
public interface UserMapper extends Mapper<Tuser> {

}
