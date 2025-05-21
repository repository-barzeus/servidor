package br.com.douglasdreer.Barzeus.dto;

import br.com.douglasdreer.Barzeus.enums.ContatoType;
import br.com.douglasdreer.Barzeus.enums.DocumentoType;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;
import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class ClienteDTO {
    private Long id;
    private String nome;
    private String sobrenome;
    private DocumentoType documento;
    private ContatoType contato;
    private List<ComandaDTO> comandas;
    private ComandaDTO comandaAtiva;
    private LocalDateTime criadoEm;
    private LocalDateTime modificadoEm;
    private boolean isAtivo;
}
