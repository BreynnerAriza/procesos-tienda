package com.procesos.tienda.model;

import lombok.Data;

@Data //Sirve para crear los setters and getters
public class User {

    private long id;
    private String firstName;
    private String lastName;
    private String document;
    private String phone;
    private String email;
    private String password;

}
