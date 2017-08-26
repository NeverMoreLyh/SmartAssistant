package cn.sunline.assistant.dao;

import java.util.List;

import cn.sunline.assistant.annotation.AssistantDao;
import cn.sunline.assistant.bean.comm.User;

@AssistantDao
public interface IUserDao {

	void addUser(User user);
	void delUser(String id);
	User modUser(User user);
	User selUser(String id);
	List<User> showUsers();
}
