package com.example.FullStack.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.example.FullStack.Entity.UserEntity;
import com.example.FullStack.Service.UserService;

@CrossOrigin(origins = "http://localhost:3000")
@RestController
@RequestMapping("/users")
public class UserController {
	@Autowired 
    UserService std;
	
	@GetMapping("/fetch_users")
	public List<UserEntity> getUsers(){
		return std.getallusers();
	}
	
	@PostMapping("/register")
	public String register(@RequestBody UserEntity user) {
		return std.userRegister(user);	
	}

	@PostMapping("/login")
	public String login(@RequestBody UserEntity user) {
		return std.login(user.getEmail(), user.getPassword());
	}

	@PutMapping("/updatepassword")
    public String updatePassword(@RequestBody UserEntity user) {
        return std.updatePasswordByEmail(user.getEmail(), user.getPassword());
    }
}


//