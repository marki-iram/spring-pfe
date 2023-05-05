package pfespring.pfeikspring.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import pfespring.pfeikspring.service.ReservationService;
import pfespring.pfeikspring.entity.Reservation;

import java.util.List;

@RestController
@RequestMapping("/api/v1/reservations")
public class ReservationCotroller {
    @Autowired
    private ReservationService reservationService;

    @GetMapping
    public ResponseEntity<List<Reservation>> getAllReservations() {
        List<Reservation> reservations = reservationService.getAllReservations();
        return new ResponseEntity<>(reservations, HttpStatus.OK);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Reservation> getReservationById(@PathVariable("id") String id) {
        Reservation reservation = reservationService.getReservationById(id);
        if (reservation != null) {
            return new ResponseEntity<>(reservation, HttpStatus.OK);
        } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }

    @PostMapping
    public ResponseEntity<Reservation> addReservation(@RequestBody Reservation reservation) {
        Reservation addedReservation = reservationService.addReservation(reservation);
        return new ResponseEntity<>(addedReservation, HttpStatus.CREATED);
    }

    @PutMapping("/{id}")
    public ResponseEntity<Reservation> updateReservation(@PathVariable("id") String id, @RequestBody Reservation reservation) {
        Reservation updatedReservation = reservationService.updateReservation(id, reservation);
        if (updatedReservation != null) {
            return new ResponseEntity<>(updatedReservation, HttpStatus.OK);
        } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteReservation(@PathVariable("id") String id) {
        reservationService.deleteReservation(id);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }
}
