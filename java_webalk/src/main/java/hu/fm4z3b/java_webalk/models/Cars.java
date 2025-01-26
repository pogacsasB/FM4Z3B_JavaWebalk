package hu.fm4z3b.java_webalk.models;

import jakarta.persistence.*;

@Entity
@Table(name="cars")
public class Cars {

    @Id
    @GeneratedValue( strategy = GenerationType.IDENTITY )
    private Long car_id;

    private String brand;
    private String reg_plate;

    @ManyToOne
    @JoinColumn(name = "owner_id")
    private People people;

    public Long getCar_id() {
        return car_id;
    }

    public String getBrand() {
        return brand;
    }

    public String getReg_plate() {
        return reg_plate;
    }

    public People getPeople() {
        return people;
    }

    public void setCar_id(Long id) {
        this.car_id = id;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void setReg_plate(String reg_plate) {
        this.reg_plate = reg_plate;
    }

    public void setPeople(People people) {
        this.people = people;
    }
}
