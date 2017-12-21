package com.lnu.models;

public class User {
    private String UserName;
    private String Email;
    private String Login;
    private String Password;
    private String PhoneNumber;
    private String Course;
    private int Roles;


    public User(String line) {
        String[] split = line.split(",");
        this.UserName = split[0];
        this.Email = split[1];
        this.Login = split[2];
        this.Password = split[3];
        this.PhoneNumber = split[4];
        this.Course = split[5];
        this.Roles = Integer.parseInt(split[6]);
    }

    public User(){}

    public String getUserName() {
        return UserName;
    }

    public void setUserName(String userName) {
        UserName = userName;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String email) {
        Email = email;
    }

    public String getLogin() {
        return Login;
    }

    public void setLogin(String login) {
        Login = login;
    }

    public String getPassword() {
        return Password;
    }

    public void setPassword(String password) {
        Password = password;
    }

    public String getPhoneNumber() {
        return PhoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        PhoneNumber = phoneNumber;
    }

    public String getCourse() {
        return Course;
    }

    public void setCourse(String course) {
        Course = course;
    }

    public int getRoles() {
        return Roles;
    }

    public void setRoles(int roles) {
        Roles = roles;
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
