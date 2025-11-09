package gt.cog.monitoreo.dto;

import lombok.*;
import java.time.LocalDate;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class AtletaDto {
    private Long id;
    private String nombreCompleto;
    private Integer edad;
    private String disciplina;
    private String departamento;
    private String nacionalidad;
    private LocalDate fechaIngreso;
}
