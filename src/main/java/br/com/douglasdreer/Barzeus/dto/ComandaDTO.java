package br.com.douglasdreer.Barzeus.dto;

import br.com.douglasdreer.Barzeus.enums.StatusComandaType;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class ComandaDTO {
    private Long id;
    private ClienteDTO cliente;
    private List<PedidoDTO> pedidos;
    private BigDecimal valorTotal;
    private LocalDateTime dataAbertura;
    private StatusComandaType status;

    /**
     * Calcula o subtotal da comanda
     * @return valor atual da comanda {@link BigDecimal}
     */
    public BigDecimal calcularSubtotal() {
        return pedidos.stream()
                .map(pedido -> pedido.getProduto().getValor().multiply(BigDecimal.valueOf(pedido.getQuantidade())))
                .reduce(BigDecimal.ZERO, BigDecimal::add);
    }
}
