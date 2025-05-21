package br.com.douglasdreer.Barzeus.dto.response;

import br.com.douglasdreer.Barzeus.dto.CategoriaDTO;

import java.math.BigDecimal;

public record ProdutoResponse (
        Long id,
        String nome,
        String descricao,
        CategoriaResponse categoria,
        BigDecimal valor
) {
}
