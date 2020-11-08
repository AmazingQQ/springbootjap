package springbootjpa.service.impl;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import springbootjpa.dao.RoleDao;
import springbootjpa.entity.Role;
import springbootjpa.service.RoleService;


@Service
public class RoleServiceImpl implements RoleService{
	
	@Resource
	private RoleDao roleDao;

	@Override
	public Role saveRole(Role role) {
		return roleDao.save(role);
	}

	@Override
	public Role findById(Integer id) {
		return roleDao.getOne(id);
	}

	@Override
	public void deleteById(Integer id) {
		roleDao.deleteById(id);
	}
	
	
}
