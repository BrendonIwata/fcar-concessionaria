package iwata.brendon.fcartransaporte.service;

import iwata.brendon.fcardominio.domain.dto.CriarPedidoDTO;
import iwata.brendon.fcardominio.domain.dto.RespCriaTransporteDTO;

public interface CriarTransporteService {

    RespCriaTransporteDTO criar (CriarPedidoDTO params);
}
