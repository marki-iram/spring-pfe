package pfespring.pfeikspring.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pfespring.pfeikspring.repository.ClassenameRepository;
import pfespring.pfeikspring.entity.Classename;

import java.util.List;


@Service
public class ClassenameService {
    @Autowired
    private ClassenameRepository classenameRepository;

    public Classename getClassenameById(int id) {
        return classenameRepository.findById(id);
    }

    public List<Classename> getAllClassenames() {
        return classenameRepository.findAll();
    }

    public Classename createClassename(Classename classename) {
        return classenameRepository.save(classename);
    }

    public Classename updateClassename(int id, Classename classename) {
        classename.setId(id);
        return classenameRepository.save(classename);
    }

    public void deleteClassename(int id) {
        classenameRepository.deleteById(id);
    }
}
