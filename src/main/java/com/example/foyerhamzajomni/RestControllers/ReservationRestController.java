package com.example.foyerhamzajomni.RestControllers;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;
import com.example.foyerhamzajomni.DAO.Entitie.Reservation;
import com.example.foyerhamzajomni.Services.IReservationService;

import java.util.List;

@RestController
@AllArgsConstructor
public class ReservationRestController {
    IReservationService iReservationService;

    @GetMapping("getAllReservations")
    public List<Reservation> getAll() {
        return iReservationService.findAllReservations();
    }

    @GetMapping("getReservationById")
    public Reservation getById(@RequestParam String id) {
        return iReservationService.findReservationById(id);
    }

    @PostMapping("addReservation")
    public Reservation addChmbre(@RequestBody Reservation reservation) {
        return iReservationService.addReservation(reservation);
    }

    @PostMapping("addAllReservation")
    public List<Reservation> addAllChambres(@RequestBody List<Reservation> reservations) {
        return iReservationService.addAllReservations(reservations);
    }
}
