package br.com.douglasdreer.Barzeus.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import java.math.BigDecimal;
import java.time.LocalDateTime;

@Entity
@Table(name = "TBL_PRODUTOS")

@AllArgsConstructor
@NoArgsConstructor
@Data
public class Produto {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "nome", nullable = false)
    private String nome;
    private String descricao;

    @OneToOne(fetch = FetchType.LAZY)
    private Categoria categoria;

    @Column(name = "valor", nullable = false)
    private BigDecimal valor;

    @Column(name = "disponivel")
    private boolean isDisponivel = true;

    @Column(name = "ativo")
    private boolean isAtivo = true;

    @Column(name = "criado_em", updatable = false)
    @CreationTimestamp
    private LocalDateTime criadoEm;

    @Column(name = "modificado_em")
    @UpdateTimestamp
    private LocalDateTime modificadoEm;

}
