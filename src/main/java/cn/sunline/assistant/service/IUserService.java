package cn.sunline.assistant.service;

import java.util.List;

import cn.sunline.assistant.bean.comm.User;

public interface IUserService {
	
	public void addUser(User user);

	public void delUser(String id);

	public User modUser(User user);

	public User selUser(String id);
	
	public List<User> showUsers();
}
