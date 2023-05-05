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
@Table(name = "client")
public class Client extends Classename {
    private List<Reservation>reservations;
    public void effectuerReservation(Terrain terrain, Date dateDebutReserv, Date dateFinReserv) {
        System.out.println("Réservation effectuée pour le client : " + getId() +"");
        System.out.println("Terrain réservé : " + terrain.getId());
        System.out.println("Date de début de réservation : " + dateDebutReserv);
        System.out.println("Date de fin de réservation : " + dateFinReserv);

    }
}

