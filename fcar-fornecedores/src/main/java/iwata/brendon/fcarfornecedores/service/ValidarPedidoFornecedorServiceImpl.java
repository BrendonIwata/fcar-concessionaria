package iwata.brendon.fcarfornecedores.service;

import iwata.brendon.fcardominio.domain.dto.CriarPedidoDTO;
import iwata.brendon.fcarfornecedores.database.entity.Fornecedor;
import iwata.brendon.fcarfornecedores.database.entity.Produto;
import iwata.brendon.fcarfornecedores.database.repository.FornecedorRepository;
import iwata.brendon.fcarfornecedores.database.repository.ProdutoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class ValidarPedidoFornecedorServiceImpl implements ValidarPedidoFornecedorService {

    @Autowired
    private FornecedorRepository fornecedorRepository;

    @Autowired
    private ProdutoRepository produtoRepository;

    @Override
    public void validar(CriarPedidoDTO params) {
        Optional<Fornecedor> fornecedorOptional = fornecedorRepository.findById(params.getIdFornecedor());

        Optional<Produto> produtoOptional = produtoRepository.findById(params.getIdProduto());

        if (!produtoOptional.isPresent() || !fornecedorOptional.isPresent()) {
            throw new RuntimeException();
        }
    }
}
