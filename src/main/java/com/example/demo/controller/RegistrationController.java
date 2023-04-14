package com.example.demo.controller;

import com.example.demo.registration.RegistrationRequest;
import com.example.demo.registration.RegistrationService;
import org.springframework.web.bind.annotation.RequestBody;

public class RegistrationController {
    private RegistrationService registrationService;

    public String register(@RequestBody RegistrationRequest request){
        return registrationService.register(request);
    }
}
