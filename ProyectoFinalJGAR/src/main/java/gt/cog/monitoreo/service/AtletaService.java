package gt.cog.monitoreo.service;

import gt.cog.monitoreo.entity.Atleta;
import gt.cog.monitoreo.repository.AtletaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class AtletaService {

    @Autowired
    private AtletaRepository atletaRepository;

    public List<Atleta> listarAtletas() {
        return atletaRepository.findAll();
    }

    public Optional<Atleta> obtenerPorId(Long id) {
        return atletaRepository.findById(id);
    }

    public Atleta guardarAtleta(Atleta atleta) {
        return atletaRepository.save(atleta);
    }

    public void eliminarAtleta(Long id) {
        atletaRepository.deleteById(id);
    }
}