package com.example.FullStack.Service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.FullStack.Entity.UserEntity;
import com.example.FullStack.Repository.UserRepo;

@Service
public class UserService {
	@Autowired 
    UserRepo repo;
	
	public String userRegister(UserEntity user) {
		repo.save(user);
		return "User Registered Successfully";
	}
	
	public List<UserEntity> getallusers(){
		return repo.findAll();
	}

	public String login(String email, String password) {
        UserEntity user = repo.findByEmail(email);
        if (user != null && user.getPassword().equals(password)) {
            return "Login Successful";
        }
        return "Invalid Email or Password";
    }

	public String updatePasswordByEmail(String email, String newPassword) {
		UserEntity user = repo.findByEmail(email);
		if (user != null) {
			user.setPassword(newPassword);
			repo.save(user);
			return "Password updated successfully";
		}
		return "User not found";
	}
}
