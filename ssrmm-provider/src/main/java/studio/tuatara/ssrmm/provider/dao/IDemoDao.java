/**
 * 
 */
package studio.tuatara.ssrmm.provider.dao;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import studio.tuatara.ssrmm.provider.pojo.UserInfo;

/**
 * @author Rjan
 *
 */
@Mapper
public interface IDemoDao {
	int addUser(UserInfo user);

	List<UserInfo> queryUsers();
}
