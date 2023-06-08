package Online_Banking_System.MyProject.Repositories;

import Online_Banking_System.MyProject.Models.Investment;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface InvestmentRepository extends JpaRepository<Investment,Long> {
}
