package ims.factory.service.impl;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ims.factory.dao.ProducesOrderDetailsDao;
import ims.factory.domain.Produces;
import ims.factory.domain.ProducesOrderDetails;
import ims.factory.service.ProducesOrderDetailsService;

@Service
public class ProducesOrderDetailsServiceImpl implements ProducesOrderDetailsService {

	private final ProducesOrderDetailsDao producesOrderDetailsDao;
	
	@Autowired
	public ProducesOrderDetailsServiceImpl(ProducesOrderDetailsDao producesOrderDetailsDao) {
		this.producesOrderDetailsDao= producesOrderDetailsDao;
	}
	
	@Override
	public void addProducesOrderDetails(ProducesOrderDetails producesOrderDetails) {
		if (producesOrderDetailsDao!=null) {
			producesOrderDetailsDao.addProducesOrderDetails(producesOrderDetails);
			
		}
	}

	@Override
	public void deleteProducesOrderDetailsByProducesOrderDetailsId(long producesOrderDetailsId) {
		if (producesOrderDetailsDao!=null) {
			producesOrderDetailsDao.deleteProducesOrderDetailsByProducesOrderDetailsId(producesOrderDetailsId);
			
		}
	}

	@Override
	public void updateProducesOrderDetailsByProducesOrderDetailsId(ProducesOrderDetails producesOrderDetails) {
		if (producesOrderDetailsDao!=null) {
			producesOrderDetailsDao.updateProducesOrderDetailsByProducesOrderDetailsId(producesOrderDetails);
			
		}
		
	}

	@Override
	public List<Produces> getProducesOrderDetailsInfo(Map<String, Object> map) {
		if (producesOrderDetailsDao!=null) {
			return producesOrderDetailsDao.getProducesOrderDetailsInfo(map);
			
		}
		return null;
	}

	@Override
	public List<Produces> findProducesOrderDetailsByProducesOrderDetailsNo(String producesOrderDetailsNo) {
		if (producesOrderDetailsDao!=null) {
			return producesOrderDetailsDao.findProducesOrderDetailsByProducesOrderDetailsNo(producesOrderDetailsNo);
			
		}
		return null;
	}

	@Override
	public Produces findProducesOrderDetailsByProducesOrderDetailsId(int producesOrderDetailsId) {
		if (producesOrderDetailsDao!=null) {
			return producesOrderDetailsDao.findProducesOrderDetailsByProducesOrderDetailsId(producesOrderDetailsId);
			
		}
		return null;
	}

	
	
}
