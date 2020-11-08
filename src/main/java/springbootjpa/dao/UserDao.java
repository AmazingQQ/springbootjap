package springbootjpa.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import springbootjpa.entity.User;


@Repository
public interface UserDao extends JpaRepository<User, Integer>{
	
}
