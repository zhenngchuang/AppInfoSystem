package cn.appsys.service.AppCategory;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import cn.appsys.pojo.App_Category;

public interface AppCategoryService {
	/**
	 * 根据父节点parentId获取相应的分类列表
	 * @param parentId
	 * @return
	 */
	public List<App_Category> getAppCategoryListByParentId(Integer parentId);
	
}
