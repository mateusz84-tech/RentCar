package pl.matkoc.RentCar.domain.model;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

@Entity
@Table(name = "rental")
@Getter @Setter @ToString(callSuper = true)
public class CarRental extends ParentEntity{

    @Column(nullable = false)
    private String city;
    @Column(nullable = false)
    private String address;

    @OneToMany
    @JoinColumn(name = "id_rental")
    private Set<Employee> employee = new HashSet<>();

    @OneToMany
    @JoinColumn(name = "id_rental")
    private List<Car> car = new ArrayList<>();

    @OneToMany
    @JoinColumn(name = "id_rental")
    private Set<Customer> customers = new HashSet<>();

    @OneToMany
    @JoinColumn(name = "id_rental")
    private Set<Reservation> reservations = new HashSet<>();
}
