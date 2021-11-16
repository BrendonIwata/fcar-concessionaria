package iwata.brendon.fcardominio.domain.dto;

import lombok.Data;

@Data
public class CriarPedidoDTO {

    private Long idProduto;

    private Long quantidade;

    private Long idCliente;

    private Long idFornecedor;
}
