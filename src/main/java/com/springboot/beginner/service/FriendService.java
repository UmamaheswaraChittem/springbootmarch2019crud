package com.springboot.beginner.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

import com.springboot.beginner.dao.FriendDAO;
import com.springboot.beginner.entity.FriendEntity;
import com.springboot.beginner.pojo.Friend;

@Service
public class FriendService {
	
	@Autowired
	private FriendDAO friendDao;
	
	
	public List<FriendEntity> saveFriend(Friend friend) {
		// TODO Auto-generated method stub
		return friendDao.saveFriend(friend);
		
		
	}


	public List<FriendEntity> getAllFriends() {
		// TODO Auto-generated method stub
		return friendDao.getAllFriends();
	}

	@Cacheable("friendentity")
	public FriendEntity getFriendById(int id) {
		// TODO Auto-generated method stub
		
			
			try {
				System.out.println("##########################");
				System.out.println("Sleeping for 8 seconds");
				System.out.println("##########################");
				Thread.sleep(8000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		
	
		return friendDao.getFriendById(id);
	}


	public List<FriendEntity> deleteFriendById(int id) {
		// TODO Auto-generated method stub
		return friendDao.deleteFriendById(id);
	}


	public List<Friend> updateFriendById(int id, Friend friend) {
		// TODO Auto-generated method stub
		return friendDao.updateFriendById(id, friend);
	}

	
	public FriendEntity findFriendByName(String name) {
		// TODO Auto-generated method stub
		return friendDao.findFriendByName(name);
	}

}
