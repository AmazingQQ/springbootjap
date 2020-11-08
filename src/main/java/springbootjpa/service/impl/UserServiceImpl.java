package springbootjpa.service.impl;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import springbootjpa.dao.UserDao;
import springbootjpa.entity.User;
import springbootjpa.service.UserService;


@Service
public class UserServiceImpl implements UserService{
	
	@Autowired
	private UserDao userDao;
	
	@Override
	public User saveUser(User user) {
		return userDao.save(user);
	}

	@Override
	public User findById(Integer id) {
		
		return userDao.getOne(id);
	}

	@Override
	public void deleteById(Integer id) {
		userDao.deleteById(id);
	}

}
