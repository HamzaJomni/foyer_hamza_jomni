package com.example.foyerhamzajomni.DAO.Repository;

import com.example.foyerhamzajomni.DAO.Entitie.Universite;
import org.springframework.data.jpa.repository.JpaRepository;

import java.time.LocalDate;
import java.util.List;

//
public interface UniversiteRepository extends JpaRepository<Universite, Long> {
    // 1- Afficher la liste des universités qui ont des étudiants dont leurs noms contiennent la chaine de caractère en paramètre et leurs dates de naissance entre deux dates passées en paramètre
    List<Universite> findByFoyerBlocsChambresReservationsEtudiantsNomEtContainingAndFoyerBlocsChambresReservationsEtudiantsDateNaissanceBetween(String nomEt, LocalDate dateDebut, LocalDate dateFin);

}
