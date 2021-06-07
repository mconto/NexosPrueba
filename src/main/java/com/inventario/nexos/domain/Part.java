package com.inventario.nexos.domain;

import java.time.LocalDateTime;


public class Part {

    private int idPart;
    private String part;
    private User user;
    private LocalDateTime dateRegister;
    private int quantity;
    private String usercharged;
    private String idUser;

    public int getIdPart() {
        return idPart;
    }

    public void setIdPart(int idPart) {
        this.idPart = idPart;
    }

    public String getPart() {
        return part;
    }

    public void setPart(String part) {
        this.part = part;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public LocalDateTime getDateRegister() {
        return dateRegister;
    }

    public void setDateRegister(LocalDateTime dateRegister) {
        this.dateRegister = dateRegister;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public String getUsercharged() {
        return usercharged;
    }

    public void setUsercharged(String usercharged) {
        this.usercharged = usercharged;
    }

    public String getIdUser() {
        return idUser;
    }

    public void setIdUser(String idUser) {
        this.idUser = idUser;
    }
}
