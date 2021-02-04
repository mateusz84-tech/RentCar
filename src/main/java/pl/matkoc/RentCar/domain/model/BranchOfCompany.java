package pl.matkoc.RentCar.domain.model;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.hibernate.validator.constraints.Range;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Entity
@Table(name = "branch_company")
@Getter @Setter @EqualsAndHashCode @ToString
public class BranchOfCompany {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @NotBlank
    @NotEmpty
    @Size(min=3, max=12)
    private String name;

    @NotBlank
    @NotEmpty
    @Size(min=3, max=12)
    private String street;

    @NotBlank
    @NotEmpty
    @Size(min=3, max=12)
    private String city;

    @NotBlank
    @NotEmpty
    @Size(min=3, max=12)
    private String zipCode;

//    @OneToMany(mappedBy = "branchOfCompany")
//    private Set<Employee> employees = new HashSet<>();
//
//    @OneToMany(mappedBy = "company")
//    private List<Car> cars = new ArrayList<>();

//    @OneToMany
//    @JoinColumn(name = "company_id",
//                nullable = false)
//    @OrderColumn(name = "employee_position", nullable = false)
//    private Set<Employee> employees = new HashSet<>();
//
//    @OneToMany
//    @JoinColumn(name = "company_id",
//                nullable = false)
//    @OrderColumn(name = "car_position", nullable = false)
//    private List<Car> cars = new ArrayList<>();
}
