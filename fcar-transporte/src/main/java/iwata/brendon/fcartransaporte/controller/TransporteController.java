package iwata.brendon.fcartransaporte.controller;

import iwata.brendon.fcardominio.domain.dto.CriarPedidoDTO;
import iwata.brendon.fcardominio.domain.dto.RespCriaTransporteDTO;
import iwata.brendon.fcartransaporte.service.CriarTransporteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/transportes")
public class TransporteController {

    @Autowired
    private CriarTransporteService criarTransporteService;

    @PostMapping
    public ResponseEntity<RespCriaTransporteDTO> criarTransporte(@RequestBody CriarPedidoDTO params) {
        return ResponseEntity.status(HttpStatus.CREATED).body(criarTransporteService.criar(params));
    }
}
