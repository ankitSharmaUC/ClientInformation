package com.unicommerce.clientInformation.controller;

import com.unicommerce.clientInformation.entity.User;
import com.unicommerce.clientInformation.service.user.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
public class UserController {
    @Autowired
    private IUserService userService;

    @PostMapping("/poc/create")
    ResponseEntity createPoc(@RequestBody User poc, @RequestParam(value = "tenantCode") String tenantCode){
        return userService.createPoc(poc, tenantCode);
    }

    @GetMapping("/poc/search")
    ResponseEntity searchPoc(@RequestParam(value = "tenantCode") String tenantCode){
        return userService.searchPoc(tenantCode);
    }
}
