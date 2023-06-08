package Online_Banking_System.MyProject.Repositories;

import Online_Banking_System.MyProject.Models.Transaction;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TransactionRepository  extends JpaRepository<Transaction,Long> {
}
