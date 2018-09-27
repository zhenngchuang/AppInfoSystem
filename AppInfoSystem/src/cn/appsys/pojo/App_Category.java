package cn.appsys.pojo;

import java.io.Serializable;
import java.util.Date;

/**
 * 创建一个APP分类表
 * @author zxc83
 *
 */
public class App_Category  implements Serializable{
	/**
	 * 序列化
	 */
	private static final long serialVersionUID = 1L;
	private int id;//主键ID
	private String categoryCode;//分类编码
	private String categoryName;//分类名称
	private int parentld;//父级节点
	private int createdBy;//创建时间
	private Date creationDate;//创建时间
	private int modifyBy;//修改者
	private Date modifyDate;//最后修改时间
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getCategoryCode() {
		return categoryCode;
	}
	public void setCategoryCode(String categoryCode) {
		this.categoryCode = categoryCode;
	}
	public String getCategoryName() {
		return categoryName;
	}
	public void setCategoryName(String categoryName) {
		this.categoryName = categoryName;
	}
	public int getParentld() {
		return parentld;
	}
	public void setParentld(int parentld) {
		this.parentld = parentld;
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
	public int getModifyBy() {
		return modifyBy;
	}
	public void setModifyBy(int modifyBy) {
		this.modifyBy = modifyBy;
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
