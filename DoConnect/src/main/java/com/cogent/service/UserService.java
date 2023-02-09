package com.cogent.service;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cogent.entity.User;
import com.cogent.repository.UserRepository;

@Service
public class UserService {
	
	@Autowired
	UserRepository ur;
	
	public User add(User u) {
		return ur.save(u);
	}
	
	public List<User> findAll(){
		return (List<User>) ur.findAll();
	}
	
	public Optional<User> getId(int id){
		return ur.findById(id);
	}
	
	public void delete(User u) {
		ur.delete(u);
	}
	
	public User getName(String name){
		List<User> allUserList=(List<User>) ur.findAll();
		for (Iterator<User> iterator = allUserList.iterator(); iterator.hasNext();) {
			User user = (User) iterator.next();
			if(user.getName().equals(user)) {
				return user;
			}
		}
		return null;
		
	}
	
	public List<User> getAllByType(String type){
		List<User> allUserList=(List<User>) ur.findAll();
		List<User> userList = new ArrayList<User>();
		for (Iterator<User> iterator = allUserList.iterator(); iterator.hasNext();) {
			User user = (User) iterator.next();
			if(user.getUserType().equals(type)) {
				userList.add(user);
			}
		}
		return userList;
	}
	
	
	
	
	
	

}
