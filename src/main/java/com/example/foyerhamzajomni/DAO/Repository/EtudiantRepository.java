package com.example.foyerhamzajomni.DAO.Repository;

import com.example.foyerhamzajomni.DAO.Entitie.Etudiant;
import org.springframework.data.jpa.repository.JpaRepository;

import java.time.LocalDate;
import java.util.List;

public interface EtudiantRepository extends JpaRepository<Etudiant, Long> {
    //select * from Etudiant where cin =...
    Etudiant findByCin(long cin);

    //select * from Etudiant where nomEtudiant like...
    List<Etudiant> findByNomEtLike(String nom); //ou findByNomEtContains ou findByNomEtContain
    List<Etudiant> findByNomEtContains(String nom);
    List<Etudiant> findByNomEtContaining(String nom);

    // 1- Recherche par nom et prénom de l'étudiant
    List<Etudiant> findByNomEtAndPrenomEt(String nomEt, String prenomEt);

    // 2- Recherche par CIN de l'étudiant
    Etudiant findByCin(Long cin);

    // 3- Recherche des étudiants par date de naissance après une certaine date
    List<Etudiant> findByDateNaissanceAfter(LocalDate date);

    // 4- Recherche des étudiants par nom d'école
    List<Etudiant> findByEcole(String ecole);

// 5- Recherche des étudiants par réservation (id de réservation)
    List<Etudiant> findByReservationsIdReservation(String idReservation);

// 6- Recherche des étudiants par réservation (année de réservation)
    List<Etudiant> findByReservationsAnneUniversitaire(int annee);

    // 7- Recherche des étudiants par nom d'école et date de naissance après une certaine date
    List<Etudiant> findByEcoleAndDateNaissanceAfter(String ecole, LocalDate date);

// 8- Recherche des étudiants par réservation pour une année donnée et triés par date de naissance
    List<Etudiant> findByReservationsAnneUniversitaireOrderByDateNaissance(int annee);

    // Afficher le nombre total des étudiants
    long countEtudiantBy();

}
