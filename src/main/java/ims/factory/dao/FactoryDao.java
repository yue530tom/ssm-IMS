package ims.factory.dao;

import java.util.List;

import org.springframework.stereotype.Repository;

import ims.factory.domain.Factory;

@Repository
public interface FactoryDao {

	/**
	 * 通过工厂名称查询工厂，使用模糊匹配
	 * @param FactoryName：工厂名称关键字
	 * @return List<Factory>
	 */
    List<Factory> findFactoryByFactoryName(String FactoryName);

    /**
     * 通过工厂的id来精确查询工厂
     * @param FactoryId:工厂的id
     * @return Factory
     */
    Factory findFactoryByFactoryId(int FactoryId);


    /**
     * 添加工厂
     * @param Factory：Factory对象
     */
    void addFactory(Factory Factory);

    /**
     * 通过用户名删除用户
     *
     * @param Factoryname 删除用户的用户名
     */
    void deleteFactoryByFactoryName(String Factoryname);

    /**
     * 更新用户信息
     *
     * @param Factory 需要更新的用户
     */
    void updateFactoryByFactoryName(Factory Factory);

    /**
     * 用户名获取用户密码
     *
     * @param Factoryname 用户名
     * @return 密码
     */
    String getFactoryPasswordByFactoryName(String Factoryname);

    /**
     * 获取所有的用户信息
     *
     * @return 用户列表
     */
    List<Factory> getAllFactoryInfo();
}
