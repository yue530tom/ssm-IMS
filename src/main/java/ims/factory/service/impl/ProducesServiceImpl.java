package ims.factory.service.impl;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ims.factory.dao.ProducesDao;
import ims.factory.domain.Produces;
import ims.factory.service.ProducesService;

@Service
public class ProducesServiceImpl implements ProducesService {

	private final ProducesDao producesDao;

	@Autowired
	public ProducesServiceImpl(ProducesDao producesDao) {
		this.producesDao = producesDao;
	}

	@Override
	public void addProduces(Produces produces) {
		// TODO Auto-generated method stub
		if (producesDao!=null) {
			producesDao.addProduces(produces);
		}
	}

	@Override
	public void deleteProducesByProducesId(long producesId) {
		// TODO Auto-generated method stub
		if (producesDao!=null) {
			producesDao.deleteProducesByProducesId(producesId);
			
		}
	}

	@Override
	public void updateProducesByProducesId(Produces produces) {
		// TODO Auto-generated method stub
		if (producesDao!=null) {
			producesDao.updateProducesByProducesId(produces);
			
		}
	}

	@Override
	public List<Produces> getProducesInfo(Map<String, Object> map) {
		// TODO Auto-generated method stub
		if (producesDao!=null) {
			return producesDao.getProducesInfo(map);
			
		}
		return null;
	}

	@Override
	public List<Produces> findProducesByLikeProducesName(String producesName) {
		// TODO Auto-generated method stub
		if (producesDao!=null) {
			return producesDao.findProducesByLikeProducesName(producesName);
			
		}
		return null;
	}

	@Override
	public Produces findProducesByEqualProducesName(String producesName) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Produces findProducesByProducesId(int producesId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void producesCalc(long producesId) {
		// TODO Auto-generated method stub
		if (producesDao!=null) {
			producesDao.producesCalc(producesId);
			
		}
	}

	@Override
	public void producesClean() {
		// TODO Auto-generated method stub
		if (producesDao!=null) {
			producesDao.producesClean();
			
		}
	}

	
	
}
