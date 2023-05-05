package pfespring.pfeikspring.service;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pfespring.pfeikspring.repository.VilleRepository;
import pfespring.pfeikspring.entity.Ville;

import java.util.List;
@Service
public class VilleService {
    @Autowired
    private VilleRepository villeRepository;

    public List<Ville> getAllVille() {
        return villeRepository.findAll();
    }

    public Ville getVilleById(int id) {
        return villeRepository.findById(id).orElse(null);
    }

    public Ville addVille(Ville ville) {
        return villeRepository.save(ville);
    }

    public Ville updateVille(int id, Ville ville) {
        Ville existingVille = villeRepository.findById(id).orElse(null);
        if (existingVille != null) {
            existingVille.setNomVille(ville.getNomVille());
            return villeRepository.save(existingVille);
        }
        return null;
    }

    public void deleteVille(int id) {
        villeRepository.deleteById(id);
    }

}


