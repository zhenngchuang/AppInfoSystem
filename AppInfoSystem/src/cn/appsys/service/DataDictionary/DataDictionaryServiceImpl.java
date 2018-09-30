package cn.appsys.service.DataDictionary;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import cn.appsys.dao.DataDictionary.DataDictionaryMapper;
import cn.appsys.pojo.Data_Dictionary;
@Service
public class DataDictionaryServiceImpl implements DataDictionaryService {
	@Resource
	private DataDictionaryMapper dataDictionaryMapper;
	@Override
	/**
	 * 
	 * 根据传入的名称获取数据字典类型
	 */
	public List<Data_Dictionary> getDataDictionaryList(String typeCode) {
		
		return dataDictionaryMapper.getDataDictionaryList(typeCode);
	}

}
