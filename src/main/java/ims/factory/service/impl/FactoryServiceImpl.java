package ims.factory.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import ims.factory.dao.FactoryDao;
import ims.factory.domain.Factory;
import ims.factory.service.FactoryService;

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
	public List<Factory> getFactoryInfo(Factory factory) {
		if (factoryDao == null) {
			return null;
		}
		return factoryDao.getFactoryInfo(factory);
	}

	@Override
	public List<Factory> findFactoryByFactoryName(String factoryName) {
		if (factoryDao == null) {
			return null;
		}
		return factoryDao.findFactoryByFactoryName(factoryName);
	}

	@Override
	public Factory findFactoryByFactoryId(int factoryId) {
		if (factoryDao == null) {
			return null;
		}
		return factoryDao.findFactoryByFactoryId(factoryId);
	}

}
