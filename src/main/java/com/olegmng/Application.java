package com.olegmng;

import com.olegmng.model.User;
import com.olegmng.repository.UserRepository;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Application {

	static long id = 1L;

	public static void main(String[] args) {
		UserRepository userRepository = SpringApplication.run(Application.class, args).getBean(UserRepository.class);
		saveUser(userRepository, "admin");
		saveUser(userRepository, "user");
		saveUser(userRepository, "auth");
		saveUser(userRepository, "simple");

	}
	public static void saveUser(UserRepository repository, String login){
		User user = new User();
		user.setId(id++);
		user.setLogin(login);
		user.setPassword(login);
		user.setRole(login);
		repository.save(user);

	}

}
