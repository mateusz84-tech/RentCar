package pl.matkoc.RentCar.domain.model;

import lombok.*;

import javax.persistence.*;
import java.util.Set;

@Entity(name = "users")
@Getter @Setter @EqualsAndHashCode @ToString @AllArgsConstructor @NoArgsConstructor
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    @Column(nullable = false, unique = true,length = 12)
    private String userName;
    private String password;
    private int enabled;
    @ManyToMany(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    @JoinTable(name = "user_role", joinColumns = @JoinColumn(name="user_id"),
                inverseJoinColumns = @JoinColumn(name = "role_id"))
    private Set<Role> roles;

}
