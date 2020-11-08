package springbootjpa.service;

import springbootjpa.entity.User;

public interface UserService {
	
	public User saveUser(User user);
	
	public User findById(Integer id);
	
	public void deleteById(Integer id);
	
}
