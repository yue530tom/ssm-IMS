package ims.factory.service;

import java.util.List;
import java.util.Map;

import ims.factory.domain.Produces;
import ims.factory.domain.ProducesOrderDetails;

public interface ProducesOrderDetailsService {

	void addProducesOrderDetails(ProducesOrderDetails producesOrderDetails);

    void deleteProducesOrderDetailsByProducesOrderDetailsId(long producesOrderDetailsId);

    void updateProducesOrderDetailsByProducesOrderDetailsId(ProducesOrderDetails producesOrderDetails);

    List<Produces> getProducesOrderDetailsInfo(Map<String, Object> map);
 
    List<Produces> findProducesOrderDetailsByProducesOrderDetailsNo(String producesOrderDetailsNo);
    
    Produces findProducesOrderDetailsByProducesOrderDetailsId(int producesOrderDetailsId);

}