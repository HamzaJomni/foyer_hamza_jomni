package com.example.foyerhamzajomni.Services;

import com.example.foyerhamzajomni.DAO.Entitie.Etudiant;

import java.util.List;

public interface IEtudiantService {
    Etudiant addEtudiant(Etudiant e);

    List<Etudiant> addAllEtudiants(List<Etudiant> etudiants);

    Etudiant updateEtudiant(Etudiant e);

    List<Etudiant> findAllEtudiants();

    Etudiant findEtudiantById(long id);

    void deleteEtudiant(Etudiant e);

    void deleteEtudiantById(long id);
}
