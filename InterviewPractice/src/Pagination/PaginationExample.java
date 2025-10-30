package Pagination;

/*
package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.User;
import com.example.demo.repository.UserRepository;

@RestController
public class UserController {

    @Autowired
    private UserRepository userRepository;

    // GET /users?page=0&size=5
    @GetMapping("/users")
    public Page<User> getUsers(
            @RequestParam(defaultValue = "0") int page,
            @RequestParam(defaultValue = "5") int size) {

        Pageable pageable = PageRequest.of(page, size);
        return userRepository.findAll(pageable);
    }
}


GET http://localhost:8080/users?page=0&size=5


GET http://localhost:8080/users?page=1&size=5


{
  "content": [
    {
      "userId": 1,
      "name": "Abhishek Parmar",
      "email": "abhishek@gmail.com",
      "about": "Content Creator and Podcaster"
    },
    {
      "userId": 2,
      "name": "Lakhan Parmar",
      "email": "lakhan@gmail.com",
      "about": "Software Developer at Accenture"
    }
  ],
  "pageable": {
    "pageNumber": 0,
    "pageSize": 2
  },
  "totalPages": 5,
  "totalElements": 10,
  "last": false
}

*/