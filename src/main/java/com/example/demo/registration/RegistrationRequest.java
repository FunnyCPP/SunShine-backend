package com.example.demo.registration;

import lombok.*;

@Getter
@AllArgsConstructor
@EqualsAndHashCode
@ToString



public class RegistrationRequest {

    private final String firstName;
    private final String secondName;
    private final String password;
    private final String email;


}
