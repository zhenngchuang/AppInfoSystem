package cn.appsys.service.DataDictionary;

import java.util.List;

import cn.appsys.pojo.Data_Dictionary;

public interface DataDictionaryService {
	/**
	 * ����typeCode��ѯ��Ӧ�������ֵ��б�
	 * @param typeCode
	 * @return
	 */
	public List<Data_Dictionary> getDataDictionaryList(String typeCode);

}
