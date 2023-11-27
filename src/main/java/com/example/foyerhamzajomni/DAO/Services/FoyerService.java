package com.example.foyerhamzajomni.DAO.Services;

import com.example.foyerhamzajomni.DAO.Repository.FoyerRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
@Service
@AllArgsConstructor
public class FoyerService implements IFoyerService {
    FoyerRepository foyerRepository;
}
