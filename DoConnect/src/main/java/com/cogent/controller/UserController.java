package com.cogent.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.cogent.entity.User;
import com.cogent.service.UserService;

@Controller
@ResponseBody

@RequestMapping("/api")
public class UserController {
	@Autowired
	UserService us;
	
	@GetMapping("/getLogin")
	public void getLogin() {
		//need to finish this method
	}
	
	@GetMapping("/loginVerify")
	public void loginVerify() {
		//need to finish this method
	}
	
	
	@GetMapping("/")
	public String home() {
		return "Welcome to DoConnect. This page needs work";
	}
	
	@PostMapping("/adduser")
	public User addUser(@RequestBody User u) {
		return us.add(u);
	}
	
	@PostMapping("/addnewuser")
	public User addNewUser(@RequestBody User u) {
		return us.add(u);
	}
	
	@GetMapping("/getallusers")
	public List<User> getAllUsers(){
		return us.findAll();
	}

	@GetMapping("/getuserbyId")
	public User getUserById(@RequestParam int id){
		return us.getId(id).get();
	}

	@PutMapping("/updateuser")
	public User updateUser(@RequestBody User u) {
		return us.add(u);
	}
	
	@GetMapping("/getbyname")
	public User getAByName(@RequestParam String name) {
		return us.getName(name);
	}

	
	@GetMapping("/getbyalluserType")
	public List<User> getByAllUserType(@RequestParam String type){
		
		return us.getAllByType(type);
	}

}
