package iwata.brendon.fcartransaporte.database.entity;

import lombok.*;
import org.hibernate.Hibernate;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.io.Serializable;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Objects;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder(setterPrefix = "com")
public class EnvioProduto implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idEnvioProduto;

    private LocalDate dataEntrega;

    private LocalDateTime dataHoraCadastro;

    private LocalDateTime dataHoraAtualizacao;

    private String status;

    private Long idProduto;

    private Long idFornecedor;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || Hibernate.getClass(this) != Hibernate.getClass(o)) return false;
        EnvioProduto that = (EnvioProduto) o;
        return idEnvioProduto != null && Objects.equals(idEnvioProduto, that.idEnvioProduto);
    }

    @Override
    public int hashCode() {
        return getClass().hashCode();
    }

    @Override
    public String toString() {
        return "EnvioProduto{" +
                "idEnvioProduto=" + idEnvioProduto +
                ", dataEntrega=" + dataEntrega +
                ", dataHoraCadastro=" + dataHoraCadastro +
                ", dataHoraAtualizacao=" + dataHoraAtualizacao +
                ", status='" + status + '\'' +
                ", idProduto=" + idProduto +
                ", idFornecedor=" + idFornecedor +
                '}';
    }
}
