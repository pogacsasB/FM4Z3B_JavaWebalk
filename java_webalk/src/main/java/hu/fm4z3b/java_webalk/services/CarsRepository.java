package hu.fm4z3b.java_webalk.services;

import org.springframework.data.jpa.repository.JpaRepository;
import hu.fm4z3b.java_webalk.models.Cars;

public interface CarsRepository extends JpaRepository<Cars, Integer> {

}