package com.jihad.rtr.wfp.controller;


import com.jihad.rtr.wfp.model.Employee;
import com.jihad.rtr.wfp.model.User;
import com.jihad.rtr.wfp.service.DivisionService;
import com.jihad.rtr.wfp.service.EmployeeService;
import com.jihad.rtr.wfp.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping(value = "/api/v1/", produces = "application/json")
public class UserController {

    @Autowired
    private UserService userService;

    //Create new User
    @RequestMapping(value = "/user", method = RequestMethod.POST)
    public ResponseEntity<User> createUser(@RequestBody User user) {
        return ResponseEntity.ok().body(this.userService.createUser(user));
    }

    //Get all User
    @RequestMapping(value = "/user", method = RequestMethod.GET)
    public ResponseEntity<List<User>> fetchAllUsers() {
        return ResponseEntity.ok().body(this.userService.getAllUser());
    }

    //User with id
    @RequestMapping(value = "/user/{id}", method = RequestMethod.GET)
    public ResponseEntity<User> getSingleUser(@PathVariable long id) {
        return ResponseEntity.ok().body(this.userService.getUserById(id));
    }

    //Update User
    @RequestMapping(value = "/user/{id}", method = RequestMethod.PATCH, consumes = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<User> updateUser(@PathVariable long id, @RequestBody User user) {
        user.setId(id);
        return ResponseEntity.ok().body(this.userService.updateUser(user));
    }

    //Delete employee
    @RequestMapping(value = "/user/{id}", method = RequestMethod.DELETE)
    public HttpStatus deleteUser(@PathVariable long id) {
        this.userService.deleteUser(id);
        return HttpStatus.OK;
    }
}
