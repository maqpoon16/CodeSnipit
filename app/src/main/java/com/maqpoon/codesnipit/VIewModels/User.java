package com.maqpoon.codesnipit.VIewModels;

public class User {
    private String email;
    private String mobile;
    private String cnic;
    private String address;
    private String password;


    public User(String email, String mobile, String cnic, String address, String password) {
        this.email = email;
        this.mobile = mobile;
        this.cnic = cnic;
        this.address = address;
        this.password = password;
    }

    public void setEmail(String email) {
        this.email = email;
    }


    public String getEmail() {
        return email;
    }

    public void setPassword(String password) {
        this.password = password;
    }


    public String getPassword() {
        return password;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public String getCnic() {
        return cnic;
    }

    public void setCnic(String cnic) {
        this.cnic = cnic;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}