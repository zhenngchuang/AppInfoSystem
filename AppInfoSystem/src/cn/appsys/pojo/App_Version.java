package cn.appsys.pojo;

import java.io.Serializable;
import java.util.Date;

/**
 * 创建一个App版本信息表
 * @author zxc83
 *
 */
public class App_Version implements Serializable{
		/**
		 * 序列化
		 */
		private static final long serialVersionUID = 1L;
		private int id;//编号
		private int appid;//来源
		private String versionNo;//版本号
		private String versionInfo;//版本介绍
		private int publishStatus;//发布状态
		private String downloadLink;//下载链接
		private Float versionSize;//版本大小
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
		public int getAppid() {
			return appid;
		}
		public void setAppid(int appid) {
			this.appid = appid;
		}
		public String getVersionNo() {
			return versionNo;
		}
		public void setVersionNo(String versionNo) {
			this.versionNo = versionNo;
		}
		public String getVersionInfo() {
			return versionInfo;
		}
		public void setVersionInfo(String versionInfo) {
			this.versionInfo = versionInfo;
		}
		public int getPublishStatus() {
			return publishStatus;
		}
		public void setPublishStatus(int publishStatus) {
			this.publishStatus = publishStatus;
		}
		public String getDownloadLink() {
			return downloadLink;
		}
		public void setDownloadLink(String downloadLink) {
			this.downloadLink = downloadLink;
		}
		public Float getVersionSize() {
			return versionSize;
		}
		public void setVersionSize(Float versionSize) {
			this.versionSize = versionSize;
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
