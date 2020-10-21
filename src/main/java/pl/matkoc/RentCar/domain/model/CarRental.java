package pl.matkoc.RentCar.domain.model;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

@Entity
@Table(name = "rental")
public class CarRental extends ParentEntity{

    @Column(nullable = false)
    private String city;
    @Column(nullable = false)
    private String address;

    @OneToMany
    @JoinColumn(name = "employee_id")
    private Set<Employee> employee = new HashSet<>();

    @OneToMany
    @JoinColumn(name = "car_id")
    private List<Car> car = new ArrayList<>();
}
