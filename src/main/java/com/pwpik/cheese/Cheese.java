package com.pwpik.cheese;

import javax.persistence.*;

@Entity
@Table(name="cheeses")
public class Cheese {

    @Id @GeneratedValue
    private Integer id;

    @Column(nullable = false)
    private String name;

    Cheese() {}

    public Cheese(String name){
        this.name = name;
    }

    public Integer getId() {
        return this.id;
    }

    public String getName() {
        return name;
    }
}
