package pl.matkoc.RentCar.domain.model;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.*;
import java.math.BigDecimal;

@Entity
@Table(name = "cars")
@Getter @Setter @EqualsAndHashCode @ToString
public class Car {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String mark;
    private String model;
    private String body;
    private short yearManufacture;
    private String color;
    private int mileage;
    private String status;
    private BigDecimal amountRentedPerDay;

    @ManyToOne
    @JoinColumn(name = "company_id", updatable = false, insertable = false)
    private BranchOfCompany company;
}
