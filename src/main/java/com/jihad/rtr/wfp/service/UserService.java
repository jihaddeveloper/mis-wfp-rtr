package com.jihad.rtr.wfp.service;

import com.jihad.rtr.wfp.exception.ResourceNotFoundException;
import com.jihad.rtr.wfp.model.Employee;
import com.jihad.rtr.wfp.model.User;
import com.jihad.rtr.wfp.repository.EmployeeRepo;
import com.jihad.rtr.wfp.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;
import java.util.Optional;

@Service
@Transactional
public class UserService {

    @Autowired
    private UserRepository userRepo;

    //Create new user
    public User createUser(User user) {
        return userRepo.save(user);
    }

    //Get all user
    public List<User> getAllUser() {
        return userRepo.findAll();
    }

    //Get user with id
    public User getUserById(long id) {
        Optional<User> userDB = userRepo.findById(id);
        if (userDB.isPresent()) {
            return userDB.get();
        } else {
            throw new ResourceNotFoundException("Record not found with id : " + id);
        }

    }

    //Update user
    public User updateUser(User user) {
        Optional<User> userDB = userRepo.findById(user.getId());

        if (userDB.isPresent()) {
            User userDBUpdate = userDB.get();
            userDBUpdate.setId(user.getId());
            userDBUpdate.setName(user.getName());
            userDBUpdate.setUsername(user.getUsername());
            userDBUpdate.setEmail(user.getEmail());
            userDBUpdate.setPassword(user.getPassword());
            userDBUpdate.setRole(user.getRole());


            userRepo.save(userDBUpdate);

            return userDBUpdate;
        } else {
            throw new ResourceNotFoundException("Record not found with id : " + user.getId());
        }
    }

    //Delete division
    public void deleteUser(long id) {
        Optional<User> userDB = this.userRepo.findById(id);

        if (userDB.isPresent()) {
            this.userRepo.delete(userDB.get());
        } else {
            throw new ResourceNotFoundException("Record no found with id : " + id);
        }
    }
}
