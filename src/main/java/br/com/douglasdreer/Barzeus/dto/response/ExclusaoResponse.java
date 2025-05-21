package br.com.douglasdreer.Barzeus.dto.response;

import java.time.LocalDateTime;

public record ExclusaoResponse(
        String titulo,
        String detalhes,
        LocalDateTime dataHora
) {

}
