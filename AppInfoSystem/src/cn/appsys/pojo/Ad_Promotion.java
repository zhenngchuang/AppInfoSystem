package cn.appsys.pojo;

import java.io.Serializable;
import java.util.Date;

/**
 * 创建一个广告信息表
 * @author zxc83
 *
 */
public class Ad_Promotion implements Serializable{
		/**
		 * 序列化
		 */
		private static final long serialVersionUID = 1L;
		private int id ;//编号
		private int appld;// APPid编号
		private String adPicPath;//广告图片存储路径
		private int adPV;//广告点击量
		private int carouselPosition;//轮播位
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
		public int getAppld() {
			return appld;
		}
		public void setAppld(int appld) {
			this.appld = appld;
		}
		public String getAdPicPath() {
			return adPicPath;
		}
		public void setAdPicPath(String adPicPath) {
			this.adPicPath = adPicPath;
		}
		public int getAdPV() {
			return adPV;
		}
		public void setAdPV(int adPV) {
			this.adPV = adPV;
		}
		public int getCarouselPosition() {
			return carouselPosition;
		}
		public void setCarouselPosition(int carouselPosition) {
			this.carouselPosition = carouselPosition;
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
