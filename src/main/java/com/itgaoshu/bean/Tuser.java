package com.itgaoshu.bean;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.Id;
import java.io.Serializable;
@Getter
@Setter
public class Tuser implements Serializable {
	private Integer id;//用户编号
	private String loginname;//用户名
	private String password;//密码
	private String realname;//真实姓名
	private String sex;//性别
	private String birthday;//出生日期
	private String email;//邮箱
	private Integer enabled;//是否可用
	//private String enabledStr;//文字表示是否可用
	private Integer createman;//创建人
	private Integer deptno;//所在部门编号
	//private String dname;//所在部门名称
	private String userpic;//表示上传图片路径
}
