package com.example.foyerhamzajomni.DAO.Repository;

import com.example.foyerhamzajomni.DAO.Entitie.Reservation;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ReservationRepository extends JpaRepository<Reservation, String> {
    // 1- Recherche des réservations validées
    List<Reservation> findByEstValideTrue();

// 2- Recherche des réservations par l'id de l'étudiant
    List<Reservation> findByEtudiantsId(String idEtudiant);

// 3- Recherche des réservations par année et validité
    List<Reservation> findByAnneUniversitaireAndEstValide(int annee, boolean validite);

}
