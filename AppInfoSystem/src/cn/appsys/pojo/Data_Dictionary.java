package cn.appsys.pojo;

import java.io.Serializable;
import java.util.Date;

/**
 * ����һ�������ֵ��
 * @author zxc83
 *
 */
public class Data_Dictionary implements Serializable{
		/**
		 * ���л�
		 */
		private static final long serialVersionUID = 1L;
		private int id ;//���
		private String typeCode;//���ͱ���
		private String typeName;//��������
		private int valueId;//����ֵID
		private String valueName;//����ֵ����
		private int createdBy;//����ʱ��
		private Date creationDate;//����ʱ��
		private int modifyBy;//�޸���
		private Date modifyDate;//����޸�ʱ��
		public int getId() {
			return id;
		}
		public void setId(int id) {
			this.id = id;
		}
		public String getTypeCode() {
			return typeCode;
		}
		public void setTypeCode(String typeCode) {
			this.typeCode = typeCode;
		}
		public String getTypeName() {
			return typeName;
		}
		public void setTypeName(String typeName) {
			this.typeName = typeName;
		}
	
		public int getValueId() {
			return valueId;
		}
		public void setValueId(int valueId) {
			this.valueId = valueId;
		}
		public String getValueName() {
			return valueName;
		}
		public void setValueName(String valueName) {
			this.valueName = valueName;
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
