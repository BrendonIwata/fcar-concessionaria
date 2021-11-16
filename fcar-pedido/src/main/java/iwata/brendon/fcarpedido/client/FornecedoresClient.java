package iwata.brendon.fcarpedido.client;

import iwata.brendon.fcardominio.domain.dto.CriarPedidoDTO;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@FeignClient(name = "fornecedores")
public interface FornecedoresClient {

    @PostMapping("/fornecedores/pedidos/validacoes")
    void validarCompraFornecedor(@RequestBody CriarPedidoDTO params);
}
