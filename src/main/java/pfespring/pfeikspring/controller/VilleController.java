package pfespring.pfeikspring.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import pfespring.pfeikspring.service.VilleService;
import pfespring.pfeikspring.entity.Ville;

import java.util.List;

@RestController
@RequestMapping("/api/v1/villes")
public class VilleController {
    @Autowired
    private VilleService villeService;
    @GetMapping
    public List<Ville> getAllVilles() {
        return villeService.getAllVille();
    }
    @GetMapping("/{id}")
    public Ville getVilleById(@PathVariable int id) {
        return villeService.getVilleById(id);
    }
    @PostMapping("/")
    public Ville addVille(@RequestBody Ville ville) {
        return villeService.addVille(ville);
    }
    @PutMapping("/{id}")
    public Ville updateVille(@PathVariable int id, @RequestBody Ville ville) {
        return villeService.updateVille(id, ville);
    }
    @DeleteMapping("/{id}")
    public void deleteVille(@PathVariable int id) {
        villeService.deleteVille(id);
    }

}
