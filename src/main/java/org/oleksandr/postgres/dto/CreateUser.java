package org.oleksandr.postgres.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

// lombok
@Data // getter & setter
@NoArgsConstructor // base constructor
@AllArgsConstructor // args constructor

public class CreateUser {
    private String username;
    private String password;
    private int age;

}
