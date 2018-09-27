package cn.appsys.pojo;

import java.io.Serializable;
import java.util.Date;

/**
 * 创建一个后台用户列表
 * @author zxc83
 *
 */
public class Backend_User implements Serializable{
		/**
		 * 序列化实体类
		 */
		private static final long serialVersionUID = 1L;
		private int id; //编号
		private String userCode;//用户编号
		private String userName;//用户名称
		private String userPassword;//用户密码
		private int userType;//用户角色类型
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
		public String getUserCode() {
			return userCode;
		}
		public void setUserCode(String userCode) {
			this.userCode = userCode;
		}
		public String getUserName() {
			return userName;
		}
		public void setUserName(String userName) {
			this.userName = userName;
		}
		public String getUserPassword() {
			return userPassword;
		}
		public void setUserPassword(String userPassword) {
			this.userPassword = userPassword;
		}
		public int getUserType() {
			return userType;
		}
		public void setUserType(int userType) {
			this.userType = userType;
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
