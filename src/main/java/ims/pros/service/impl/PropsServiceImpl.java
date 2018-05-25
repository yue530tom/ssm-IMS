package ims.pros.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ims.pros.dao.PropsDao;
import ims.pros.domain.Props;
import ims.pros.service.PropsService;

@Service
public class PropsServiceImpl implements PropsService{

	private final PropsDao propsDao;
	@Autowired
	public PropsServiceImpl(PropsDao propsDao) {
		this.propsDao=propsDao;
	}
	@Override
	public void addProps(Props props) {
		// TODO Auto-generated method stub
		if (propsDao!=null) {
			propsDao.addProps(props);
		}
	}

	@Override
	public void deletePropsByPropsId(long propsId) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void updatePropsByPropsId(Props props) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<Props> getPropsInfo(Props props) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Props> findPropsByLikePropsName(String propsName) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Props findPropsByEqualPropsName(String propsName) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Props findPropsByPropsId(int propsId) {
		// TODO Auto-generated method stub
		return null;
	}

}
