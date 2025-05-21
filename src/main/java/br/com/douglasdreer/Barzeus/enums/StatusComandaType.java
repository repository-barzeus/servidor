package br.com.douglasdreer.Barzeus.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public enum StatusComandaType {
    ABERTA,
    EM_ATENDIMENTO,
    FINALIZADA,
    CANCELADA
}
