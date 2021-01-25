package pl.matkoc.RentCar.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import pl.matkoc.RentCar.domain.model.BranchOfCompany;

import java.util.List;

public interface BranchCompanyRepository extends JpaRepository<BranchOfCompany, Long> {

    // metoda pobiera listę oddziałów
    @Query("SELECT br FROM BranchOfCompany br ORDER BY br.city")
    List<BranchOfCompany> findBranchOfCompany();


}
