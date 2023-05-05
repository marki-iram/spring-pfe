package pfespring.pfeikspring.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pfespring.pfeikspring.repository.ReservationRepository;
import pfespring.pfeikspring.entity.Reservation;

import java.util.List;

@Service
public class ReservationService {
    @Autowired
    private ReservationRepository reservationRepository;

    public List<Reservation> getAllReservations() {
        return reservationRepository.findAll();
    }

    public Reservation getReservationById(String id) {
        return reservationRepository.findById(id).orElse(null);
    }

    public Reservation addReservation(Reservation reservation) {
        return reservationRepository.save(reservation);
    }

    public Reservation updateReservation(String id, Reservation reservation) {
        Reservation existingReservation = reservationRepository.findById(id).orElse(null);
        if (existingReservation != null) {
            existingReservation.setMontant(reservation.getMontant());
            existingReservation.setModePaiement(reservation.getModePaiement());
            existingReservation.setDateDebutReserv(reservation.getDateDebutReserv());
            existingReservation.setDateFinReserv(reservation.getDateFinReserv());
            existingReservation.setEtatDeReservation(reservation.getEtatDeReservation());
            return reservationRepository.save(existingReservation);
        } else {
            return null;
        }
    }

    public void deleteReservation(String id) {
        reservationRepository.deleteById(id);
    }
}
