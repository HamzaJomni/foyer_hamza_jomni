package com.example.foyerhamzajomni.DAO.Repository;

import com.example.foyerhamzajomni.DAO.Entitie.Bloc;
import com.example.foyerhamzajomni.DAO.Entitie.Foyer;
import com.example.foyerhamzajomni.DAO.Entitie.TypeChambre;
import com.example.foyerhamzajomni.DAO.Entitie.Universite;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface FoyerRepository extends JpaRepository<Foyer, Long> {
    //select * from Foyer where capaciteFoyer >... OU (<...) OU (<... and >...)
    List<Foyer> findByCapaciteFoyerGreaterThan (int capacite);
    List<Foyer> findByCapaciteFoyerLessThan (int capacite);
    List<Foyer> findByCapaciteFoyerBetween (int min, int max);

    // Afficher le foyer de l'universite dont son nom est passé en paramètre
    // select (*) from Foyer f JOIN Universite u ON <Condition de jointure> where <Condition>
    Foyer findByUniversiteNomUniversite(String nom);

    //Afficher la liste des foyers qui comporte des chambres du meme type
    // que le type passé en paramètre
    //Foyer --> Bloc --> Chambre
   List<Foyer> findByBlocsChambreTypeC (TypeChambre typeChambre); //ou getByBlocsChambreTypeC
    //    1- Recherche des foyers d'un bloc spécifique
    List<Foyer> findByBlocs(Bloc bloc);
    //    2- Recherche du foyer par son idFoyer pour un bloc donné
    Foyer findByIdAndBlocs(Long id, Bloc bloc);
    //    3- Recherche des foyers d'un bloc ayant une capacité spécifique
    List<Foyer> findByBlocsAndCapaciteFoyer(Bloc bloc, int capaciteFoyer);
    //    4- Recherche du foyer d'un bloc spécifique dans une université donnée
    Foyer findByBlocsAndUniversite(Bloc bloc, Universite universite);

}
