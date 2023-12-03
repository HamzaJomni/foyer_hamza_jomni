package com.example.foyerhamzajomni.RestControllers;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;
import com.example.foyerhamzajomni.DAO.Entitie.Bloc;
import com.example.foyerhamzajomni.Services.IBlocService;

import java.util.List;

@RestController
@AllArgsConstructor
public class BlocRestController {
    IBlocService iBlocService;
    // post, put, get, delete

    @GetMapping("getAllBlocs")
    public List<Bloc> getAll() {
        return iBlocService.findAllBlocs();
    }

    @PostMapping("addBloc")
    public Bloc addBloc(@RequestBody Bloc b) {
        return iBlocService.addBloc(b);
    }

    @PostMapping("addAllBlocs")
    public List<Bloc> addAllBlocs(@RequestBody List<Bloc> blocs) {
        return iBlocService.addAllBlocs(blocs);
    }
    //http://localhost:8081/getById?id=1
    @GetMapping("getBlocById")
    public Bloc getById(@RequestParam long id) {
        return iBlocService.findBlocById(id);
    }
    //http://localhost:8081/getById2/1
    @GetMapping("getByIdP/{id}")
    public Bloc getByIdP(@PathVariable long id) {
        return iBlocService.findBlocById(id);
    }
}
