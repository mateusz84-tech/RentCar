package pl.matkoc.RentCar.domain.model;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.*;
import java.util.List;
import java.util.Set;

@Entity
@Table(name = "branch_company")
@Getter @Setter @EqualsAndHashCode @ToString
public class BranchOfCompany {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String name;
    private String street;
    private String city;
    private String zipCode;

    @OneToMany(fetch = FetchType.LAZY, mappedBy = "branchOfCompany")
    private Set<Employee> employee;


    @OneToMany(fetch = FetchType.LAZY)
    @JoinColumn(name = "id_car")
    private List<Car> cars;
}
