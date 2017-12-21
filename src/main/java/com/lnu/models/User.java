package com.lnu.models;

public class User {
    private String userName;
    private String email;
    private String login;
    private String password;
    private String phoneNumber;
    private String course;
    private int roles;


    public User(String userName, String email, String login, String password, String phoneNumber, String course, int roles){
        this.userName = userName;
        this.email = email;
        this.login = login;
        this.password = password;
        this.phoneNumber = phoneNumber;
        this.course = course;
        this.roles = roles;
    }

    public User(){}

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getCourse() {
        return course;
    }

    public void setCourse(String course) {
        this.course = course;
    }

    public int getRoles() {
        return roles;
    }

    public void setRoles(int roles) {
        this.roles = roles;
    }

    @Override
    public String toString(){
        return "\n\nUserName: "+getUserName()+ ", \n"
                + "Email: "+ getEmail() + ", \n"
                + "Login: " + getLogin() + ",\n"
                + "Password: "+ getPassword() + ",\n"
                + "PhoneNumber: " + getPhoneNumber() + ",\n"
                + "Course: " + getCourse() + ",\n"
                + "Roles: " + getRoles();
    }
}
