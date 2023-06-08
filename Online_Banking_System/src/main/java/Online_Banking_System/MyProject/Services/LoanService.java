package Online_Banking_System.MyProject.Services;

import Online_Banking_System.MyProject.Models.Loan;
import Online_Banking_System.MyProject.Repositories.LoanRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LoanService {

    @Autowired
    LoanRepository loanRepository;

    public List<Loan> getAllLoans() {
        return loanRepository.findAll();
    }
}
