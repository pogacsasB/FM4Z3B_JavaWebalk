package hu.fm4z3b.java_webalk.services;

import org.springframework.data.jpa.repository.JpaRepository;
import hu.fm4z3b.java_webalk.models.House;

public interface HouseRepository extends JpaRepository<House, Integer> {

}
