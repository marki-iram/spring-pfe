package pfespring.pfeikspring.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import pfespring.pfeikspring.entity.Client;

public interface ClientRepository extends JpaRepository<Client, Integer> {
}
