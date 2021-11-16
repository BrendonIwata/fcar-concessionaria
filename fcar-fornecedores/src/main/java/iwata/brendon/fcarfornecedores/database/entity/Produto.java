package iwata.brendon.fcarfornecedores.database.entity;

import lombok.*;
import org.hibernate.Hibernate;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.io.Serializable;
import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.Objects;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder(setterPrefix = "com")
public class Produto implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idProduto;

    private Long idFornecedor;

    private BigDecimal valor;

    private LocalDateTime dataCadastro;

    private LocalDateTime dataHoraAtualizacao;

    private String nome;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || Hibernate.getClass(this) != Hibernate.getClass(o)) return false;
        Produto produto = (Produto) o;
        return idProduto != null && Objects.equals(idProduto, produto.idProduto);
    }

    @Override
    public int hashCode() {
        return getClass().hashCode();
    }

    @Override
    public String toString() {
        return "Produto{" +
                "idProduto=" + idProduto +
                ", idFornecedor=" + idFornecedor +
                ", valor=" + valor +
                ", dataCadastro=" + dataCadastro +
                ", dataHoraAtualizacao=" + dataHoraAtualizacao +
                ", nome='" + nome + '\'' +
                '}';
    }
}
