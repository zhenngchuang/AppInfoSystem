package cn.appsys.service.AppCategory;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import cn.appsys.dao.AppCategory.AppCategoryMapper;
import cn.appsys.pojo.App_Category;
@Service
public class AppCategoryServiceImpl implements AppCategoryService {
	@Resource AppCategoryMapper appCategoryMapper;
	@Override
	/**
	 * 根据父级id获取分类
	 */
	public List<App_Category> getAppCategoryListByParentId(Integer parentId) {
		// TODO Auto-generated method stub
		return appCategoryMapper.getAppCategoryListByParentId(parentId);
	}
	

}
