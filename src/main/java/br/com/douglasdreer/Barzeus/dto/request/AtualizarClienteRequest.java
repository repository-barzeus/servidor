package br.com.douglasdreer.Barzeus.dto.request;

import br.com.douglasdreer.Barzeus.enums.ContatoType;
import br.com.douglasdreer.Barzeus.enums.DocumentoType;
import jakarta.validation.constraints.NotNull;

public record AtualizarClienteRequest(
        @NotNull(message = "O campo nome não pode ser vazio ou nulo")
        Long id,
        @NotNull(message = "O campo nome não pode ser vazio ou nulo")
        String nome,
        @NotNull(message = "O campo nome não pode ser vazio ou nulo")
        String sobrenome,
        @NotNull(message = "O campo nome não pode ser vazio ou nulo")
        DocumentoType tipoDocumento,
        @NotNull(message = "O campo nome não pode ser vazio ou nulo")
        String numeroDocumento,
        @NotNull(message = "O campo nome não pode ser vazio ou nulo")
        ContatoType tipoContato,
        @NotNull(message = "O campo nome não pode ser vazio ou nulo")
        String numeroContato
) {
}
