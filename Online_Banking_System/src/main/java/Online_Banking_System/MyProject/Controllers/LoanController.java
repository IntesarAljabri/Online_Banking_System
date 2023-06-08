package Online_Banking_System.MyProject.Controllers;

import Online_Banking_System.MyProject.Models.Loan;
import Online_Banking_System.MyProject.Services.LoanService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
@RestController
@RequestMapping(value = "loans")
public class LoanController {

    @Autowired
    LoanService loanService;
    @GetMapping(value = "getAll")
    public List<Loan> getAllLoan() {
        return loanService.getAllLoans();
    }//    }//http://localhost:8080/loans/getAll

}
