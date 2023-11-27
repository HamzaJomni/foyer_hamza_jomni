package com.example.foyerhamzajomni.DAO.Services;

import com.example.foyerhamzajomni.DAO.Repository.ChambreRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class ChambreService implements IChambreService{
    ChambreRepository chambreRepository;
}
