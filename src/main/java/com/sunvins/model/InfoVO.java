package com.sunvins.model;
import java.util.Date;

public class InfoVO {
	private int cid; // cid
	private String title; // 标题
	private String content; // 内容
	private Date createDttm; // 创建时间
	private Date updateDttm; // 更新时间

	public int getCid() {
		return cid;
	}
	
	public void setCid(int cid) {
		this.cid = cid;
	}
	
	public String getTitle() {
		return title;
	}
	
	public void setTitle(String title) {
		this.title = title;
	}
	
	public String getContent() {
		return content;
	}
	
	public void setContent(String content) {
		this.content = content;
	}
	
	public Date getCreateDttm() {
		return createDttm;
	}
	
	public void setCreateDttm(Date createDttm) {
		this.createDttm = createDttm;
	}
	
	public Date getUpdateDttm() {
		return updateDttm;
	}
	
	public void setUpdateDttm(Date updateDttm) {
		this.updateDttm = updateDttm;
	}
	
}