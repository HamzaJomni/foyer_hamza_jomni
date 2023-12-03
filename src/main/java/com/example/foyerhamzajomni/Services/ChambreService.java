package com.example.foyerhamzajomni.Services;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import com.example.foyerhamzajomni.DAO.Entitie.Chambre;
import com.example.foyerhamzajomni.DAO.Repository.ChambreRepository;

import java.util.List;

@Service
@AllArgsConstructor
public class ChambreService implements IChambreService {
    ChambreRepository chambreRepository;

    @Override
    public Chambre addChambre(Chambre c) {
        return chambreRepository.save(c);
    }

    @Override
    public List<Chambre> addAllChambres(List<Chambre> chambres) {
        return chambreRepository.saveAll(chambres);
    }

    @Override
    public Chambre updateChambre(Chambre c) {
        return chambreRepository.save(c);
    }

    @Override
    public List<Chambre> findAllChambres() {
        return chambreRepository.findAll();
    }

    @Override
    public Chambre findChambreById(long id) {
        return chambreRepository.findById(id).get();
    }

    @Override
    public void deleteChambre(Chambre c) {
        chambreRepository.delete(c);
    }

    @Override
    public void deleteChambreById(long id) {
        chambreRepository.deleteById(id);
    }
}
