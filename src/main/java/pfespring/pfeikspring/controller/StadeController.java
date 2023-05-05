package pfespring.pfeikspring.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import pfespring.pfeikspring.service.StadeService;
import pfespring.pfeikspring.entity.Stade;

import java.util.List;

@RestController
@RequestMapping("/api/v1/stades")
public class StadeController {
    @Autowired
    private StadeService stadeService;

    @GetMapping("")
    public List<Stade> getAllStades() {
        return stadeService.getAllStades();
    }

    @GetMapping("/{id}")
    public Stade getStadeById(@PathVariable int id) {
        return stadeService.getStadeById(id);
    }

    @PostMapping("")
    public void addStade(@RequestBody Stade stade) {
        stadeService.addStade(stade);
    }

    @PutMapping("/{id}")
    public void updateStade(@PathVariable int id, @RequestBody Stade stade) {
        stadeService.updateStade(id, stade);
    }

    @DeleteMapping("/{id}")
    public void deleteStade(@PathVariable int id) {
        stadeService.deleteStade(id);
    }


}
