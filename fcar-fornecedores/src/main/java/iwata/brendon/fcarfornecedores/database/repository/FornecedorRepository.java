package iwata.brendon.fcarfornecedores.database.repository;

import iwata.brendon.fcarfornecedores.database.entity.Fornecedor;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FornecedorRepository extends JpaRepository<Fornecedor, Long> {
}
