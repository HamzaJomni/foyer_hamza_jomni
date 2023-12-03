package com.example.foyerhamzajomni.RestControllers;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;
import com.example.foyerhamzajomni.DAO.Entitie.Foyer;
import com.example.foyerhamzajomni.Services.IFoyerService;

import java.util.List;

@RestController
@AllArgsConstructor
public class FoyerRestController {
    IFoyerService iFoyerService;

    @GetMapping("getAllFoyer")
    public List<Foyer> getAll() {
        return iFoyerService.findAllFoyers();
    }

    @GetMapping("getFoyerById")
    public Foyer getById(@RequestParam long id) {
        return iFoyerService.findFoyerById(id);
    }

    @PostMapping("addFoyer")
    public Foyer addChmbre(@RequestBody Foyer foyer) {
        return iFoyerService.addFoyer(foyer);
    }

    @PostMapping("addAllFoyers")
    public List<Foyer> addAllFoyers(@RequestBody List<Foyer> foyers) {
        return iFoyerService.addAllFoyers(foyers);
    }
}
