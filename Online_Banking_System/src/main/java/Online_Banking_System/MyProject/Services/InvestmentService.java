package Online_Banking_System.MyProject.Services;

import Online_Banking_System.MyProject.Models.Investment;
import Online_Banking_System.MyProject.Repositories.InvestmentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class InvestmentService {
    @Autowired
    InvestmentRepository investmentRepository;


    public List<Investment> getAllInvestments() {
        return investmentRepository.findAll();
    }
}
