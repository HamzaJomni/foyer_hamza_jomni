package com.example.foyerhamzajomni.DAO.Repository;

import com.example.foyerhamzajomni.DAO.Entitie.Bloc;
import com.example.foyerhamzajomni.DAO.Entitie.Foyer;
import com.example.foyerhamzajomni.DAO.Entitie.Universite;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface BlocRepository extends JpaRepository<Bloc, Long> {
    // select * from Bloc where nomBloc=...
    Bloc findByNomBloc(String nomBloc);
    Bloc getByNomBloc(String nomBloc);
    //Recherche par capaciteBloc
    Bloc findByCapaciteBloc(int capaciteBloc);

    // select* from Bloc where nomBloc and capacitéBloc=...
    Bloc findByNomBlocAndCapaciteBloc(String nomBloc, int capaciteBloc);

    // select * from Bloc where nomBloc ... or capacite =...
    Bloc findByNomBlocOrCapaciteBloc(String nomBloc, Long capaciteBloc);

    //Recherche par nomBloc en ignorant la casse
    Bloc findByNomBlocIgnoreCase(String nomBloc);
    //Recherche par capaciteBloc supérieure à une valeur donnée
    Bloc findByCapaciteBlocGreaterThan(int capaciteBloc);
    //Recherche par nomBloc contenant une sous-chaîne
    Bloc findByNomBlocContaining(String nomBloc);

//    7- Tri par nomBloc par ordre alphabétique
    Bloc findByNomBlocOrderByNomBlocAsc();
//    8- Recherche par nomBloc ou capaciteBloc
    Bloc findByNomBlocOrCapaciteBloc(String nomBloc, int capaciteBloc);
//    9- Recherche du bloc d'un foyer spécifique
    Bloc findByFoyer(Foyer foyer);
//    10- Recherche du bloc pour un foyer d'une université donnée
    Bloc findByFoyerUniversite(Foyer foyer, Universite universite);
}
