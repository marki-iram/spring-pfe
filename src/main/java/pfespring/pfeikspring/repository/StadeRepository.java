package pfespring.pfeikspring.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pfespring.pfeikspring.entity.Stade;

@Repository
public interface StadeRepository extends JpaRepository<Stade, Integer> {

}
