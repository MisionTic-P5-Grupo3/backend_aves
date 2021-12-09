package misionticP5G3.controllers;

import java.util.List;
import misionticP5G3.repositories.AvesRepository;
import misionticP5G3.models.Ave;
import misionticP5G3.exceptions.AveAlreadyExistsException;
import misionticP5G3.exceptions.AveNotFoundException;
import org.springframework.web.bind.annotation.*;

@RestController
public class AvesController {
    // Conectar a la base de Datos
    private final AvesRepository avesRepository;

    public AvesController(AvesRepository avesRepository) {
        this.avesRepository = avesRepository;
    }

    @GetMapping("/")
    String messageRoot() {
        return "Bienvenido a Avesms";
    }

    // Controlador para traer todas las aves
    @GetMapping("/aves")
    List<Ave> getAves() {
        List<Ave> aves = avesRepository.findAll();
        if (aves.isEmpty()) {
            throw new AveNotFoundException("No existen registros de aves de ese tipo");
        }
        return aves;
    }

    // Controlador para traer ave por su id
    @GetMapping("/ave/{id}")
    Ave getAveById(@PathVariable String id) {
        return avesRepository.findById(id)
                .orElseThrow(() -> new AveNotFoundException("No se encontro registro del ave"));

    }

    // Controlador para traer aves por tipoAve
    @GetMapping("/avesByJornada/{tipoAve}")
    List<Ave> getAvesByTipoAve(@PathVariable String tipoAve) {
        List<Ave> aves = avesRepository.findByTipoAve(tipoAve);
        if (aves.isEmpty()) {
            throw new AveNotFoundException("No existen registros de aves de ese tipo");
        }
        return aves;
    }

    // Controlador para eliminar ave por su id
    @DeleteMapping("/ave/{id}")
    String deleteById(@PathVariable String id) {
        avesRepository.findById(id).orElseThrow(() -> new AveNotFoundException("No se encontro registro del ave"));
        avesRepository.deleteById(id);
        return "Registro eliminado Exisitosamente";

    }

    // Controlador para crear ave
    @PostMapping("/createAve")
    Ave newAccount(@RequestBody Ave ave) {
        if (avesRepository.existsById(ave.getNombreCientificoAve()) == true) {
            throw new AveAlreadyExistsException("Ya existe un ave con este nombre");
        }
        return avesRepository.save(ave);
    }

    // Controlador para editar informacion de un ave
    @PutMapping("/updateAve/{id}")
    Ave newAccount(@PathVariable String id, @RequestBody Ave ave) {
        avesRepository.findById(id).orElseThrow(() -> new AveNotFoundException("No se encontro registro del ave"));
        avesRepository.deleteById(id);
        return avesRepository.save(ave);
    }

}
