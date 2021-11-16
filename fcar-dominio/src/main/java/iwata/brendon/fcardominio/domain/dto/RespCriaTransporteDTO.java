package iwata.brendon.fcardominio.domain.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder(setterPrefix = "com")
public class RespCriaTransporteDTO {

    public LocalDate dataEntrega;
}
