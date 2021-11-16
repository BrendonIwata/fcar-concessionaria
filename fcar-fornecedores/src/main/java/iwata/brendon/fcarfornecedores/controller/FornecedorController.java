package iwata.brendon.fcarfornecedores.controller;

import iwata.brendon.fcardominio.domain.dto.CriarPedidoDTO;
import iwata.brendon.fcarfornecedores.service.ValidarPedidoFornecedorService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@Slf4j
@RestController
@RequestMapping("/fornecedores")
public class FornecedorController {

    @Autowired
    private ValidarPedidoFornecedorService validarPedidoFornecedorService;

    @PostMapping("/pedidos/validacoes")
    public ResponseEntity<Void> validarCompraFornecedor(@RequestBody CriarPedidoDTO params) {
            log.info("recebeu a requisição do pedidos");
        try {
            validarPedidoFornecedorService.validar(params);
            log.info("validou com sucesso");
            return ResponseEntity.ok().build();
        } catch (Exception e) {
            log.info("houve um erro de validaçõo no serviço do fornecedor");
            log.error("", e);
            return ResponseEntity.badRequest().build();
        }
    }
}
