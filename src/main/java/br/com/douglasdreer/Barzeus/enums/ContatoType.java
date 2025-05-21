package br.com.douglasdreer.Barzeus.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public enum ContatoType {
    TELEFONE_RESIDENCIAL("Telefone residencial"),
    TELEFONE_COMERCIAL("Telefone comercial"),
    WHATSAPP("Whatsapp"),
    EMAIL("e-mail");

    private String descricao;
}
