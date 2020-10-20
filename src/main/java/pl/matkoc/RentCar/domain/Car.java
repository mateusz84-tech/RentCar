package pl.matkoc.RentCar.domain;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import pl.matkoc.RentCar.domain.model.ParentEntity;

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
    @Column(nullable = false)
    private Double price_per_day;

}
