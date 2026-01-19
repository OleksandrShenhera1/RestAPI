package org.oleksandr.postgres.service;

import lombok.RequiredArgsConstructor;
import org.oleksandr.postgres.dto.CreateUser;
import org.oleksandr.postgres.entity.Users;
import org.oleksandr.postgres.repository.UserRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class UserService {

    private final UserRepository userRepository;

    public List<Users> findAll() {
        return userRepository.findAll();
    }

    public Users create(CreateUser createUser) {

        Users user = new Users();
        user.setUsername(createUser.getUsername());
        user.setPassword(createUser.getPassword());
        user.setAge(createUser.getAge());


        userRepository.save(user);
        return user;
    }

}
