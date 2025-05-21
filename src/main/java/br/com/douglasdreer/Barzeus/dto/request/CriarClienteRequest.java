package br.com.douglasdreer.Barzeus.dto.request;

import br.com.douglasdreer.Barzeus.enums.ContatoType;
import br.com.douglasdreer.Barzeus.enums.DocumentoType;

public record CriarClienteRequest(
        String nome,
        String sobrenome,
        DocumentoType documentoTipo,
        String numeroDocumento,
        ContatoType contatoTipo,
        String numeroContato
) {
}
