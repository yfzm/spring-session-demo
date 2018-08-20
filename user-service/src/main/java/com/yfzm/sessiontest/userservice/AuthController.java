package com.yfzm.sessiontest.userservice;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpSession;

@RestController
public class AuthController {

    @GetMapping("/login")
    public boolean login(String username, String password, HttpSession session) {
        if (username.equals("yfzm") && password.equals("123456")) {
            session.setAttribute("userId", "id");
            return true;
        }
        return false;
    }

}
