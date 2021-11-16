package iwata.brendon.fcarpedido.service;

import iwata.brendon.fcardominio.domain.dto.CriarPedidoDTO;
import iwata.brendon.fcardominio.domain.dto.RespCriaTransporteDTO;

public interface CriarPedidoService {

    RespCriaTransporteDTO criar (CriarPedidoDTO params);
}
