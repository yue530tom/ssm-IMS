package ims.factory.dao;

import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Repository;

import ims.factory.domain.Factory;

@Repository
public interface FactoryDao {


	/**
	 * 
	 * @Title: addFactory   
	 * @Description: 添加工厂信息
	 * @param: @param Factory      
	 * @return: void      
	 * @throws
	 */
    void addFactory(Factory factory);

    
    /**
     * 
     * @Title: deleteFactoryByFactoryId   
     * @Description: 通过工厂id删除工厂信息
     * @param: @param FactoryId      
     * @return: void
     * @throws
     */
    void deleteFactoryByFactoryId(long factoryId);

    /**
     * 
     * @Title: updateFactoryByFactoryId   
     * @Description: 通过工厂id更新工厂信息
     * @param: @param Factory      
     * @return: void      
     * @throws
     */
    void updateFactoryByFactoryId(Factory factory);

    /**
     * 
     * @Title: getFactoryInfo   
     * @Description: 综合查询的工厂信息
     * @param: @return      
     * @return: List<Factory>      
     * @throws
     */
    List<Factory> getFactoryInfo(Map<String, Object> map);
    
    /**
     * 
     * @Title: findFactoryByFactoryName   
     * @Description: 通过工厂名称查询工厂，使用模糊匹配
     * @param: @param FactoryName
     * @param: @return      
     * @return: List<Factory>      
     * @throws
     */
    List<Factory> findFactoryByLikeFactoryName(String factoryName);
    
    /**
     * 
     * @Title: findFactoryByEqualFactoryName   
     * @Description: 通过工厂名称查询工厂，使用精确匹配
     * @param: @param factoryName
     * @param: @return      
     * @return: Factory      
     * @throws
     */
    Factory findFactoryByEqualFactoryName(String factoryName);


    /**
     * 
     * @Title: findFactoryByFactoryId   
     * @Description: 通过工厂的id来精确查询工厂
     * @param: @param FactoryId
     * @param: @return      
     * @return: Factory      
     * @throws
     */
    Factory findFactoryByFactoryId(int factoryId);

}
