package Online_Banking_System.MyProject.Services;

import Online_Banking_System.MyProject.Models.Statement;
import Online_Banking_System.MyProject.Repositories.StatementRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StatementService {

    @Autowired
    StatementRepository statementRepository;

    public List<Statement> getAllStatements(){
        return statementRepository.findAll();
    }
}
