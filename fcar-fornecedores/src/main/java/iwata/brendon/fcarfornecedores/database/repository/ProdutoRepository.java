package iwata.brendon.fcarfornecedores.database.repository;

import iwata.brendon.fcarfornecedores.database.entity.Produto;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProdutoRepository extends JpaRepository<Produto, Long> {
}
