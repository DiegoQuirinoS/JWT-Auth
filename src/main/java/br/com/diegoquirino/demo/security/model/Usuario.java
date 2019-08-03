package br.com.diegoquirino.demo.security.model;

import javax.persistence.*;

@Entity(name = "user")
@SequenceGenerator(name = "pessoa_sequence", sequenceName = "pessoa_sequence", allocationSize = 1)
public class Usuario {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator="pessoa_sequence")
    private Long id;

    private String password;
    private String username;

    public Usuario(){}

    public Usuario(String username, String password) {
        this.password = password;
        this.username = username;
    }


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getPassword() {
        return this.password;
    }

    public String getUsername() {
        return this.username;
    }


}
