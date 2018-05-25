package ims.props.dao;

import java.util.List;

import org.springframework.stereotype.Repository;

import ims.props.domain.PropsDetails;

@Repository
public interface PropsDetailsDao {
	/**
	 * 
	 * @Title: addPropsDetails @Description: 添加属性详情信息 @param: @param PropsDetails @return:
	 * void @throws
	 */
	void addPropsDetails(PropsDetails propsDetails);

	/**
	 * 
	 * @Title: deletePropsDetailsByPropsDetailsId @Description: 通过属性详情id删除属性详情信息 @param: @param
	 * PropsDetailsId @return: void @throws
	 */
	void deletePropsDetailsByPropsDetailsId(long propsDetailsId);

	/**
	 * 
	 * @Title: updatePropsDetailsByPropsDetailsId @Description: 通过属性详情id更新属性详情信息 @param: @param
	 * PropsDetails @return: void @throws
	 */
	void updatePropsDetailsByPropsDetailsId(PropsDetails propsDetails);

	/**
	 * 
	 * @Title: getPropsDetailsInfo @Description: 综合查询的属性详情信息 @param: @return @return:
	 * List<PropsDetails> @throws
	 */
	List<PropsDetails> getPropsDetailsInfo(PropsDetails propsDetails);

	/**
	 * 
	 * @Title: findPropsDetailsByPropsDetailsName @Description: 通过属性详情名称查询属性详情，使用模糊匹配 @param: @param
	 * PropsDetailsName @param: @return @return: List<PropsDetails> @throws
	 */
	List<PropsDetails> findPropsDetailsByLikePropsDetailsName(String propsDetailsName);

	/**
	 * 
	 * @Title: findPropsDetailsByEqualPropsDetailsName @Description:
	 * 通过属性详情名称查询属性详情，使用精确匹配 @param: @param propsDetailsName @param: @return @return:
	 * PropsDetails @throws
	 */
	PropsDetails findPropsDetailsByEqualPropsDetailsName(String propsDetailsName);

	/**
	 * 
	 * @Title: findPropsDetailsByPropsDetailsId @Description: 通过属性详情的id来精确查询属性详情 @param: @param
	 * PropsDetailsId @param: @return @return: PropsDetails @throws
	 */
	PropsDetails findPropsDetailsByPropsDetailsId(int propsDetailsId);
}
