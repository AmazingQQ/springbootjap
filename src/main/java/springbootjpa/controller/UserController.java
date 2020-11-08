package springbootjpa.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import springbootjpa.common.Result;
import springbootjpa.entity.User;
import springbootjpa.service.UserService;

@RestController
@RequestMapping("/user")
public class UserController {

	@Autowired
	private UserService userService;

	@PostMapping("/add")
	public Result<User> saveUser(@RequestBody User user) {
		User result = userService.saveUser(user);
		if (result != null) {
			return new Result<>(200, "插入数据成功", result);
		} else {
			return new Result<>(444, "插入数据失败", null);
		}
	}
	
	
	@PostMapping("/find")
	public Result<User> findUser(@RequestBody User user){
		User result = userService.findById(user.getId());
		if (result != null) {
			return new Result<>(200, "查询数据成功", result);
		} else {
			return new Result<>(444, "没有此用户!", null);
		}
	}
	
	@PostMapping("/delete")
	public Result<User> deleteUser(@RequestBody User user){
		userService.deleteById(user.getId());
		return new Result<>(200,"删除用户成功");
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
