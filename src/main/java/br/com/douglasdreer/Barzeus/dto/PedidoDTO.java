package br.com.douglasdreer.Barzeus.dto;

import br.com.douglasdreer.Barzeus.enums.StatusPedidoType;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class PedidoDTO {
    private Long id;
    private ProdutoDTO produto;
    private Integer quantidade;
    private LocalDateTime dataHoraSolicitacao;
    private StatusPedidoType status;
}
