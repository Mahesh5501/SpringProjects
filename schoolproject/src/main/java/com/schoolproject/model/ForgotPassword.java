package com.schoolproject.model;

public class ForgotPassword {
    
    private String email;

    public String getEmail() {
        return this.email;
    }

    public void setEmail(String email) {
        this.email = email;
    }


    @Override
    public String toString() {
        return "ForgotPassword {" +
            " email='" + getEmail() + "'" +
            "}";
    }
    
}
