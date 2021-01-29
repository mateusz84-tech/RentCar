package pl.matkoc.RentCar.domain.model;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.*;

@Entity
@Table(name = "employee")
@Getter @Setter @EqualsAndHashCode @ToString
public class Employee {
    @Id@GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String firstName;
    private String lastName;
    private String workStation;

    @ManyToOne
    @JoinColumn(name = "id_company", updatable = false, insertable = false)
    private BranchOfCompany branchOfCompany;

}
