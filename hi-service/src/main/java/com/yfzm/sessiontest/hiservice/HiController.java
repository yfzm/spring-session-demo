package com.yfzm.sessiontest.hiservice;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpSession;

@RestController
public class HiController {

    @GetMapping("/")
    public String sayHi(HttpSession session) {
        if (session == null || session.getAttribute("userId") == null) {
            return "Error when parsing session";
        }
        return (String) session.getAttribute("userId");
    }

}
