package pl.matkoc.RentCar.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
// klas konfiguracyjna do korzystania ze Spring Data
@Configuration
// informacja o skanowanym pakiecie jak w przypadku @ComponentScan
@EnableJpaRepositories(basePackages = "pl.matkoc.RentCar.repository")
public class AppConfig {
}
