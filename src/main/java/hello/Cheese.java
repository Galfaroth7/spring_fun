package hello;

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

    public String getName() {
        return name;
    }
}