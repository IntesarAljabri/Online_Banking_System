package Online_Banking_System.MyProject.Controllers;

import Online_Banking_System.MyProject.Models.CreditCard;
import Online_Banking_System.MyProject.Services.CreditCardService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "creditCards")
public class CreditCardController {
    @Autowired
    CreditCardService creditCardService;

    @GetMapping(value = "getAll")
    public List<CreditCard> getAllCreditCards() {
        return creditCardService.getAllCreditCards();
    }//    }//http://localhost:8080/creditCards/getAll


}
