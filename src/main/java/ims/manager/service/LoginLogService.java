package ims.manager.service;

import ims.manager.domain.UserLoginLog;

/**
 * 
 * @ClassName:  LoginLogService   
 * @Description:TODO
 * @author: yueling
 * @date:   2018年5月22日 下午6:00:42   
 *     
 * @Copyright: 2018 yueling Inc. All rights reserved.
 */
public interface LoginLogService {
    /**
     * 获取所有的登录日志
     */
    void listAllUserLoginLog();

    /**
     * 添加登录日志
     *
     * @param userLoginLog 新增的登录日志
     */
    void addUserLoginLog(UserLoginLog userLoginLog);
}
