package com.pojo;

public class User{
    private Long id;
    private String firstName;
    private String lastName;
    private String userName;
    private String password;
    private String userGreeting;


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getUserGreeting() {
        return userGreeting;
    }

    public void setUserGreeting(String userGreeting) {
        this.userGreeting = userGreeting;
    }
}

