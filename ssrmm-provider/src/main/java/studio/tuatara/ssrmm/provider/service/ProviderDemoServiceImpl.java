/**
 * 
 */
package studio.tuatara.ssrmm.provider.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import studio.tuatara.ssrmm.provider.dao.IDemoDao;
import studio.tuatara.ssrmm.provider.pojo.UserInfo;

/**
 * @author Rjan
 *
 */
@Service
 class ProviderDemoServiceImpl implements IProviderDemoService {

	 @Autowired
	 private IDemoDao demoDao;

	@Override
	public int addUser(UserInfo user) {
		return demoDao.addUser(user);
	}

	@Override
	public List<UserInfo> queryUsers() {
		return demoDao.queryUsers();
	}
	 
}
