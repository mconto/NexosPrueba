package com.inventario.nexos.domain;

import java.time.LocalDateTime;

public class User {

    private Integer idUser;
    private String name;
    private Integer age;
    private String rolluser;
    private LocalDateTime datein;
    private Part part;

    public Integer getIdUser() {
        return idUser;
    }

    public void setIdUser(Integer idUser) {
        this.idUser = idUser;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public LocalDateTime getDatein() {
        return datein;
    }

    public void setDatein(LocalDateTime datein) {
        this.datein = datein;
    }

    public String getRolluser() {
        return rolluser;
    }

    public void setRolluser(String rolluser) {
        this.rolluser = rolluser;
    }

    public Part getPart() {
        return part;
    }

    public void setPart(Part part) {
        this.part = part;
    }

}
