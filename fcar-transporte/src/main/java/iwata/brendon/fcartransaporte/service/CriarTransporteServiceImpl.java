package iwata.brendon.fcartransaporte.service;

import iwata.brendon.fcardominio.domain.dto.CriarPedidoDTO;
import iwata.brendon.fcardominio.domain.dto.RespCriaTransporteDTO;
import iwata.brendon.fcartransaporte.database.entity.EnvioProduto;
import iwata.brendon.fcartransaporte.database.repository.EnvioProdutoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.time.LocalDateTime;

@Service
public class CriarTransporteServiceImpl implements CriarTransporteService {

    @Autowired
    private EnvioProdutoRepository envioProdutoRepository;

    @Override
    public RespCriaTransporteDTO criar(CriarPedidoDTO params) {
        LocalDate dataEntrega = LocalDate.now().plusDays(7);
        EnvioProduto envioProduto = EnvioProduto.builder()
                .comDataEntrega(dataEntrega)
                .comDataHoraCadastro(LocalDateTime.now())
                .comDataHoraAtualizacao(LocalDateTime.now())
                .comIdFornecedor(params.getIdFornecedor())
                .comIdProduto(params.getIdProduto())
                .comStatus("EM TRANSPORTE")
                .build();

        envioProdutoRepository.save(envioProduto);

        return RespCriaTransporteDTO.builder().comDataEntrega(dataEntrega).build();
    }
}
