package pl.matkoc.RentCar.domain.model;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "customers")
@Getter @Setter @ToString(callSuper = true)
// callSuper = true - odwołanie sie do id z klasy rodzica
public class Customer extends ParentEntity{

    @Column(nullable = false)
    private String name;
    @Column(nullable = false)
    private String surname;
    @Column(nullable = false, unique = true)
    private String email;
    @Column(nullable = false, unique = true)
    private String address;
}
