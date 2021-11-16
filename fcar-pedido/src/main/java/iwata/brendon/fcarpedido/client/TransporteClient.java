package iwata.brendon.fcarpedido.client;

import iwata.brendon.fcardominio.domain.dto.CriarPedidoDTO;
import iwata.brendon.fcardominio.domain.dto.RespCriaTransporteDTO;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@FeignClient(name = "transporte")
public interface TransporteClient {

    @PostMapping("/transportes")
    RespCriaTransporteDTO validarCompraFornecedor(@RequestBody CriarPedidoDTO params);
}
