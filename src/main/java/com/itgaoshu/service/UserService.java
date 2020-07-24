package com.itgaoshu.service;

import com.itgaoshu.bean.Tuser;

import java.util.List;

/**
 * @author 曹小花
 * @Title: UserService
 * @Description: SpringCloudAlibaba课程
 * @date 2020/7/20 0020 17:01
 */
public interface UserService {

    public List<Tuser> selectUserList();
}
