package pfespring.pfeikspring.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;
import org.hibernate.tuple.IdentifierAttribute;

import java.util.Date;
@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Table(name = "reservation")
public class Reservation {
    @Id
    private String NumReservation;
    private String Montant;
    private String ModePaiement;
    private Date DateDebutReserv;
    private Date DateFinReserv;
    private String EtatDeReservation;
    @ManyToOne
    @JoinColumn(name="id_client")
    private Client client;
    @ManyToOne
    @JoinColumn(name="id_admin")
    private Admin admin;


    public Reservation(Date dateDebutResrv, Date dateFinResev) {
        this.DateDebutReserv= dateDebutResrv;
        this.DateFinReserv= dateFinResev;
}
}