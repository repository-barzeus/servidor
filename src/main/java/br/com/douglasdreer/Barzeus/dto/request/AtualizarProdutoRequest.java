package br.com.douglasdreer.Barzeus.dto.request;

import jakarta.validation.constraints.NotNull;

import java.math.BigDecimal;

public record AtualizarProdutoRequest(
        @NotNull(message = "O campo id não pode ser vazio ou nulo")
        Long id,
        @NotNull(message = "O campo nome não pode ser vazio ou nulo")
        String nome,
        @NotNull(message = "O campo descrição não pode ser vazio ou nulo")
        String descricao,
        @NotNull(message = "O campo valor não pode ser vazio ou nulo")
        BigDecimal valor
) {
}
