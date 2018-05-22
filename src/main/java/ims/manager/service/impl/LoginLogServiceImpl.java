package ims.manager.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ims.manager.dao.UserLoginLogDao;
import ims.manager.domain.UserLoginLog;
import ims.manager.service.LoginLogService;

/**
 * 
 * @ClassName:  LoginLogServiceImpl   
 * @Description:TODO
 * @author: yueling
 * @date:   2018年5月22日 下午6:00:50   
 *     
 * @Copyright: 2018 yueling Inc. All rights reserved.
 */
@Service
public class LoginLogServiceImpl implements LoginLogService {
    private final UserLoginLogDao userLoginLogDao;

    @Autowired
    public LoginLogServiceImpl(UserLoginLogDao userLoginLogDao) {
        this.userLoginLogDao = userLoginLogDao;
    }

    @Override
    public void listAllUserLoginLog() { }

    @Override
    public void addUserLoginLog(UserLoginLog userLoginLog) {
        userLoginLogDao.addUserLoginLog(userLoginLog);
    }
}
