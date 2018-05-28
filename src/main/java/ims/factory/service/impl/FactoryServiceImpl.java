package ims.factory.service.impl;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ims.factory.dao.FactoryDao;
import ims.factory.domain.Factory;
import ims.factory.service.FactoryService;

@Service
public class FactoryServiceImpl implements FactoryService {

	private final FactoryDao factoryDao;

	@Autowired
	public FactoryServiceImpl(FactoryDao factoryDao) {
		this.factoryDao = factoryDao;
	}

	@Override
	public void addFactory(Factory factory) {
		if (factoryDao != null) {
			factoryDao.addFactory(factory);
		}

	}

	@Override
	public void deleteFactoryByFactoryId(long factoryId) {
		if (factoryDao != null) {
			factoryDao.deleteFactoryByFactoryId(factoryId);
		}
	}

	@Override
	public void updateFactoryByFactoryId(Factory factory) {
		if (factoryDao != null) {
			factoryDao.updateFactoryByFactoryId(factory);
		}
	}

	@Override
	public List<Factory> getFactoryInfo(Map<String, Object> map) {
		// TODO Auto-generated method stub
		if (factoryDao != null) {
			factoryDao.getFactoryInfo(map);
		}
		return null;
	}

	@Override
	public List<Factory> findFactoryByLikeFactoryName(String factoryName) {
		if (factoryDao == null) {
			return null;
		}
		return factoryDao.findFactoryByLikeFactoryName(factoryName);
	}

	@Override
	public Factory findFactoryByEqualFactoryName(String factoryName) {
		// TODO Auto-generated method stub
		if (factoryDao == null) {
			return null;
		}
		return factoryDao.findFactoryByEqualFactoryName(factoryName);
	}


	@Override
	public Factory findFactoryByFactoryId(int factoryId) {
		if (factoryDao == null) {
			return null;
		}
		return factoryDao.findFactoryByFactoryId(factoryId);
	}

	

	
}
