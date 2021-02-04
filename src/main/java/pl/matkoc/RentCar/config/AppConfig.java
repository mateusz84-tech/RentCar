package pl.matkoc.RentCar.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.web.servlet.LocaleContextResolver;
import org.springframework.web.servlet.i18n.SessionLocaleResolver;

import java.util.Locale;

// klas konfiguracyjna do korzystania ze Spring Data
@Configuration
// informacja o skanowanym pakiecie jak w przypadku @ComponentScan
@EnableJpaRepositories(basePackages = "pl.matkoc.RentCar.repository")
public class AppConfig {

    // ustawienie domyślnego języka na polski dla walidacji
    @Bean(name="localeResolver")
    public LocaleContextResolver getLocaleResolverContext(){
        // informacje będą trzymane w sesji
        SessionLocaleResolver localeResolver = new SessionLocaleResolver();
        localeResolver.setDefaultLocale(new Locale("pl","PL"));
        return localeResolver;
    }
}
