package pfespring.pfeikspring.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pfespring.pfeikspring.entity.Reservation;

@Repository
public interface ReservationRepository extends JpaRepository<Reservation, String>{
}
