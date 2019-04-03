package com.springboot.beginner.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.springboot.beginner.entity.FriendEntity;

public interface FriendRepository extends JpaRepository<FriendEntity, Integer>{
	
	Optional<FriendEntity> findByName(String name);
	//List<FriendEntity> findAllByName(String name);
	
}
