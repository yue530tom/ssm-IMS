package ims.props.service.impl;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ims.props.dao.PropsDetailsDao;
import ims.props.domain.PropsDetails;
import ims.props.service.PropsDetailsService;

@Service
public class PropsDetailsServiceImpl implements PropsDetailsService {

	private final PropsDetailsDao propsDetailsDao;

	@Autowired
	public PropsDetailsServiceImpl(PropsDetailsDao propsDetailsDao) {
		this.propsDetailsDao = propsDetailsDao;
	}

	@Override
	public void addPropsDetails(PropsDetails propsDetails) {
		// TODO Auto-generated method stub
		if (propsDetailsDao != null) {
			propsDetailsDao.addPropsDetails(propsDetails);
		}
	}

	@Override
	public void deletePropsDetailsByPropsDetailsId(long propsDetailsId) {
		// TODO Auto-generated method stub
		if (propsDetailsDao != null) {
			propsDetailsDao.deletePropsDetailsByPropsDetailsId(propsDetailsId);
		}
	}

	@Override
	public void updatePropsDetailsByPropsDetailsId(PropsDetails propsDetails) {
		// TODO Auto-generated method stub
		if (propsDetailsDao != null) {
			propsDetailsDao.updatePropsDetailsByPropsDetailsId(propsDetails);
		}
	}

	@Override
	public List<PropsDetails> getPropsDetailsInfo(Map<String, Object> map) {
		// TODO Auto-generated method stub
		if (propsDetailsDao != null) {
			return propsDetailsDao.getPropsDetailsInfo(map);
		}
		return null;
	}

	@Override
	public List<PropsDetails> findPropsDetailsByLikePropsDetailsName(String propsDetailsName) {
		// TODO Auto-generated method stub
		if (propsDetailsDao != null) {
			return propsDetailsDao.findPropsDetailsByLikePropsDetailsName(propsDetailsName);
		}
		return null;
	}

	@Override
	public PropsDetails findPropsDetailsByEqualPropsDetailsName(String propsDetailsName) {
		// TODO Auto-generated method stub
		if (propsDetailsDao != null) {
			return propsDetailsDao.findPropsDetailsByEqualPropsDetailsName(propsDetailsName);
		}
		return null;
	}

	@Override
	public PropsDetails findPropsDetailsByPropsDetailsId(int propsDetailsId) {
		// TODO Auto-generated method stub
		if (propsDetailsDao != null) {
			return propsDetailsDao.findPropsDetailsByPropsDetailsId(propsDetailsId);
		}
		return null;
	}

}
