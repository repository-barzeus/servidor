package br.com.douglasdreer.Barzeus.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class CategoriaDTO {
    private Long id;
    private String nome;
    private boolean isAtivo;
    private LocalDateTime criadoEm;
    private LocalDateTime modificadoEm;
}
