package br.com.douglasdreer.Barzeus.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public enum DocumentoType {
    REGISTRO_GERAL("RG"),
    CADASTRO_DE_PESSOA_FISICA("CPF"),
    CADASTRO_NACIONAL_PESSOA_JURIDICA("CNPJ");

    private String abreviacao;
}
