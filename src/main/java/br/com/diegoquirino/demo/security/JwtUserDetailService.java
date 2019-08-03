package br.com.diegoquirino.demo.security;

import br.com.diegoquirino.demo.security.model.Usuario;
import br.com.diegoquirino.demo.security.repository.UserDetailRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Component;

import java.util.ArrayList;

@Component
public class JwtUserDetailService implements UserDetailsService {

    @Autowired
    private UserDetailRepository userDetailRepository;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        final Usuario usuario = userDetailRepository.findByUsername(username);
        if(usuario != null){
            return new User(usuario.getUsername(), usuario.getPassword(), new ArrayList<>());
        }else{
            throw new UsernameNotFoundException("Not found");
        }
    }


}
