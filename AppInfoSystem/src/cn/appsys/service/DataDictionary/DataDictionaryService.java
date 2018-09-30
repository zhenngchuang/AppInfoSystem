package cn.appsys.service.DataDictionary;

import java.util.List;

import cn.appsys.pojo.Data_Dictionary;

public interface DataDictionaryService {
	/**
	 * 根据typeCode查询相应的数据字典列表
	 * @param typeCode
	 * @return
	 */
	public List<Data_Dictionary> getDataDictionaryList(String typeCode);

}
