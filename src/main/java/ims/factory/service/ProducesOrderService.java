package ims.factory.service;

import java.util.List;
import java.util.Map;

import ims.factory.domain.ProducesOrder;

public interface ProducesOrderService {


	  void addProducesOrder(ProducesOrder producesOrder);

	    void deleteProducesOrderByProducesOrderId(long producesOrderId);

	    void updateProducesOrderByProducesOrderId(ProducesOrder producesOrder);

	    List<ProducesOrder> getProducesOrderInfo(Map<String, Object> map);
	 
	    List<ProducesOrder> findProducesOrderByProducesOrderNo(String producesOrderNo);
	    
	    ProducesOrder findProducesOrderByProducesOrderId(int producesOrderId);

}