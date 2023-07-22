package com.project.sep.back;

import com.project.sep.back.Entity.User;
import com.project.sep.back.Repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserService {

    private final UserRepository userRepository;

    @Autowired
    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    // Create
    public User createUser(User user) {
        return userRepository.save(user);
    }

    // Read (One)
    public Optional<User> getUser(Long id) {
        return userRepository.findById(id);
    }

    // Read (All)
    public List<User> getUsers() {
        return userRepository.findAll();
    }

    // Update
    public User updateUser(User user) {
        return userRepository.save(user);
    }

    // Delete
    public void deleteUser(Long id) {
        userRepository.deleteById(id);
    }
}
