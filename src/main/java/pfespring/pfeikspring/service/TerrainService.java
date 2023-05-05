package pfespring.pfeikspring.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pfespring.pfeikspring.repository.TerrainRepository;
import pfespring.pfeikspring.entity.Terrain;

import java.util.List;

@Service
public class TerrainService {
    @Autowired
    private TerrainRepository terrainRepository;

    public List<Terrain> getAllTerrains() {
        return terrainRepository.findAll();
    }

    public Terrain getTerrainById(int id) {
        return terrainRepository.findById(id).orElse(null);
    }

    public void addTerrain(Terrain terrain) {
        terrainRepository.save(terrain);
    }

    public void updateTerrain(Terrain terrain, int id) {
        terrain.setId(id);
        terrainRepository.save(terrain);
    }

    public void deleteTerrain(int id) {
        terrainRepository.deleteById(id);
    }
}
