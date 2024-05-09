package com.jpa.test;

import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.jpa.test.dao.UserRepository;
import com.jpa.test.entities.User;

@SpringBootApplication
public class SpringbootJpaProjectApplication {

	public static void main(String[] args) {

		ApplicationContext context = SpringApplication.run(SpringbootJpaProjectApplication.class, args);

		UserRepository userRepository = context.getBean(UserRepository.class);

		// creating user1 object to insert
		User user1 = new User();
		user1.setName("Abhishek");
		user1.setCity("Pune");
		user1.setStatus("SNP");

		// creating user2 object to insert
		User user2 = new User();
		user2.setName("Sumit");
		user2.setCity("Noida");
		user2.setStatus("Working");

		// 1:saving single user
		// User savedUser= userRepository.save(user1);

		// 2: saving multiple users	
		/*
		 * List<User> listOfUser =List.of(user1, user2);
		 * 
		 * // saving all users in one go List<User> savedUsers =
		 * userRepository.saveAll(listOfUser);
		 */


		// 3: updating Sumit's city by id 153
		/*
		 * Optional<User> optional = userRepository.findById(153); User user =
		 * optional.get();
		 * 
		 * // setting city of sumit user.setCity("Gurgaon");
		 * 
		 * User savedUser = userRepository.save(user);
		 * 
		 * System.out.println(savedUser);
		 */

		// 4: findAll
		/*
		 * Iterable<User> itr = userRepository.findAll(); // Iterator<User> iterator =
		 * itr.iterator();
		 * 
		 * 
		 * while(iterator.hasNext()) { User user = iterator.next();
		 * System.out.println(user); }
		 * 
		 * // or
		 * 
		 * itr.forEach(user->System.out.println(user));
		 */
		
		//5.1: DeletebyID
		/*
		 * userRepository.deleteById(153); System.out.println("Deleting user 153");
		 */

		//5.2: DeleteAll
		/*
		 * userRepository.deleteAll(); System.out.println("Deleting all users");
		 */
		
		//6. Custom Finder Methods / Derived Query Methods
		
		// example 1: find all the user details by name
		/*
		 * List<User> userByName = userRepository.findByName("Abhishek");
		 * 
		 * userByName.forEach(user->System.out.print(user));
		 */
		
		// example 2: find all the user details by name and city
		/*
		 * List<User> userNameCity =
		 * userRepository.findByNameAndCity("Abhishek","Pune");
		 * userNameCity.forEach(user->System.out.print(user));
		 */
		
		// example 3: find all the user details by name and city
		/*
		 * List<User> userNameCity = userRepository.findByNameStartingWith("S");
		 * userNameCity.forEach(user->System.out.print(user));
		 */
		
		// 7. JPQL / Native Query 
		List<User> allUsers = userRepository.getAllUsers();
		
		allUsers.forEach(user->{
			System.out.println(user);
		});
		
		System.out.println("______________________________");
		
		List<User> userByNameCity = userRepository.getUserByNameAndCity("Abhishek", "Pune");
		
		userByNameCity.forEach(user->{
			System.out.println(user);
		});
		
		
		System.out.println("______________________________");
		
		List<User> getUsers = userRepository.getUsers();
		
		getUsers.forEach(user->{
			System.out.println(user);
		});
		
		
	}

}
