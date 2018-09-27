package cn.appsys.pojo;

import java.io.Serializable;
import java.util.Date;

/**
 * 序列化实体类
 */
public class Dev_User implements Serializable{
	private static final long serialVersionUID = 1L;
	//创建一个开发者用户表
	private int id; //编号
	private String devCode;//开发者账号
	private String devName;//开发者姓名
	private String devPassword;//开发者密码
	private String devEmail;//邮箱
	private int createdBy;//创建编号
	private Date creationDate;//创建时间
	private int modifBy;//修改人编号
	private Date modifyDate;//修改时间
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getDevCode() {
		return devCode;
	}
	public void setDevCode(String devCode) {
		this.devCode = devCode;
	}
	public String getDevName() {
		return devName;
	}
	public void setDevName(String devName) {
		this.devName = devName;
	}
	public String getDevPassword() {
		return devPassword;
	}
	public void setDevPassword(String devPassword) {
		this.devPassword = devPassword;
	}
	public String getDevEmail() {
		return devEmail;
	}
	public void setDevEmail(String devEmail) {
		this.devEmail = devEmail;
	}
	public int getCreatedBy() {
		return createdBy;
	}
	public void setCreatedBy(int createdBy) {
		this.createdBy = createdBy;
	}
	public Date getCreationDate() {
		return creationDate;
	}
	public void setCreationDate(Date creationDate) {
		this.creationDate = creationDate;
	}
	public int getModifBy() {
		return modifBy;
	}
	public void setModifBy(int modifBy) {
		this.modifBy = modifBy;
	}
	public Date getModifyDate() {
		return modifyDate;
	}
	public void setModifyDate(Date modifyDate) {
		this.modifyDate = modifyDate;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	
	
	
	
}
