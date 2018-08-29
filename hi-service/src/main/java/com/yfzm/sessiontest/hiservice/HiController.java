package com.yfzm.sessiontest.hiservice;

import com.yfzm.util.utildemo.AutoTest;
import com.yfzm.util.utildemo.Calculator;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpSession;

@RestController
public class HiController {

    @Autowired
    private AutoTest autoTest;

    @GetMapping("/")
    public String sayHi(HttpSession session) {
        if (session == null || session.getAttribute("userId") == null) {
            return "Error when parsing session";
        }
        String sessionId = (String) session.getAttribute("userId");
        return sessionId + String.valueOf(autoTest.getNumber());
    }

}
