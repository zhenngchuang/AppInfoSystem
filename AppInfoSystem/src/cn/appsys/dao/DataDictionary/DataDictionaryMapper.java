package cn.appsys.dao.DataDictionary;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import cn.appsys.pojo.Data_Dictionary;

public interface DataDictionaryMapper {
	/**
	 * 获取Data_Dictionary集合
	 * @param typeCode
	 * @return
	 */
	public List<Data_Dictionary> getDataDictionaryList(@Param("typeCode")String typeCode);

}
