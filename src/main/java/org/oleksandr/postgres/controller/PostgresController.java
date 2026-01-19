package org.oleksandr.postgres.controller;

import lombok.RequiredArgsConstructor;
import org.oleksandr.postgres.dto.CreateUser;
import org.oleksandr.postgres.dto.StudentName;
import org.oleksandr.postgres.entity.Users;
import org.oleksandr.postgres.service.UserService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/postgres")
@RequiredArgsConstructor
public class PostgresController {

    private final UserService userService;

    @GetMapping("/{student}/Postgres")
    public ResponseEntity<String> GetPostgres(
            @PathVariable StudentName student) {

        List<Users> allUsers = userService.findAll();

        return ResponseEntity.ok("Get: data sent.\n" + allUsers);
    }

    @PostMapping("/{student}/Postgres")
    public ResponseEntity<String> PostPostgres(
            @PathVariable StudentName student,
            @RequestBody CreateUser createUser) {

        userService.create(createUser);

        return ResponseEntity.ok("Post: data retrieved. \n" + createUser);
    }

}

