package cn.appsys.dao.AppCategory;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import cn.appsys.pojo.App_Category;

public interface AppCategoryMapper {
	
		/**
		 * ��ȡapp���༯��
		 * @param parentId
		 * @return
		 */
		public List<App_Category> getAppCategoryListByParentId(@Param("parentId")Integer parentId);

}
