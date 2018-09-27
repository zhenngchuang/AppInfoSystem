package cn.appsys.pojo;

import java.io.Serializable;
import java.util.Date;

/**
 * 创建一个版本基础信息表
 * @author zxc83
 *
 */
public class App_Info implements Serializable{
		/**
		 * 序列化
		 */
		private static final long serialVersionUID = 1L;
		private int id;//APP编号
		private String softwareName;//软件名称
		private String APKName;//APK名称
		private String supportRom;//支持ROM
		private String interfaceLanguage;//界面语言
		private  Float softwareSize;//软件大小
		private Date updateDate;//更新时间
		private int devld;//开发者ID
		private String appinfo;//应用简介
		private int status;//当前状态
		private Date inSaleDate;//上架时间
		private Date offSaleDate;//下架时间
		private int flatformld;//所属平台
		private int categoryLevel3;//所属三级分类
		private int downloads;//下载量
		private int createdBy;//创建时间
		private Date creationDate;//创建时间
		private int modifyBy;//修改者
		private Date modifyDate;//最后修改时间
		private int categoryLevel1;//所属一级分类
		private int categoryLevel2;//所属二级分类
		private String logoPicPath;//Logo图片url地址
		private String logoLocPath;//LOGo图片存放位置
		private int versionld;//最新版本ID
		public int getId() {
			return id;
		}
		public void setId(int id) {
			this.id = id;
		}
		public String getSoftwareName() {
			return softwareName;
		}
		public void setSoftwareName(String softwareName) {
			this.softwareName = softwareName;
		}
		public String getAPKName() {
			return APKName;
		}
		public void setAPKName(String aPKName) {
			APKName = aPKName;
		}
		public String getSupportRom() {
			return supportRom;
		}
		public void setSupportRom(String supportRom) {
			this.supportRom = supportRom;
		}
		public String getInterfaceLanguage() {
			return interfaceLanguage;
		}
		public void setInterfaceLanguage(String interfaceLanguage) {
			this.interfaceLanguage = interfaceLanguage;
		}
		public Float getSoftwareSize() {
			return softwareSize;
		}
		public void setSoftwareSize(Float softwareSize) {
			this.softwareSize = softwareSize;
		}
		public Date getUpdateDate() {
			return updateDate;
		}
		public void setUpdateDate(Date updateDate) {
			this.updateDate = updateDate;
		}
		public int getDevld() {
			return devld;
		}
		public void setDevld(int devld) {
			this.devld = devld;
		}
		public String getAppinfo() {
			return appinfo;
		}
		public void setAppinfo(String appinfo) {
			this.appinfo = appinfo;
		}
		public int getStatus() {
			return status;
		}
		public void setStatus(int status) {
			this.status = status;
		}
		public Date getInSaleDate() {
			return inSaleDate;
		}
		public void setInSaleDate(Date inSaleDate) {
			this.inSaleDate = inSaleDate;
		}
		public Date getOffSaleDate() {
			return offSaleDate;
		}
		public void setOffSaleDate(Date offSaleDate) {
			this.offSaleDate = offSaleDate;
		}
		public int getFlatformld() {
			return flatformld;
		}
		public void setFlatformld(int flatformld) {
			this.flatformld = flatformld;
		}
		public int getCategoryLevel3() {
			return categoryLevel3;
		}
		public void setCategoryLevel3(int categoryLevel3) {
			this.categoryLevel3 = categoryLevel3;
		}
		public int getDownloads() {
			return downloads;
		}
		public void setDownloads(int downloads) {
			this.downloads = downloads;
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
		public int getCategoryLevel1() {
			return categoryLevel1;
		}
		public void setCategoryLevel1(int categoryLevel1) {
			this.categoryLevel1 = categoryLevel1;
		}
		public int getCategoryLevel2() {
			return categoryLevel2;
		}
		public void setCategoryLevel2(int categoryLevel2) {
			this.categoryLevel2 = categoryLevel2;
		}
		public String getLogoPicPath() {
			return logoPicPath;
		}
		public void setLogoPicPath(String logoPicPath) {
			this.logoPicPath = logoPicPath;
		}
		public String getLogoLocPath() {
			return logoLocPath;
		}
		public void setLogoLocPath(String logoLocPath) {
			this.logoLocPath = logoLocPath;
		}
		public int getVersionld() {
			return versionld;
		}
		public void setVersionld(int versionld) {
			this.versionld = versionld;
		}
		public static long getSerialversionuid() {
			return serialVersionUID;
		}
		
		
		
}
