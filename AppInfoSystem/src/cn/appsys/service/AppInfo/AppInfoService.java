package cn.appsys.service.AppInfo;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import cn.appsys.pojo.App_Info;

public interface AppInfoService {
	//����һ��APpInfo��service
	/**
	 * ��ȡ���е�app��Ϣ���б�
	 */
	public App_Info appinfoList( Integer id);
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
	public List<App_Info> pageAppInfo(String softwareName,
			 Integer status, Integer flatformId, Integer categoryLevel1 ,
			 Integer categoryLevel2 , Integer categoryLevel3 ,
			Integer currentPageNo,Integer pageSize,Integer id
			);
	
	/**
	 * ͳ���ܼ�¼����
	 */
	public int appCount(String softwareName,
			 Integer status,Integer flatformId, Integer categoryLevel1 ,
			 Integer categoryLevel2 , Integer categoryLevel3);
	
	/**
	 * ����app״̬
	 * @param status
	 * @param id
	 * @return
	 * @throws Exception
	 */
	public int updateSatus(Integer status,Integer id)throws Exception;

}
