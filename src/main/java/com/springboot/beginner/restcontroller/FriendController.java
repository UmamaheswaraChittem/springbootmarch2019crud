package com.springboot.beginner.restcontroller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.springboot.beginner.entity.FriendEntity;
import com.springboot.beginner.pojo.Friend;
import com.springboot.beginner.service.FriendService;

@RestController
public class FriendController {
	
		@Autowired
		private FriendService friendService;
	
		@RequestMapping("/")
		public String welcome() {
			return "Welcome to Spring Boot Data!!!!";
		}
	
		@RequestMapping(value = "/add", method=RequestMethod.POST)
		public List<FriendEntity> saveFriend(@RequestBody Friend friend) {
			//System.out.println(friend.getLocation() + " " + friend.getName());
			return friendService.saveFriend(friend);
		}
		
		@GetMapping("/all")
		public List<FriendEntity> getAllFriends() {
			return friendService.getAllFriends();
		}
		
		@GetMapping("/get/{myid}")
		public FriendEntity getFriendById(@PathVariable("myid") int id) {
			return friendService.getFriendById(id);
		}
		
		@DeleteMapping("/del/{myid}")
		public List<FriendEntity> deleteFriendById(@PathVariable("myid") int id) {
			return friendService.deleteFriendById(id);
		}
		
		
		@PostMapping("/update/{myid}")
		public List<Friend> updateFriendById(@PathVariable("myid") int id, @RequestBody Friend friend) {
			return friendService.updateFriendById(id, friend);
		}
		
		@GetMapping("/get/name/{name}")
		public FriendEntity findFriendByName(@PathVariable("name") String name) {
			return friendService.findFriendByName(name);
			
		}
		
		
		
		
}
