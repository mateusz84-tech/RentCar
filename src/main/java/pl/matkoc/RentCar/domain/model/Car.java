package pl.matkoc.RentCar.domain.model;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.*;

@Entity
@Table(name = "cars")
@Getter @Setter @ToString(callSuper = true)
public class Car extends ParentEntity {

    @Column(nullable = false)
    private String mark;
    @Column(nullable = false)
    private String model;
    @Column(nullable = false)
    private String body_type;
    @Column(nullable = false)
    private String production_year;
    @Column(nullable = false)
    private String color;
    @Column(nullable = false)
    private Integer km_traveled;
    @Column(nullable = false)
    private String status;
    @Column(nullable = false, scale=2, precision = 5)
    private Double price_per_day;

}
