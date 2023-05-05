package pfespring.pfeikspring.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pfespring.pfeikspring.repository.StadeRepository;
import pfespring.pfeikspring.entity.Stade;

import java.util.List;

@Service
public class StadeService {
    @Autowired
    private StadeRepository stadeRepository;

    public List<Stade> getAllStades() {
        return stadeRepository.findAll();
    }

    public Stade getStadeById(int id) {
        return stadeRepository.findById(id).orElse(null);
    }

    public void addStade(Stade stade) {
        stadeRepository.save(stade);
    }

    public void updateStade(int id, Stade stade) {
        Stade existingStade = stadeRepository.findById(id).orElse(null);
        if (existingStade != null) {
            existingStade.setNom(stade.getNom());
            existingStade.setAdresse(stade.getAdresse());
            existingStade.setTelephone(stade.getTelephone());
            existingStade.setTerrains(stade.getTerrains());
            stadeRepository.save(existingStade);
        }
    }

    public void deleteStade(int id) {
        stadeRepository.deleteById(id);
    }
}
