package com.springbootfinancetracker.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.springbootfinancetracker.dto.UserDto;

@Repository
public interface IUserDaoDb extends JpaRepository<UserDto, Integer> {

}
