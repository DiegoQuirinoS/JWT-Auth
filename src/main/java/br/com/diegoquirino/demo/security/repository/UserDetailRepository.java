package br.com.diegoquirino.demo.security.repository;

import br.com.diegoquirino.demo.security.model.Usuario;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserDetailRepository extends CrudRepository<Usuario, Long> {

    Usuario findByUsername(String username);

}
