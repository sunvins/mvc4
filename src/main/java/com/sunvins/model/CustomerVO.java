package com.sunvins.model;
import java.util.Date;

public class CustomerVO {
	private int cid; // cid
	private String userId; // 登录id
	private String userName; // 用户名
	private double pay; // 工资
	private String userPass; // 密码
	private Date birthDay; // 生日

	public int getCid() {
		return cid;
	}
	
	public void setCid(int cid) {
		this.cid = cid;
	}
	
	public String getUserId() {
		return userId;
	}
	
	public void setUserId(String userId) {
		this.userId = userId;
	}
	
	public String getUserName() {
		return userName;
	}
	
	public void setUserName(String userName) {
		this.userName = userName;
	}
	
	public double getPay() {
		return pay;
	}
	
	public void setPay(double pay) {
		this.pay = pay;
	}
	
	public String getUserPass() {
		return userPass;
	}
	
	public void setUserPass(String userPass) {
		this.userPass = userPass;
	}
	
	public Date getBirthDay() {
		return birthDay;
	}
	
	public void setBirthDay(Date birthDay) {
		this.birthDay = birthDay;
	}
	
}