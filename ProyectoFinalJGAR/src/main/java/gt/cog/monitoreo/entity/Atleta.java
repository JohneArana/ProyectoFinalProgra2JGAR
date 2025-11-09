package gt.cog.monitoreo.entity;

import jakarta.persistence.*;
import lombok.*;
import java.time.LocalDate;

@Entity
@Table(name = "atletas")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Atleta {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_atleta")
    private Long idAtleta;

    @Column(length = 100, nullable = false)
    private String nombreCompleto;

    @Column(nullable = false)
    private Integer edad;

    @Column(length = 50, nullable = false)
    private String disciplina;

    @Column(length = 50, nullable = false)
    private String departamento;

    @Column(length = 50, nullable = false)
    private String nacionalidad;

    @Column(name = "fecha_ingreso")
    private LocalDate fechaIngreso;
}