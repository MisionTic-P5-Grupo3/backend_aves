package misionticP5G3.controllers;

import java.util.List;
import misionticP5G3.repositories.AvesRepository;
import misionticP5G3.backendAves.models.Ave;
import misionticP5G3.exceptions.AveNotFoundException;
import org.springframework.web.bind.annotation.*;

@RestController
public class AvesController {
    // Conectar a la base de Datos
    private final AvesRepository avesRepository;

    public AvesController(AvesRepository avesRepository) {
        this.avesRepository = avesRepository;
    }

    // Controlador para traer todas las aves
    @GetMapping("/aves/{id}")
    List<Ave> getAves() {
        return avesRepository.findAll();
    }

    // Controlador para traer ave por su id
    @GetMapping("/aves/{id}")
    Ave getAveById(@PathVariable int id) {
        return avesRepository.findById(id)
                .orElseThrow(() -> new AveNotFoundException("No se encontro registro del ave"));

    }

    // Controlador para eliminar ave por su id
    @DeleteMapping("/aves/{id}")
    String deleteById(@PathVariable int id) {
        avesRepository.findById(id).orElseThrow(() -> new AveNotFoundException("No se encontro registro del ave"));
        avesRepository.deleteById(id);
        return "Registro eliminado Exisitosamente";

    }

    // Controllador para crear ave
    @PostMapping("/aves")
    Ave newAccount(@RequestBody Ave ave) {
        return avesRepository.save(ave);
    }

    @PutMapping("/aves")
    Ave newAccount(@PathVariable int id, @RequestBody Ave ave) {
        avesRepository.findById(id).orElseThrow(() -> new AveNotFoundException("No se encontro registro del ave"));
        avesRepository.deleteById(id);
        return avesRepository.save(ave);
    }

}
