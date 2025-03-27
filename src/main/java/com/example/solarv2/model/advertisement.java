package com.example.solarv2.model;

import jakarta.persistence.*;
@Table(name = "объявление")
@Entity
public class advertisement {
    @Id
    @GeneratedValue(strategy =  GenerationType.IDENTITY)
    @Column(name = "id")
    private long id;
    @Column(name = "Название")
    private String name;
    @Column(name = "Описание")
    private String descr;
    @Column(name = "цена")
    private int sel;
    private String Subcret;
    private String cret;

    public advertisement (String name,String descr,int sel,String Subcret,String cret){
        this.name= name;
        this.descr= descr;
        this.sel=sel;
        this.Subcret=Subcret;
        this.cret=cret;

    }


}
