package gt.cog.monitoreo.dto;

import lombok.*;
import java.time.LocalDate;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class EntrenamientoDto {
    private Long id;
    private LocalDate fecha;
    private String tipo;
    private Double valorRendimiento;
    private boolean internacional;
    private String pais;
    private Long atletaId;
}
