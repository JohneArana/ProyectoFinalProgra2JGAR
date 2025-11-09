package gt.cog.monitoreo.repository;

import gt.cog.monitoreo.entity.Entrenamiento;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.time.LocalDate;
import java.util.List;

@Repository
public interface EntrenamientoRepository extends JpaRepository<Entrenamiento, Long> {
    List<Entrenamiento> findByAtleta_IdAtleta(Long idAtleta);
    List<Entrenamiento> findByAtleta_IdAtletaAndInternacional(Long idAtleta, boolean internacional);
    List<Entrenamiento> findByAtleta_IdAtletaAndFechaBetween(Long idAtleta, LocalDate desde, LocalDate hasta);
}
