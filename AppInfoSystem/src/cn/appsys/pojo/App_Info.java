package cn.appsys.pojo;

import java.io.Serializable;
import java.util.Date;

/**
 * ����һ���汾������Ϣ��
 * @author zxc83
 *
 */
public class App_Info implements Serializable{
		/**
		 * ���л�
		 */
		private static final long serialVersionUID = 1L;
		private int id;//APP���
		private String softwareName;//�������
		private String APKName;//APK����
		private String supportROM;//֧��ROM
		private String interfaceLanguage;//��������
		private  Float softwareSize;//�����С
		private Date updateDate;//����ʱ��
		private int devId;//������ID
		private String appInfo;//Ӧ�ü��
		private int status;//��ǰ״̬
		private Date inSaleDate;//�ϼ�ʱ��
		private Date offSaleDate;//�¼�ʱ��
		private int flatformId;//����ƽ̨
		private String flatformName;//ƽ̨����
		private int categoryLevel3;//������������
		private int downloads;//������
		private int createdBy;//����ʱ��
		private Date creationDate;//����ʱ��
		private int modifyBy;//�޸���
		private Date modifyDate;//����޸�ʱ��
		private int categoryLevel1;//����һ������
		private int categoryLevel2;//������������
		private String logoPicPath;//LogoͼƬurl��ַ
		private String logoLocPath;//LOGoͼƬ���λ��
		private int versionId;//���°汾ID
		private String categoryLevel1Name;//һ����������
		private String categoryLevel2Name;//������������
		private String categoryLevel3Name;//������������
		private String statusName;//״̬����
		private String versionNo;//�汾��
		
	
		public String getVersionNo() {
			return versionNo;
		}
		public void setVersionNo(String versionNo) {
			this.versionNo = versionNo;
		}
		public String getStatusName() {
			return statusName;
		}
		public void setStatusName(String statusName) {
			this.statusName = statusName;
		}
		public String getCategoryLevel1Name() {
			return categoryLevel1Name;
		}
		public void setCategoryLevel1Name(String categoryLevel1Name) {
			this.categoryLevel1Name = categoryLevel1Name;
		}
		public String getCategoryLevel2Name() {
			return categoryLevel2Name;
		}
		public void setCategoryLevel2Name(String categoryLevel2Name) {
			this.categoryLevel2Name = categoryLevel2Name;
		}
		public String getCategoryLevel3Name() {
			return categoryLevel3Name;
		}
		public void setCategoryLevel3Name(String categoryLevel3Name) {
			this.categoryLevel3Name = categoryLevel3Name;
		}
		public String getFlatformName() {
			return flatformName;
		}
		public void setFlatformName(String flatformName) {
			this.flatformName = flatformName;
		}
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
		public int getFlatformId() {
			return flatformId;
		}
		public void setFlatformId(int flatformId) {
			this.flatformId = flatformId;
		}
	
		public String getSupportROM() {
			return supportROM;
		}
		public void setSupportROM(String supportROM) {
			this.supportROM = supportROM;
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
	
		public int getDevId() {
			return devId;
		}
		public void setDevId(int devId) {
			this.devId = devId;
		}
		public String getAppInfo() {
			return appInfo;
		}
		public void setAppInfo(String appInfo) {
			this.appInfo = appInfo;
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
	
		public int getVersionId() {
			return versionId;
		}
		public void setVersionId(int versionId) {
			this.versionId = versionId;
		}
		public static long getSerialversionuid() {
			return serialVersionUID;
		}
		
		
		
}
