package pl.matkoc.RentCar.domain.model;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.hibernate.mapping.Bag;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.HashSet;
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

    @OneToMany
    @JoinColumn(name = "company_id",
                nullable = false)
    @OrderColumn(name = "employee_position", nullable = false)
    private Set<Employee> employees = new HashSet<>();

    @OneToMany
    @JoinColumn(name = "company_id",
                nullable = false)
    @OrderColumn(name = "car_position", nullable = false)
    private List<Car> cars = new ArrayList<>();
}
