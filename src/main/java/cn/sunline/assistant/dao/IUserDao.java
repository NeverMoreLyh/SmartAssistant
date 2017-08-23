package cn.sunline.assistant.dao;

import java.util.List;

import cn.sunline.assistant.annotation.DeployDao;
import cn.sunline.assistant.bean.comm.User;

@DeployDao
public interface IUserDao {

	void addUser(User user);
	void delUser(String id);
	User modUser(User user);
	User selUser(String id);
	List<User> showUsers();
}
