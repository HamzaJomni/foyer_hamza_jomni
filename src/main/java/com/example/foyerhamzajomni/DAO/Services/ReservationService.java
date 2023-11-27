package com.example.foyerhamzajomni.DAO.Services;

import com.example.foyerhamzajomni.DAO.Repository.ReservationRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
@Service
@AllArgsConstructor
public class ReservationService implements IReservationService{
    ReservationRepository reservationRepository;
}
