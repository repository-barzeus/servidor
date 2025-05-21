package br.com.douglasdreer.Barzeus.dto.response;

public record CategoriaResponse(
        Long id,
        String nome,
        boolean isAtivo
) {
}
