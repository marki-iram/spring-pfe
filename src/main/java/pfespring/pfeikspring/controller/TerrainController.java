package pfespring.pfeikspring.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import pfespring.pfeikspring.service.TerrainService;
import pfespring.pfeikspring.entity.Terrain;

import java.util.List;

@RestController
@RequestMapping("/api/v1/terrains")
public class TerrainController {
    @Autowired
    private TerrainService terrainService;

    @GetMapping
    public List<Terrain> getAllTerrains() {
        return terrainService.getAllTerrains();
    }

    @GetMapping("/{id}")
    public Terrain getTerrainById(@PathVariable int id) {
        return terrainService.getTerrainById(id);
    }

    @PostMapping
    public void addTerrain(@RequestBody Terrain terrain) {
        terrainService.addTerrain(terrain);
    }

    @PutMapping("/{id}")
    public void updateTerrain(@RequestBody Terrain terrain, @PathVariable int id) {
        terrainService.updateTerrain(terrain, id);
    }

    @DeleteMapping("/{id}")
    public void deleteTerrain(@PathVariable int id) {
        terrainService.deleteTerrain(id);
    }
}
