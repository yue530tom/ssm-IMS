package ims.factory.service;

import java.util.List;
import java.util.Map;

import ims.factory.domain.Produces;
import ims.factory.domain.ProducesOrder;

public interface ProducesOrderService {


	  void addProducesOrder(ProducesOrder producesOrder);

	    void deleteProducesOrderByProducesOrderId(long producesOrderId);

	    void updateProducesOrderByProducesOrderId(ProducesOrder producesOrder);

	    List<Produces> getProducesOrderInfo(Map<String, Object> map);
	 
	    List<Produces> findProducesOrderByProducesOrderNo(String producesOrderNo);
	    
	    Produces findProducesOrderByProducesOrderId(int producesOrderId);

}