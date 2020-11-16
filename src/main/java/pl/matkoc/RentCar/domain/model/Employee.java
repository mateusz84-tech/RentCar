package pl.matkoc.RentCar.domain.model;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "employees")
@Getter @Setter @ToString(callSuper = true)
public class Employee extends ParentEntity {

    @Column(nullable = false)
    private String name;
    @Column(nullable = false)
    private String lastName;

}
