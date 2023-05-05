package pfespring.pfeikspring.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.util.Date;
@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Table(name = "calassename")
@Inheritance(strategy = InheritanceType.JOINED)
public class Classename {
    @Id
    private int id;
    private String nom;
    private String Prenom;
    private String email;
    private String telephone;
    private Date DatedeNaissance;
    private String sexe;
    private String adresse;
    private String ville;
    private String motDepasse;
    private String role;
    private String photo;

}
