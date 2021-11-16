package iwata.brendon.fcarpedido.service;

import iwata.brendon.fcardominio.domain.dto.CriarPedidoDTO;
import iwata.brendon.fcardominio.domain.dto.RespCriaTransporteDTO;
import iwata.brendon.fcarpedido.client.FornecedoresClient;
import iwata.brendon.fcarpedido.client.TransporteClient;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Slf4j
@Service
public class CriarPedidoServiceImpl implements CriarPedidoService{

    @Autowired
    private FornecedoresClient fornecedoresClient;

    @Autowired
    private TransporteClient transporteClient;

    @Override
    public RespCriaTransporteDTO criar(CriarPedidoDTO params) {
        log.info("chamou o microserviço dos fornecedores");
        fornecedoresClient.validarCompraFornecedor(params);
        return transporteClient.validarCompraFornecedor(params);
    }
}
