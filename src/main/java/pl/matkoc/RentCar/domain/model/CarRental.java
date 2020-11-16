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
public class CarRental extends ParentEntity {

    @Column(nullable = false)
    private String name;
    @Column(nullable = false)
    private String city;
    @Column(nullable = false)
    private String address;

    public CarRental(){
    }

    @OneToMany(fetch = FetchType.EAGER, cascade = CascadeType.REMOVE)
    @JoinColumn(name = "id_rental")
    @Column(nullable = true)
    private Set<Employee> employee = new HashSet<>();

    @OneToMany(fetch = FetchType.EAGER, cascade = CascadeType.REMOVE)
    @JoinColumn(name = "id_rental")
    @Column(nullable = true)
    private List<Car> car = new ArrayList<>();

    @OneToMany(fetch = FetchType.EAGER,cascade = CascadeType.REMOVE)
    @JoinColumn(name = "id_rental")
    @Column(nullable = true)
    private Set<Customer> customers = new HashSet<>();

    @OneToMany(fetch = FetchType.EAGER, cascade = CascadeType.REMOVE)
    @JoinColumn(name = "id_rental")
    @Column(nullable = true)
    private Set<Reservation> reservations = new HashSet<>();

    @OneToMany(fetch = FetchType.EAGER, cascade = CascadeType.REMOVE )
    @JoinColumn(name = "id_rental")
    @Column(nullable = true)
    private Set<Return> returns = new HashSet<>();
}
