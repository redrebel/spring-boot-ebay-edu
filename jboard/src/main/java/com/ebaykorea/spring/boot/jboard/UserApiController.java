package com.ebaykorea.spring.boot.jboard;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserApiController {

    @Autowired
    private UserService userService;

    public UserApiController() {
        System.out.println("UserApiController()");
    }
}
