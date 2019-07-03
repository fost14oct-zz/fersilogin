package app.controller;

import app.entity.Account;
import app.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/account")
public class AccountController {
    @Autowired
    AccountService service;

    @GetMapping(path="/{username}/{password}",  produces= MediaType.APPLICATION_JSON_VALUE)
    public Account getById(@PathVariable(required = true) String username, @PathVariable(required = true) String password) {
        System.out.println("Username" + username);
        System.out.println("Password" + password);
        Account account = service.getByUsernameAndPassword(username,password);
        System.out.println("Account" + account);
        return account;
    }
}

