package iwata.brendon.fcarpedido.controller;

import iwata.brendon.fcardominio.domain.dto.CriarPedidoDTO;
import iwata.brendon.fcardominio.domain.dto.RespCriaTransporteDTO;
import iwata.brendon.fcarpedido.service.CriarPedidoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/pedidos")
public class PedidoController {

    @Autowired
    private CriarPedidoService criarPedidoService;

    @PostMapping
    public ResponseEntity<RespCriaTransporteDTO> crairPedido (@RequestBody CriarPedidoDTO params) {
        return ResponseEntity.status(HttpStatus.CREATED).body(criarPedidoService.criar(params));
    }
}
