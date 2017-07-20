/**
 * 
 */
package studio.tuatara.ssrmm.provider.service;

import java.util.List;

import studio.tuatara.ssrmm.provider.pojo.UserInfo;

/**
 * @author Rjan
 *
 */
public interface IProviderDemoService {
	int addUser(UserInfo user);

	List<UserInfo> queryUsers();
}
