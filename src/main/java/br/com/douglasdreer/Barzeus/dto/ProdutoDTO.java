package br.com.douglasdreer.Barzeus.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
import java.time.LocalDateTime;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class ProdutoDTO {
    private Long id;
    private String nome;
    private String descricao;
    private BigDecimal valor;
    private CategoriaDTO categoria;
    private boolean isDisponivel;
    private boolean isAtivo;
    private LocalDateTime criadoEm;
    private LocalDateTime modificadoEm;
}
