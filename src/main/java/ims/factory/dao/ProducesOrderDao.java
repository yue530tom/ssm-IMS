package ims.factory.dao;

import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Repository;

import ims.factory.domain.ProducesOrder;

@Repository
public interface ProducesOrderDao {


	  void addProducesOrder(ProducesOrder producesOrder);

	    void deleteProducesOrderByProducesOrderId(long producesOrderId);

	    void updateProducesOrderByProducesOrderId(ProducesOrder producesOrder);

	    List<ProducesOrder> getProducesOrderInfo(Map<String, Object> map);
	 
	    List<ProducesOrder> findProducesOrderByProducesOrderNo(String producesOrderNo);
	    
	    ProducesOrder findProducesOrderByProducesOrderId(int producesOrderId);
	
}
