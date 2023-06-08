package Online_Banking_System.MyProject.Controllers;

import Online_Banking_System.MyProject.Models.Statement;
import Online_Banking_System.MyProject.Services.StatementService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "statements")
public class StatementController {

    @Autowired
    StatementService statementService;

    @GetMapping(value = "getAll")
    public List<Statement> getAllStatements() {
        return statementService.getAllStatements();
    }//    }//http://localhost:8080/statements/getAll
}
