package com.devsuperior.dsmovie.dto;

import com.devsuperior.dsmovie.entities.User;

public class UserDTO {

    private Long id;

    private String email;

    private String password;

    private String name;

    public UserDTO() {

    }

    public UserDTO(Long id, String email, String password, String name) {
        this.id = id;
        this.email = email;
        this.password = password;
        this.name = name;
    }

    public UserDTO(User user) {
        id = user.getId();
        email = user.getEmail();
        password = user.getPassword();
        name = user.getName();
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setId(String password) {
        this.password = password;
    }
}
