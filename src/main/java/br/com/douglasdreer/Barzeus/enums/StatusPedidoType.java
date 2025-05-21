package br.com.douglasdreer.Barzeus.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public enum StatusPedidoType {
    RECEBIDO,
    EM_PREPARACAO,
    PRONTO,
    ENTREGUE,
    CANCELADO
}
