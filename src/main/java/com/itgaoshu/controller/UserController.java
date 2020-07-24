package com.itgaoshu.controller;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.itgaoshu.bean.Tuser;
import com.itgaoshu.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author 曹小花
 * @Title: UserController
 * @Description: SpringCloudAlibaba课程
 * @date 2020/7/20 0020 16:57
 */
@Controller
//@RestController //包含@Controller+@ResponseBody,自动返回json数据
public class UserController {
    @Autowired
    private UserService userService;
    @RequestMapping("/test.do")
    public String test(){

        return "index";
    }

    @RequestMapping("/selectUserList.do")
    public String selectUserList(@RequestParam(required = true,defaultValue = "1") int pageNum, Model model){
        //设置分页查询的数据:分页查询需要的当前页数和每页查询多少条数据
        PageHelper.startPage(pageNum,2);
        //进行查询
        List<Tuser> tusers = userService.selectUserList();
        //将分页查询结果封装到pageInfo,因为pageInfo中还封装了关于分页的其他参数
        PageInfo<Tuser> pageInfo=new PageInfo<>(tusers);
        model.addAttribute("pageInfo",pageInfo);
        return "list1";
    }
}
