package br.com.douglasdreer.Barzeus.model;


import br.com.douglasdreer.Barzeus.enums.StatusPedidoType;
import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDateTime;

@Entity
@Table(name = "pedidos")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Pedido {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    private Comanda comanda;

    @ManyToOne
    private Produto produto;

    private Integer quantidade = 1;
    private LocalDateTime dataHoraSolicitacao;

    @Enumerated(EnumType.STRING)
    @Column(name = "status")
    private StatusPedidoType status;


}
