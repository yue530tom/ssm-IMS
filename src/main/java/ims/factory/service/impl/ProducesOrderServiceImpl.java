package ims.factory.service.impl;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ims.factory.dao.ProducesOrderDao;
import ims.factory.domain.Produces;
import ims.factory.domain.ProducesOrder;
import ims.factory.service.ProducesOrderService;

@Service
public class ProducesOrderServiceImpl implements ProducesOrderService {

	
	private final ProducesOrderDao producesOrderDao;
	
	@Autowired
	public ProducesOrderServiceImpl(ProducesOrderDao producesOrderDao) {
		// TODO Auto-generated constructor stub
		this.producesOrderDao= producesOrderDao;
	}
	
	@Override
	public void addProducesOrder(ProducesOrder producesOrder) {
		if (producesOrderDao!=null) {
			producesOrderDao.addProducesOrder(producesOrder);
		}
	}

	@Override
	public void deleteProducesOrderByProducesOrderId(long producesOrderId) {
		if (producesOrderDao!=null) {
			producesOrderDao.deleteProducesOrderByProducesOrderId(producesOrderId);
		}
		
	}

	@Override
	public void updateProducesOrderByProducesOrderId(ProducesOrder producesOrder) {
		if (producesOrderDao!=null) {
			producesOrderDao.updateProducesOrderByProducesOrderId(producesOrder);
		}
		
	}

	@Override
	public List<ProducesOrder> getProducesOrderInfo(Map<String, Object> map) {
		if (producesOrderDao!=null) {
			return producesOrderDao.getProducesOrderInfo(map);
		}
		return null;
	}

	@Override
	public List<ProducesOrder> findProducesOrderByProducesOrderNo(String producesOrderNo) {
		if (producesOrderDao!=null) {
			return producesOrderDao.findProducesOrderByProducesOrderNo(producesOrderNo);
		}
		return null;
	}

	@Override
	public ProducesOrder findProducesOrderByProducesOrderId(int producesOrderId) {
		if (producesOrderDao!=null) {
			return producesOrderDao.findProducesOrderByProducesOrderId(producesOrderId);
		}
		return null;
	}

	
	
}
