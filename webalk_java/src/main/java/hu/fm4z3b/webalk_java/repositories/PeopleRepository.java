package hu.fm4z3b.webalk_java.repositories;

import hu.fm4z3b.webalk_java.model.People;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PeopleRepository extends JpaRepository<People, Integer> {

}
