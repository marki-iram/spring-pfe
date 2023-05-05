package pfespring.pfeikspring.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.util.List;
@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Table(name = "stade")
public class Stade {
        @Id
        private int id;
        private String nom;
        private String adresse;
        private String telephone;
        @OneToMany
        @JoinColumn(name = "terrain_id")
        private List<Terrain> terrains;
    }
