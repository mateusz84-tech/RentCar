package pl.matkoc.RentCar.services;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import pl.matkoc.RentCar.domain.model.Role;
import pl.matkoc.RentCar.domain.model.User;

import javax.transaction.Transactional;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class MyUserDetailService implements UserDetailsService {

    private UserService userService;

    private List<GrantedAuthority> getUserAuthority(Set<Role> userRole){
        Set<GrantedAuthority> roles = new HashSet<>();
        for(Role role : userRole){
            roles.add(new SimpleGrantedAuthority(role.getName()));
        }
        return new ArrayList<>(roles);
    }

    private UserDetails buildUserForAuthentication(User user, List<GrantedAuthority> authorities){
        return new org.springframework.security.core.userdetails.User(user.getUserName(), user.getPassword(), authorities);
    }

    @Override
    @Transactional
    public UserDetails loadUserByUsername(String userName) {
        if(userName.isBlank() || userName.isEmpty()){
            throw new IllegalArgumentException("Nazwa użytkownika nie może być pusta.");
        }
        if(userName.equals(null)){
            throw new UsernameNotFoundException(null);
        }
        User user = userService.findUserByName(userName);
        List<GrantedAuthority> authorities = getUserAuthority(user.getRoles());
        return buildUserForAuthentication(user, authorities);
    }
}
