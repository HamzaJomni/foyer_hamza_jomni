package com.example.foyerhamzajomni.Services;

import com.example.foyerhamzajomni.DAO.Entitie.Reservation;

import java.util.List;

public interface IReservationService {
    Reservation addReservation(Reservation r);

    List<Reservation> addAllReservations(List<Reservation> reservations);

    Reservation updateReservation(Reservation r);

    List<Reservation> findAllReservations();

    Reservation findReservationById(String id);

    void deleteReservation(Reservation r);

    void deleteReservationById(String id);
}
