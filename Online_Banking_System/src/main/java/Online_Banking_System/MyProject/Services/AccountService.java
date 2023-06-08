package Online_Banking_System.MyProject.Services;

import Online_Banking_System.MyProject.Models.Account;
import Online_Banking_System.MyProject.Repositories.AccountRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AccountService {
    @Autowired
    AccountRepository accountRepository;

    public List<Account> getAllAccounts() {
        return accountRepository.findAll();
    }
}
