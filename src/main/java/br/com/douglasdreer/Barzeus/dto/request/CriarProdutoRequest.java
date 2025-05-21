package br.com.douglasdreer.Barzeus.dto.request;

import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import org.springframework.validation.annotation.Validated;

import java.math.BigDecimal;

@Validated
public record CriarProdutoRequest(
        @NotNull(message = "O campo nome não pode ser vazio ou nulo")
        String nome,

        @NotNull(message = "O campo descrição não pode ser vazio ou nulo ")
        @Size(min = 10, max = 255)
        String descricao,

        @NotNull(message = "O campo categoria não pode ser vazio ou nulo ")
        AtualizarCategoriaRequest categoria,

        @NotNull(message = "O campo valor não pode ser vazio ou nulo")
        BigDecimal valor
) {
}
