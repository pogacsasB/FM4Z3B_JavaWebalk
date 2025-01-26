package hu.fm4z3b.java_webalk.models;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.Table;

import java.util.List;

@Entity
@Table(name="house")
public class House {
    @Id
    private Long house_id;
    private String city;
    private String street;

    @ManyToMany(mappedBy = "houses")
    private List<People> people;

    public Long getHouse_id() {
        return house_id;
    }

    public String getCity() {
        return city;
    }

    public String getStreet() {
        return street;
    }

    public void setHouse_id(Long houseId) {
        this.house_id = houseId;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public void setStreet(String street) {
        this.street = street;
    }
}
