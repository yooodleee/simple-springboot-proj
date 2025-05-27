package com.example.simplespringbootproj;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@RestController
public class RegisterController {

    @PostMapping("/register")
    public String register(@RequestBody RegisterRequest request) {
        return "success: " + request.getName() + ", email: " + request.getEmail();
    }

    static class RegisterRequest {
        private String name;
        private String email;

        public String getName() { return name; }
        public void setname(String name) { this.name = name; }

        public String getEmail() { return email; }
        public void setEmail(String email) { this.email = email; }
    }
}
