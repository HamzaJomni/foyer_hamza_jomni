package com.example.foyerhamzajomni.DAO.Repository;

import com.example.foyerhamzajomni.DAO.Entitie.Bloc;
import com.example.foyerhamzajomni.DAO.Entitie.Chambre;
import com.example.foyerhamzajomni.DAO.Entitie.TypeChambre;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ChambreRepository extends JpaRepository<Chambre, Long> {
    // 1- Recherche par numéro de chambre
    Chambre findByNumchambre(Long numchambre);

    // 2- Recherche par type de chambre
    List<Chambre> findByTypeChambre(TypeChambre typeChambre);

    // 3- Recherche des chambres par bloc
    List<Chambre> findByBloc(Bloc bloc);

    // 4- Recherche des chambres par bloc et type de chambre
    List<Chambre> findByBlocAndTypeChambre(Bloc bloc, TypeChambre typeChambre);

    // 5- Recherche des chambres par numéro de chambre et type de chambre
    Chambre findByNumchambreAndTypeChambre(Long numchambre, TypeChambre typeChambre);

// 6- Récupérer des chambres en filtrant par le nom de l'université associée au foyer,
// l'année de réservation, le nom de l'étudiant dans la réservation et le numéro de chambre
    List<Chambre> findCustomChambres(String nomUniversite, Long numChambre, String nomEtudiant, int anneeReservation);

    //Afficher le nombre des chambres qui ont le type que le n type passé en paramètre
    // du foyer qui a le n nom que le nom passé en paramètre
    long countByTypeChambreAndBlocFoyerNomFoyer(TypeChambre typeChambre, String nomFoyer);
}
