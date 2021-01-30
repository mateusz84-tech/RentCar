package pl.matkoc.RentCar.repository;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import pl.matkoc.RentCar.domain.model.BranchOfCompany;
import java.util.List;

public interface BranchCompanyRepository extends JpaRepository<BranchOfCompany, Long> {

    // metoda pobiera listę oddziałów
    // "SELECT br FROM BranchOfCompany br JOIN br.cars JOIN br.employee"
    //SELECT br FROM BranchOfCompany br LEFT JOIN FETCH br.employees LEFT JOIN FETCH br.cars
    @Query("SELECT br FROM BranchOfCompany br LEFT JOIN FETCH br.employees LEFT JOIN FETCH br.cars")
    List<BranchOfCompany> findBranchOfCompany();

    @Override
    List<BranchOfCompany> findAll();
}
