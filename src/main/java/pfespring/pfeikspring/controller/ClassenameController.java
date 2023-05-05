package pfespring.pfeikspring.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import pfespring.pfeikspring.service.ClassenameService;
import pfespring.pfeikspring.entity.Classename;

import java.util.List;

@RestController
@RequestMapping("/api/v1/classenames")
public class ClassenameController {
    @Autowired
    private ClassenameService classenameService;

    @GetMapping("/{id}")
    public ResponseEntity<Classename> getClassenameById(@PathVariable int id) {
        Classename classename = classenameService.getClassenameById(id);
        return ResponseEntity.ok().body(classename);
    }
    @GetMapping("/all")
    public ResponseEntity<List<Classename>> getAllClassenams()
    {
        List<Classename> classenames = classenameService.getAllClassenames();
        return ResponseEntity.ok().body(classenames);
    }
    @PostMapping("/")
    public ResponseEntity<Classename> createClassename(@RequestBody Classename classename){
        Classename createdClassename = classenameService.createClassename(classename);
        return ResponseEntity.status(HttpStatus.CREATED).body(createdClassename);
    }
    @PutMapping("/{id}")
    public ResponseEntity<Classename> updateClassename(@PathVariable int id, @RequestBody Classename classename) {
        Classename updatedClassename = classenameService.updateClassename(id, classename);
        return ResponseEntity.ok().body(updatedClassename);
    }
    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteClassename(@PathVariable int id) {
        classenameService.deleteClassename(id);
        return ResponseEntity.noContent().build();
    }





}


