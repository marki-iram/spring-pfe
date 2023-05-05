package pfespring.pfeikspring.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pfespring.pfeikspring.entity.Admin;

@Repository
public interface AdminRepository extends JpaRepository<Admin, Integer> {

}
