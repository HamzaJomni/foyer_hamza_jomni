package com.example.foyerhamzajomni.Services;

import com.example.foyerhamzajomni.DAO.Entitie.Universite;

import java.util.List;

public interface IUniversiteService {
    Universite addUniversite(Universite u);

    List<Universite> addAllUniversites(List<Universite> universites);

    Universite updateUniversite(Universite u);

    List<Universite> findAllUniversites();

    Universite findUniversiteById(long id);

    void deleteUniversite(Universite u);

    void deleteUniversiteById(long id);
}
