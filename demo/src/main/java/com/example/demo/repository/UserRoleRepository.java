package com.example.demo.repository;

import com.example.demo.entity.User_Role;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRoleRepository extends CrudRepository<User_Role,Integer> {
}
