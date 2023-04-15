package com.example.demo.registration;

import lombok.*;

@Getter
@AllArgsConstructor
@EqualsAndHashCode
@ToString



public class RegistrationRequest {

    private String firstName;
    private String secondName;
    private String password;
    private String email;

    public String getFirstName() {
        return firstName;
    }
    public void setFirstName(String value){
        firstName = value;
    }
    public String getSecondName(){
        return secondName;
    }
    public void setSecondName(String value){
        secondName = value;
    }
    public String getPassword(){
        return password;
    }
    public void setPassword(String value){
        password = value;
    }
    public String getEmail(){
        return email;
    }
    public void setEmail(String value){
        email = value;
    }

}



