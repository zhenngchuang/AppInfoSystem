package cn.appsys.dao.AppInfo;

import java.util.ArrayList;
import java.util.List;

import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import cn.appsys.pojo.App_Info;
@Repository
public interface App_InfoMapper {
	//APP��Ϣ��Mapper�ӿ�
	/**
	 * ��ȡ���е�app��Ϣ���б�
	 */
	public App_Info  appinfolist(@Param("id") Integer id);
	/**
	 * ͳ���ܼ�¼���� */
	public int appCount(@Param("softwareName")String softwareName,
			@Param("status") Integer status,@Param("flatformId") Integer flatformId,@Param("categoryLevel1") Integer categoryLevel1 ,
			@Param("categoryLevel2") Integer categoryLevel2 ,@Param("categoryLevel3") Integer categoryLevel3);
	/**
	 * ����һ��APP��Ϣ�б�
	 */
	public int addinfoadd(App_Info appinfo );
	/**
	 * �޸�App��Ϣ
	 */
	public int modifyAppinfo(App_Info appinfo);
	/**
	 * ��ҳ��ʾApp��Ϣ�б�
	 */
	public List<App_Info> pageAppInfo(@Param("softwareName")String softwareName,
			@Param("status") Integer status,@Param("flatformId") Integer flatformId,@Param("categoryLevel1") Integer categoryLevel1 ,
			@Param("categoryLevel2") Integer categoryLevel2 ,@Param("categoryLevel3") Integer categoryLevel3 ,
			@Param("from")Integer currentPageNo,@Param("pageSize") Integer pageSize,@Param("id") Integer id
			);
	/**
	 * ����app״̬
	 * @param status
	 * @param id
	 * @return
	 * @throws Exception
	 */
	public int updateSatus(@Param(value="status")Integer status,@Param(value="id")Integer id)throws Exception;

}
