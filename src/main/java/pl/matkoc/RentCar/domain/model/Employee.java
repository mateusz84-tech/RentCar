package pl.matkoc.RentCar.domain.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "employees")
public class Employee extends ParentEntity{

    @Column(nullable = false)
    private String name;
    @Column(nullable = false)
    private String lastName;

}
