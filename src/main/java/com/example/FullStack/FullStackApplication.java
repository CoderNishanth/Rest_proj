package com.example.FullStack;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class FullStackApplication {

	public static void main(String[] args) {
		SpringApplication.run(FullStackApplication.class, args);
		method();
	}
	public static void method() {
		String url = "jdbc:mysql://localhost:3306/Fullstack";
		String user = "root";
		String pass = "root";
		try(Connection conn = DriverManager.getConnection(url,user,pass)){
			if(conn!=null) {
				System.out.println("Connected Successfully");
			}
		}
		catch(SQLException e) {
			System.out.println("Connection Unsuccessfull..  " + e.getMessage());
		}
	}
}
