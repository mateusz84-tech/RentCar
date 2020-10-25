package pl.matkoc.RentCar.domain.model;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.hibernate.annotations.Parent;

import javax.persistence.*;

@Entity
@Table(name = "returns")
@Getter @Setter @ToString(callSuper = true)
public class Return extends ParentEntity {

    @OneToOne
    @JoinColumn(name = "id_return")
    private Employee employee;
    @Column(nullable = false)
    private String returnCar;
    @OneToOne
    @JoinColumn(name = "id_return")
    private Reservation reservation;
    @Column(nullable = true, scale = 2, precision = 5)
    private Double additionalPayment;
    @Column(nullable = true)
    private String comments;
}
