package com.example.foyerhamzajomni.DAO.Services;

import com.example.foyerhamzajomni.DAO.Repository.EtudiantRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class EtudiantService implements IEtudiantService{
    EtudiantRepository etudiantRepository;
}
