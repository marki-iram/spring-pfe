package pfespring.pfeikspring.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pfespring.pfeikspring.entity.Ville;

@Repository
public interface VilleRepository extends JpaRepository <Ville, Integer> {


}
