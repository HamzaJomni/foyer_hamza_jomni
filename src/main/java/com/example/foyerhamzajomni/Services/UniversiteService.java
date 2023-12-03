package com.example.foyerhamzajomni.Services;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import com.example.foyerhamzajomni.DAO.Entitie.Universite;
import com.example.foyerhamzajomni.DAO.Repository.UniversiteRepository;

import java.util.List;

@Service
@AllArgsConstructor
public class UniversiteService implements IUniversiteService {
    UniversiteRepository universiterRepository;

    @Override
    public Universite addUniversite(Universite u) {
        return universiterRepository.save(u);
    }

    @Override
    public List<Universite> addAllUniversites(List<Universite> universites) {
        return universiterRepository.saveAll(universites);
    }

    @Override
    public Universite updateUniversite(Universite u) {
        return universiterRepository.save(u);
    }

    @Override
    public List<Universite> findAllUniversites() {
        return universiterRepository.findAll();
    }

    @Override
    public Universite findUniversiteById(long id) {
        return universiterRepository.findById(id).get();
    }

    @Override
    public void deleteUniversite(Universite u) {
        universiterRepository.delete(u);
    }

    @Override
    public void deleteUniversiteById(long id) {
        universiterRepository.deleteById(id);
    }
}
