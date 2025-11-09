package gt.cog.monitoreo.entity;

import jakarta.persistence.*;
import lombok.*;
import java.time.LocalDate;

@Entity
@Table(name = "entrenamientos")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Entrenamiento {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private LocalDate fecha;

    private String tipo; // resistencia, técnica, fuerza, etc.

    @Column(name = "valor_rendimiento")
    private Double valorRendimiento; // tiempo, peso, distancia, etc.

    private boolean internacional;
    private String pais; // si aplica

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "atleta_id")
    private Atleta atleta;
}
