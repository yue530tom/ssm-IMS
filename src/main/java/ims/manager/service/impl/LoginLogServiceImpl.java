package ims.manager.service.impl;

import ims.pros.dao.UserLoginLogDao;
import ims.pros.domain.UserLoginLog;
import ims.pros.service.LoginLogService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * LoginLogServiceImpl
 *
 * @author igaozp
 * @version 1.0
 * @since 2016
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
