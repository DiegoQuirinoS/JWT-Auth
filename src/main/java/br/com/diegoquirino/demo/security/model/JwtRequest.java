package br.com.diegoquirino.demo.security.model;

import java.io.Serializable;

public class JwtRequest implements Serializable {

    private static final long serialVersionUID = -6515311421324351697L;

    private String username;
    private String password;

    public JwtRequest(){}

    public JwtRequest(String username, String password){
        this.username = username;
        this.password = password;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
