package springbootjpa.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import springbootjpa.common.Result;
import springbootjpa.entity.Role;
import springbootjpa.service.RoleService;

@RestController
@RequestMapping("/role")
public class RoleController {

	@Autowired
	private RoleService roleService;

	@PostMapping("/add")
	public Result<Role> saveRole(@RequestBody Role role) {
		Role result = roleService.saveRole(role);
		if (result != null) {
			return new Result<>(200, "插入数据成功", result);
		} else {
			return new Result<>(444, "插入数据失败", null);
		}
	}
	
	
	@PostMapping("/find")
	public Result<Role> findrole(@RequestBody Role role){
		Role result = roleService.findById(role.getId());
		if (result != null) {
			return new Result<>(200, "查询数据成功", result);
		} else {
			return new Result<>(444, "查询失败", null);
		}
	}
	
	@PostMapping("/delete")
	public Result<Role> deleteRole(@RequestBody Role role){
		roleService.deleteById(role.getId());
		return new Result<>(200,"删除成功");
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
