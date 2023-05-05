package pfespring.pfeikspring.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Table(name = "ville")
public class Ville {
    @Id
    private int id;
    private String nomVille;


}
