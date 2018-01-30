package com.sunvins.model;

public class DataDictVO {
	private int cid; // cid
	private String fieldType; // 字段类型
	private String fieldName; // 字段名
	private String fieldCode; // 字段码值
	private String fieldValue; // 字段值

	public int getCid() {
		return cid;
	}
	
	public void setCid(int cid) {
		this.cid = cid;
	}
	
	public String getFieldType() {
		return fieldType;
	}
	
	public void setFieldType(String fieldType) {
		this.fieldType = fieldType;
	}
	
	public String getFieldName() {
		return fieldName;
	}
	
	public void setFieldName(String fieldName) {
		this.fieldName = fieldName;
	}
	
	public String getFieldCode() {
		return fieldCode;
	}
	
	public void setFieldCode(String fieldCode) {
		this.fieldCode = fieldCode;
	}
	
	public String getFieldValue() {
		return fieldValue;
	}
	
	public void setFieldValue(String fieldValue) {
		this.fieldValue = fieldValue;
	}
	
}