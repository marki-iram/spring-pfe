package pfespring.pfeikspring.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pfespring.pfeikspring.entity.Terrain;

@Repository
public interface TerrainRepository extends JpaRepository<Terrain, Integer> {
}
