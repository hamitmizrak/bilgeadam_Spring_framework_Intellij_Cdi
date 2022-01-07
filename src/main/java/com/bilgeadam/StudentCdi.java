package com.bilgeadam;


import javax.enterprise.context.ApplicationScoped;
import javax.inject.Named;
import java.io.Serializable;

@Named
@ApplicationScoped
public class StudentCdi{

    private String adi;

    public StudentCdi() {
        this.adi="Hamit Mızrak";
    }
    public StudentCdi(String adi) {
        this.adi = adi;
    }

    @Override
    public String toString() {
        return "StudentCdi{" +
                "adi='" + adi + '\'' +
                '}';
    }

    public String getAdi() {
        return adi;
    }

    public void setAdi(String adi) {
        this.adi = adi;
    }
}
