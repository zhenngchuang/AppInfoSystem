package cn.appsys.service.AppCategory;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import cn.appsys.pojo.App_Category;

public interface AppCategoryService {
	/**
	 * ���ݸ��ڵ�parentId��ȡ��Ӧ�ķ����б�
	 * @param parentId
	 * @return
	 */
	public List<App_Category> getAppCategoryListByParentId(Integer parentId);
	
}
