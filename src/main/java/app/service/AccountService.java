package app.service;

import app.entity.Account;
import app.repository.AccountRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class AccountService {
    @Autowired
    AccountRepository repository;

    public Account getByUsernameAndPassword(String username , String password){
        System.out.println("Username" + username);
        System.out.println("Password" + password);
        Account account =  repository.findByUsernameAndPassword(username,password);
        System.out.println("Account" + account);
        return account;

    }
}
