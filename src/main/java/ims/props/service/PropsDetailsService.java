package ims.props.service;

import java.util.List;
import java.util.Map;

import ims.props.domain.PropsDetails;

public interface PropsDetailsService {
	/**
	 * 
	 * @Title: addPropsDetails @Description: 添加属性信息 @param: @param PropsDetails @return:
	 * void @throws
	 */
	void addPropsDetails(PropsDetails propsDetails);

	/**
	 * 
	 * @Title: deletePropsDetailsByPropsDetailsId @Description: 通过属性id删除属性信息 @param: @param
	 * PropsDetailsId @return: void @throws
	 */
	void deletePropsDetailsByPropsDetailsId(long propsDetailsId);

	/**
	 * 
	 * @Title: updatePropsDetailsByPropsDetailsId @Description: 通过属性id更新属性信息 @param: @param
	 * PropsDetails @return: void @throws
	 */
	void updatePropsDetailsByPropsDetailsId(PropsDetails propsDetails);

	/**
	 * 
	 * @Title: getPropsDetailsInfo @Description: 综合查询的属性信息 @param: @return @return:
	 * List<PropsDetails> @throws
	 */
	List<PropsDetails> getPropsDetailsInfo(Map<String,Object> map);

	/**
	 * 
	 * @Title: findPropsDetailsByPropsDetailsName @Description: 通过属性名称查询属性，使用模糊匹配 @param: @param
	 * PropsDetailsName @param: @return @return: List<PropsDetails> @throws
	 */
	List<PropsDetails> findPropsDetailsByLikePropsDetailsName(String propsDetailsName);

	/**
	 * 
	 * @Title: findPropsDetailsByEqualPropsDetailsName @Description:
	 * 通过属性名称查询属性，使用精确匹配 @param: @param propsDetailsName @param: @return @return:
	 * PropsDetails @throws
	 */
	PropsDetails findPropsDetailsByEqualPropsDetailsName(String propsDetailsName);

	/**
	 * 
	 * @Title: findPropsDetailsByPropsDetailsId @Description: 通过属性的id来精确查询属性 @param: @param
	 * PropsDetailsId @param: @return @return: PropsDetails @throws
	 */
	PropsDetails findPropsDetailsByPropsDetailsId(int propsDetailsId);
}
