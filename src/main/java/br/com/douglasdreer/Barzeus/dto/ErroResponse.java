package br.com.douglasdreer.Barzeus.dto;

import java.time.LocalDateTime;

public record ErroResponse(
        String titulo,
        String detalhes,
        int codigo,
        LocalDateTime dataHora
) {
}
