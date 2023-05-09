package Online_Banking_System.MyProject.Services;

import Online_Banking_System.MyProject.Models.Transaction;
import Online_Banking_System.MyProject.Repositories.TransactionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TransactionService {

    @Autowired
    TransactionRepository transactionRepository;

    public List<Transaction> getAllTransactions(){
        return transactionRepository.findAll();
    }
}
