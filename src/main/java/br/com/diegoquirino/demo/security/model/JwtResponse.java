package br.com.diegoquirino.demo.security.model;

import java.io.Serializable;

public class JwtResponse implements Serializable {
    private static final long serialVersionUID = -5584223163583576152L;

    private final String jwtResponse;

    public JwtResponse(String jwtResponse){
        this.jwtResponse = jwtResponse;
    }

    public String getJwtResponse() {
        return jwtResponse;
    }
}
