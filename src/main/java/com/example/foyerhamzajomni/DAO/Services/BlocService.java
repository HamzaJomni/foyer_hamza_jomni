package com.example.foyerhamzajomni.DAO.Services;

import com.example.foyerhamzajomni.DAO.Repository.BlocRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service //Definir que c'est un bean Spring
@AllArgsConstructor //pour injecter un bean spring dans un autre bean
public class BlocService implements IBlocService {
    BlocRepository blocRepository;
}
