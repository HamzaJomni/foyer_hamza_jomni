package com.example.foyerhamzajomni.DAO.Services;

import com.example.foyerhamzajomni.DAO.Repository.UniversiteRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
@Service
@AllArgsConstructor
public class Universite implements IUniversiterService{
    UniversiteRepository universiterRepository;
}
