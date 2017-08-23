package cn.sunline.assistant.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import cn.sunline.assistant.bean.comm.User;
import cn.sunline.assistant.dao.IUserDao;
import cn.sunline.assistant.service.IUserService;

@Service("IUserService")
public class UserServiceImpl implements IUserService{
	@Resource
	IUserDao userDao;
	
	@Override
	public void addUser(User user) {
		userDao.addUser(user);
	}

	@Override
	public void delUser(String id) {
		userDao.delUser(id);
	}

	@Override
	public User modUser(User user) {
		userDao.modUser(user);
		User u = selUser(user.getUserId());
		return u;
	}

	@Override
	public User selUser(String id) {
		System.out.println("impl in");
		return userDao.selUser(id);
	}

	@Override
	public List<User> showUsers() {
		return userDao.showUsers();
	}

}
