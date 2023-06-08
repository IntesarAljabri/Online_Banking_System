package Online_Banking_System.MyProject.Services;



import Online_Banking_System.MyProject.Models.CreditCard;
import Online_Banking_System.MyProject.Repositories.CreditCardRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CreditCardService {

    @Autowired
    CreditCardRepository creditCardRepository;

    public List<CreditCard> getAllCreditCards() {
        return creditCardRepository.findAll();
    }
}
