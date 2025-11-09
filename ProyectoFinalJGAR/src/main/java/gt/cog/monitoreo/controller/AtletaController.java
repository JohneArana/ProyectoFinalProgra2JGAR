package gt.cog.monitoreo.controller;

import gt.cog.monitoreo.entity.Atleta;
import gt.cog.monitoreo.service.AtletaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/atletas")
@CrossOrigin(origins = "*")
public class AtletaController {

    @Autowired
    private AtletaService atletaService;

    @GetMapping
    public List<Atleta> listarAtletas() {
        return atletaService.listarAtletas();
    }

    @GetMapping("/{id}")
    public ResponseEntity<Atleta> obtenerPorId(@PathVariable Long id) {
        return atletaService.obtenerPorId(id)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }

    @PostMapping
    public Atleta crearAtleta(@RequestBody Atleta atleta) {
        return atletaService.guardarAtleta(atleta);
    }

    @PutMapping("/{id}")
    public ResponseEntity<Atleta> actualizarAtleta(@PathVariable Long id, @RequestBody Atleta detalles) {
        return atletaService.obtenerPorId(id)
                .map(atleta -> {
                    atleta.setNombreCompleto(detalles.getNombreCompleto());
                    atleta.setEdad(detalles.getEdad());
                    atleta.setDisciplina(detalles.getDisciplina());
                    atleta.setDepartamento(detalles.getDepartamento());
                    atleta.setNacionalidad(detalles.getNacionalidad());
                    atleta.setFechaIngreso(detalles.getFechaIngreso());
                    Atleta actualizado = atletaService.guardarAtleta(atleta);
                    return ResponseEntity.ok(actualizado);
                })
                .orElse(ResponseEntity.notFound().build());
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> eliminarAtleta(@PathVariable Long id) {
        atletaService.eliminarAtleta(id);
        return ResponseEntity.noContent().build();
    }
}
