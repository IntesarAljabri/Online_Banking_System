package Online_Banking_System.MyProject.Services;

import Online_Banking_System.MyProject.Models.Transfer;
import Online_Banking_System.MyProject.Repositories.TransferRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TransferService {
    @Autowired
    TransferRepository transferRepository;

    public List<Transfer> getAllTransfers(){
        return transferRepository.findAll();
    }
}
