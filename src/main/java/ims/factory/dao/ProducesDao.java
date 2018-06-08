package ims.factory.dao;

import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Repository;

import ims.factory.domain.Produces;

@Repository
public interface ProducesDao {


	/**
	 * 
	 * @Title: addProduces   
	 * @Description: 添加工厂信息
	 * @param: @param Produces      
	 * @return: void      
	 * @throws
	 */
    void addProduces(Produces produces);

    
    /**
     * 
     * @Title: deleteProducesByProducesId   
     * @Description: 通过工厂id删除工厂信息
     * @param: @param ProducesId      
     * @return: void
     * @throws
     */
    void deleteProducesByProducesId(long producesId);

    /**
     * 
     * @Title: updateProducesByProducesId   
     * @Description: 通过工厂id更新工厂信息
     * @param: @param Produces      
     * @return: void      
     * @throws
     */
    void updateProducesByProducesId(Produces produces);

    /**
     * 
     * @Title: getProducesInfo   
     * @Description: 综合查询的工厂信息
     * @param: @return      
     * @return: List<Produces>      
     * @throws
     */
    List<Produces> getProducesInfo(Map<String, Object> map);
    
    /**
     * 
     * @Title: findProducesByProducesName   
     * @Description: 通过工厂名称查询工厂，使用模糊匹配
     * @param: @param ProducesName
     * @param: @return      
     * @return: List<Produces>      
     * @throws
     */
    List<Produces> findProducesByLikeProducesName(String producesName);
    
    /**
     * 
     * @Title: findProducesByEqualProducesName   
     * @Description: 通过工厂名称查询工厂，使用精确匹配
     * @param: @param producesName
     * @param: @return      
     * @return: Produces      
     * @throws
     */
    Produces findProducesByEqualProducesName(String producesName);


    /**
     * 
     * @Title: findProducesByProducesId   
     * @Description: 通过工厂的id来精确查询工厂
     * @param: @param ProducesId
     * @param: @return      
     * @return: Produces      
     * @throws
     */
    Produces findProducesByProducesId(int producesId);
	
    void producesCalc(long orderId);
	
	void producesClean();
}
