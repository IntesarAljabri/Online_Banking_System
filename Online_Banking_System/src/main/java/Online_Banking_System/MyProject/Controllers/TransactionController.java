package Online_Banking_System.MyProject.Controllers;

import Online_Banking_System.MyProject.Models.Transaction;
import Online_Banking_System.MyProject.Services.TransactionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "transactions")
public class TransactionController {

    @Autowired
    TransactionService transactionService;

    @GetMapping(value = "getAll")
    public List<Transaction> getAllTransactions() {
        return transactionService.getAllTransactions();
    }//    }//http://localhost:8080/transactions/getAll
}
