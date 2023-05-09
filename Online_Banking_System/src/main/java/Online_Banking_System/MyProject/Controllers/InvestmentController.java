package Online_Banking_System.MyProject.Controllers;


import Online_Banking_System.MyProject.Models.Investment;
import Online_Banking_System.MyProject.Services.InvestmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "investments")
public class InvestmentController {

    @Autowired
    InvestmentService investmentService;
    @GetMapping(value = "getAll")
    public List<Investment> getAllInvestment() {
        return investmentService.getAllInvestments();
    }//
}
