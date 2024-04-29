package com.devsuperior.dsmovie.services;

import com.devsuperior.dsmovie.dto.UserDTO;
import com.devsuperior.dsmovie.entities.User;
import com.devsuperior.dsmovie.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    @Autowired
    private UserRepository repository;

    public UserDTO findById(Long id) {
        User result = repository.findById(id).get();
        UserDTO dto = new UserDTO(result);
        return dto;
    }

    public UserDTO checkLogin (String email, String password) throws Exception {
        User user = new User();
        user.setEmail(email);
        user.setPassword(password);
        user = repository.findByEntity(user);

        if (user != null) {
            return new UserDTO(user);
        } else {
            throw new Exception();
        }
    }
}
