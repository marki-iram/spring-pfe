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
@Table(name = "terrain")
public class Terrain {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String nomTerrain;
    private String sport;
    private String disponobilite;
    private String Prix;
    private Integer stade_id;
    private Double surface;
    private String description;
    @OneToMany(mappedBy = "terrain", cascade = CascadeType.ALL)
    private List<Reservation> reservations;

    public Terrain(int id, String nomTerrain, String sport, String disponibilite, String prix, int stadeId, double surface, String description) {

    }
}

