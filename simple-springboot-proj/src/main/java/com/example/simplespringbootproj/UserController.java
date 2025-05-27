package com.example.simplespringbootproj;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

    @GetMapping("/user")
    public User getUser() {
        return new User(1, "yooodleee", "yooodleee@example.com");
    }

    static class User {
        private int id;
        private String name;
        private String email;

        public User(int id, String name, String email) {
            this.id = id;
            this.name = name;
            this.email = email;
        }

        // Getter/Setter 필수 (Spring이 JSON으로 변환하려면 필요)
        public int getId() { return id; }
        public String getName() { return name; }
        public String getEmail() { return email; }
    }
}
