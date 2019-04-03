package com.springboot.beginner.dao;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.PostMapping;

import com.springboot.beginner.entity.FriendEntity;
import com.springboot.beginner.pojo.Friend;
import com.springboot.beginner.repository.FriendRepository;

@Repository
public class FriendDAO {
	
	@Autowired
	private FriendRepository friendRepository;

	public List<FriendEntity> saveFriend(Friend friend) {
		// TODO Auto-generated method stub
		FriendEntity fe = new FriendEntity();
		fe.setName(friend.getName());
		fe.setLocation(friend.getLocation());
		friendRepository.save(fe);
		return friendRepository.findAll();
		
		
	}

	public List<FriendEntity> getAllFriends() {
		// TODO Auto-generated method stub
		return friendRepository.findAll();
	}

	public FriendEntity getFriendById(int id) {
		// TODO Auto-generated method stub
		return friendRepository.findById(id).get();
	}

	public List<FriendEntity> deleteFriendById(int id) {
		// TODO Auto-generated method stub
		
		friendRepository.deleteById(id);
		return friendRepository.findAll();
	}

	public List<Friend> updateFriendById(int id, Friend friend) {
		FriendEntity fe = new FriendEntity();
		fe.setId(id);
		fe.setLocation(friend.getLocation());
		fe.setName(friend.getName());
		friendRepository.save(fe);
		List<FriendEntity> friendEntities = friendRepository.findAll();
		List<Friend> allFriends = new ArrayList<Friend>();
		for (FriendEntity feTemp : friendEntities) {
			Friend fTemp = new Friend();
			fTemp.setId(feTemp.getId());
			fTemp.setName(feTemp.getName());
			fTemp.setLocation(feTemp.getLocation());
			allFriends.add(fTemp);
		}
		return allFriends;
		
	}

	public FriendEntity findFriendByName(String name) {
		// TODO Auto-generated method stub
		return friendRepository.findByName(name).get();
		
	}
	
	
	

}
