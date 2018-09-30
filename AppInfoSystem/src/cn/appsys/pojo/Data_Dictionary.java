package cn.appsys.pojo;

import java.io.Serializable;
import java.util.Date;

/**
 * 创建一个数据字典表
 * @author zxc83
 *
 */
public class Data_Dictionary implements Serializable{
		/**
		 * 序列化
		 */
		private static final long serialVersionUID = 1L;
		private int id ;//编号
		private String typeCode;//类型编码
		private String typeName;//类型名称
		private int valueId;//类型值ID
		private String valueName;//类型值名称
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
