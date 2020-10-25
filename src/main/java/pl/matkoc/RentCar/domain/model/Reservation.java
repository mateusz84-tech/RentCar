package pl.matkoc.RentCar.domain.model;

import javax.persistence.*;

@Entity
@Table(name = "reservations")
public class Reservation extends ParentEntity{

    private String date_reserve;
    @OneToOne
    @JoinColumn(name = "id_customer",
                unique = true)
    private Customer customer;
    @OneToOne
    @JoinColumn(name = "id_car",
                unique = true)
    private Car car;
    @Column(nullable = false)
    private String startDate;
    @Column(nullable = false)
    private String endDate;
    @Column(nullable = false, scale = 2, precision = 5)
    private Double totalPrice;
}
