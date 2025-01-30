package hu.fm4z3b.webalk_java.model;

import jakarta.persistence.*;

@Entity
public class Cars {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(nullable = false)
    private String brand;

    @Column(nullable = false)
    private int price;

    @ManyToOne
    @JoinColumn(name = "person_id")
    private People people;

    public String getBrand() {
        return brand;
    }

    public int getPrice() {
        return price;
    }

    public int getId() {
        return id;
    }

    public People getPeople() {
        return people;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public void setPeople(People people) {
        this.people = people;
    }
}
