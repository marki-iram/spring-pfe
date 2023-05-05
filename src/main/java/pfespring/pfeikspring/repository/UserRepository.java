package pfespring.pfeikspring.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pfespring.pfeikspring.entity.User;

@Repository
public interface UserRepository extends JpaRepository<User, Integer> {
}
