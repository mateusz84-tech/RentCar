package pl.matkoc.RentCar.domain.model;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.*;
import java.util.List;
import java.util.Set;

@Entity
@Table(name = "car_rent")
@Getter @Setter @EqualsAndHashCode @ToString
public class CarRent {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String name;
    private String website;
    private String owner;

    @OneToMany(fetch = FetchType.LAZY)
    @JoinColumn(name = "id_branch_company")
    private List<BranchOfCompany> branchOfCompany;
}
