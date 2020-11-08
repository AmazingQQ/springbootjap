package springbootjpa.service;

import springbootjpa.entity.Role;

public interface RoleService {
	
	public Role saveRole(Role role);
	
	public Role findById(Integer id);
	
	public void deleteById(Integer id);
}
