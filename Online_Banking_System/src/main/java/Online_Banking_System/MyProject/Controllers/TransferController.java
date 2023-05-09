package Online_Banking_System.MyProject.Controllers;

import Online_Banking_System.MyProject.Models.Transfer;
import Online_Banking_System.MyProject.Services.TransferService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
@RestController
@RequestMapping(value = "transfers")
public class TransferController {

    @Autowired
    TransferService transferService;

    @GetMapping(value = "getAll")
    public List<Transfer> getAllTransfers() {
        return transferService.getAllTransfers();
    }//    }//http://localhost:8080/transfers/getAll
}
