package pfespring.pfeikspring.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.experimental.SuperBuilder;

import java.util.Date;
import java.util.List;

@Entity
@Getter
@Setter
@AllArgsConstructor
@Table(name = "admin")

public class Admin extends Classename {

    public void gererClient(Client client, String operation) {
        switch(operation) {
            case "ajouter":
                // implémenter le code pour ajouter un client ici
                System.out.println("Le client " + client.getNom() + " " + client.getPrenom() + " a été ajouté.");
                break;
            case "modifier":
                // implémenter le code pour modifier un client ici
                System.out.println("Le client " + client.getNom() + " " + client.getPrenom() + " a été modifié.");
                break;
            case "supprimer":
                // implémenter le code pour supprimer un client ici
                System.out.println("Le client " + client.getNom() + " " + client.getPrenom() + " a été supprimé.");
                break;
            default:
                System.out.println("Opération non prise en charge.");
        }
    }


}
