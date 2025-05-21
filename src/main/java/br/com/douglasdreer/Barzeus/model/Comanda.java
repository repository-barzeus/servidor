package br.com.douglasdreer.Barzeus.model;

import br.com.douglasdreer.Barzeus.dto.ClienteDTO;
import br.com.douglasdreer.Barzeus.dto.PedidoDTO;
import br.com.douglasdreer.Barzeus.enums.StatusComandaType;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.CreationTimestamp;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.List;

@Entity
@Table(name = "TBL_COMANDAS")

@AllArgsConstructor
@NoArgsConstructor
@Data
public class Comanda {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    private Cliente cliente;

    @OneToMany(mappedBy = "comanda", cascade = CascadeType.ALL)
    private List<Pedido> pedidos;

    @Column(name = "valor_total")
    private BigDecimal valorTotal;

    @CreationTimestamp
    @Column(name = "data_hora_abertura")
    private LocalDateTime dataHoraAbertura;

    @Enumerated(EnumType.STRING)
    private StatusComandaType status;
}
