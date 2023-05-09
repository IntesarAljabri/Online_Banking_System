package Online_Banking_System.MyProject.Controllers;

import Online_Banking_System.MyProject.Models.Account;
import Online_Banking_System.MyProject.Services.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "accounts")
public class AccountController {

    @Autowired
    AccountService accountService;

    @GetMapping(value = "getAll")
    public List<Account> getAllAccounts() {
        return accountService.getAllAccounts();
    }//http://localhost:8080/accounts/getAll
}