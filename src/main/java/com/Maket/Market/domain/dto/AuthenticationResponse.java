package com.Maket.Market.domain.dto;

public class AuthenticationResponse {
    private String jtw;

    public AuthenticationResponse(String jtw) {
        this.jtw = jtw;
    }

    public String getJtw() {
        return jtw;
    }

    public void setJtw(String jtw) {
        this.jtw = jtw;
    }
    
}
