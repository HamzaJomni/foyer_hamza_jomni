package com.example.foyerhamzajomni.Services;
import com.example.foyerhamzajomni.DAO.Entitie.Bloc;

import java.util.List;

public interface IBlocService {
    Bloc addBloc(Bloc b);
    List<Bloc> addAllBlocs(List<Bloc> blocs);
    Bloc updateBloc(Bloc b);
    List<Bloc> updateAllBlocs(List<Bloc> blocs);
    List<Bloc> findAllBlocs();
    Bloc findBlocById(long id);
    boolean existeById(Long id);
    void deleteBloc(Bloc b);
    void deleteBlocById(long id);

}
