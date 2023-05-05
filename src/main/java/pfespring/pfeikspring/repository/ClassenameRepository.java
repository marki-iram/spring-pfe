package pfespring.pfeikspring.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pfespring.pfeikspring.entity.Classename;

import java.util.List;


@Repository
public interface ClassenameRepository extends JpaRepository<Classename, Integer> {
    Classename findById(int id);

    // Méthode pour récupérer tous les objets Classename de la base de données
    List<Classename> findAll();

    // Méthode pour créer un nouvel objet Classename dans la base de données
    Classename save(Classename classename);

    // Méthode pour mettre à jour un objet Classename dans la base de données
    Classename update(Classename classename);

    // Méthode pour supprimer un objet Classename de la base de données par son ID
    void deleteById(int id);

}

