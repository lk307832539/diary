package com.xxkxxy.diary.dao;


import com.xxkxxy.diary.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface UserDao extends JpaRepository<User, Integer> {

    User findByUserName(String userName);
}
