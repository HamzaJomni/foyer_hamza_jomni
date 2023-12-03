package com.example.foyerhamzajomni.Services;

import com.example.foyerhamzajomni.DAO.Entitie.Bloc;
import com.example.foyerhamzajomni.DAO.Repository.BlocRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service //Definir que c'est un bean Spring
@AllArgsConstructor //pour injecter un bean spring dans un autre bean
public class BlocService implements IBlocService {
    BlocRepository blocRepository;

    //save : l'ajout et la modification
    //->
    // l'objet contient un id qui exsite dans la BD-> Modification
    // l'objet ne contient pas un id (null) ou un objet contient un id qui nexiste pas dans la BD--> Ajout
    @Override
    public Bloc addBloc(Bloc b) {
        return blocRepository.save(b);
    }

    @Override
    public List<Bloc> addAllBlocs(List<Bloc> blocs) {
        return blocRepository.saveAll(blocs);
    }

    @Override
    public Bloc updateBloc(Bloc b) {
        return blocRepository.save(b);
    }

    @Override
    public List<Bloc> updateAllBlocs(List<Bloc> blocs) {
        return blocRepository.saveAll(blocs);
    }

    @Override
    public List<Bloc> findAllBlocs() {
        return blocRepository.findAll();
    }

    @Override
    public Bloc findBlocById(long id) {
        //Optionnal <Bloc> : retour  NULL -> il peut y avoir des erreurs (null pointer exception)
        // pour résoudre le problème : .get() ou .orElse(...)
        //get()--> Retourne un résultat si elle a trouvé une ligne avec l'id passé en paramètre
        // sinon --> Retourne un objet vide avec l'exception "No Value Present"
        // OrElse() --> Retourne un résultat si ellle a trouvé une ligne avec l'id passé en paramètre
        //  --> OrElse (définir l'objet retourné au cas ou la base de donnée ne retourne pas une ligne  avec l'id passé en paramètre)

        return blocRepository.findById(id).orElse(Bloc.builder().idBloc(0).nomBloc("Bloc Bizarre").build());
    }

    @Override
    public boolean existeById(Long id) {
        return blocRepository.findById(id).isPresent();
    }

    @Override
    public void deleteBloc(Bloc b) {
        blocRepository.delete(b);
    }

    @Override
    public void deleteBlocById(long id) {
        blocRepository.deleteById(id);
    }
}
