package com.example.foyerhamzajomni.RestControllers;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;
import com.example.foyerhamzajomni.DAO.Entitie.Etudiant;
import com.example.foyerhamzajomni.Services.IEtudiantService;

import java.util.List;

@RestController
@AllArgsConstructor
public class EtudiantRestController {
    IEtudiantService iEtudiantService;

    @GetMapping("getAllEtudiant")
    public List<Etudiant> getAll() {
        return iEtudiantService.findAllEtudiants();
    }

    @GetMapping("getEtudiantById")
    public Etudiant getById(@RequestParam long id) {
        return iEtudiantService.findEtudiantById(id);
    }

    @PostMapping("addEtudiant")
    public Etudiant addChmbre(@RequestBody Etudiant etudiant) {
        return iEtudiantService.addEtudiant(etudiant);
    }

    @PostMapping("addAllEtudiants")
    public List<Etudiant> addAllEtudiants(@RequestBody List<Etudiant> etudiants) {
        return iEtudiantService.addAllEtudiants(etudiants);
    }
}
