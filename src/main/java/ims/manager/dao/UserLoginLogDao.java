package ims.manager.dao;

import java.util.List;

import org.springframework.stereotype.Repository;

import ims.manager.domain.UserLoginLog;

/**
 * 
 * @ClassName:  UserLoginLogDao   
 * @Description:TODO
 * @author: yueling
 * @date:   2018年5月22日 下午3:29:19   
 *     
 * @Copyright: 2018 yueling Inc. All rights reserved.
 */
@Repository
public interface UserLoginLogDao {
    /**
     * 获取所有用户的登录日志
     *
     * @return 日志列表
     */
    List<UserLoginLog> listAllUserLoginLog();

    /**
     * 添加登录日志
     *
     * @param userLoginLog 登录日志
     */
    void addUserLoginLog(UserLoginLog userLoginLog);
}
