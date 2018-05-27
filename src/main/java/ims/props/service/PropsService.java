package ims.props.service;

import java.util.List;
import java.util.Map;

import ims.props.domain.Props;

public interface PropsService {
	/**
	 * 
	 * @Title: addProps @Description: 添加属性信息 @param: @param Props @return:
	 * void @throws
	 */
	void addProps(Props props);

	/**
	 * 
	 * @Title: deletePropsByPropsId @Description: 通过属性id删除属性信息 @param: @param
	 * PropsId @return: void @throws
	 */
	void deletePropsByPropsId(long propsId);

	/**
	 * 
	 * @Title: updatePropsByPropsId @Description: 通过属性id更新属性信息 @param: @param
	 * Props @return: void @throws
	 */
	void updatePropsByPropsId(Props props);

	/**
	 * 
	 * @Title: getPropsInfo @Description: 综合查询的属性信息 @param: @return @return:
	 * List<Props> @throws
	 */
	List<Props> getPropsInfo(Map<String,Object> map);

	/**
	 * 
	 * @Title: findPropsByPropsName @Description: 通过属性名称查询属性，使用模糊匹配 @param: @param
	 * PropsName @param: @return @return: List<Props> @throws
	 */
	List<Props> findPropsByLikePropsName(String propsName);

	/**
	 * 
	 * @Title: findPropsByEqualPropsName @Description:
	 * 通过属性名称查询属性，使用精确匹配 @param: @param propsName @param: @return @return:
	 * Props @throws
	 */
	Props findPropsByEqualPropsName(String propsName);

	/**
	 * 
	 * @Title: findPropsByPropsId @Description: 通过属性的id来精确查询属性 @param: @param
	 * PropsId @param: @return @return: Props @throws
	 */
	Props findPropsByPropsId(int propsId);
}
