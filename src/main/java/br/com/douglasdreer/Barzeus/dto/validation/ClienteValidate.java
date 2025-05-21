package br.com.douglasdreer.Barzeus.dto.validation;

import br.com.douglasdreer.Barzeus.enums.DocumentoType;
import br.com.douglasdreer.Barzeus.exception.ClienteInvalidoException;
import org.springframework.stereotype.Component;

@Component
public class ClienteValidate {

    public void validarDocumento(DocumentoType documento, String numeroDocumento) {

    }

    private String escolherValidacaoDocumento(DocumentoType documentoType, String numeroDocumento) {
       return null;
    }

    private void removerFormatacao(String numeroDocumento) {}

    /**
     * Formatar o número do documento pelo tipo de documento
     * @param tipoDocumento
     */
    private String formatarDocumentoPorTipoDocumento(DocumentoType tipoDocumento, String numeroDocumento) {
        String numeroDocumentoFormatado = numeroDocumento;

        switch(tipoDocumento) {
            case CADASTRO_DE_PESSOA_FISICA -> numeroDocumentoFormatado = numeroDocumento.replaceAll("(\\d{3})(\\d{3})(\\d{3})(\\d{2})", "$1.$2.$3-$4");
            case REGISTRO_GERAL -> numeroDocumentoFormatado = numeroDocumento.replaceAll("(\\d{2})(\\d{3})(\\d{3})", "$1.$2.$3");
            case CADASTRO_NACIONAL_PESSOA_JURIDICA -> numeroDocumentoFormatado.replaceAll("(\\d{2})(\\d{3})(\\d{3})(\\d{4})(\\d{2})", "$1.$2.$3/$4-$5");
            default -> throw new ClienteInvalidoException("Documento do tipo: " + tipoDocumento.getAbreviacao() + " inválido");
        }

        return numeroDocumentoFormatado;
    }

    private void validarDocumentoCPF(String numeroCPF) {

    }
}
/**
 * public class DocumentoFormatter {
 *
 *     public static String formatarCpf(String cpf) {
 *         return cpf.replaceAll("(\\d{3})(\\d{3})(\\d{3})(\\d{2})", "$1.$2.$3-$4");
 *     }
 *
 *     public static String formatarCnpj(String cnpj) {
 *         return cnpj.replaceAll("(\\d{2})(\\d{3})(\\d{3})(\\d{4})(\\d{2})", "$1.$2.$3/$4-$5");
 *     }
 *
 *     public static String formatarRg(String rg) {
 *         return rg.replaceAll("(\\d{2})(\\d{3})(\\d{3})", "$1.$2.$3");
 *     }
 *
 *     public static void main(String[] args) {
 *         System.out.println(formatarCpf("12345678901"));   // Saída: 123.456.789-01
 *         System.out.println(formatarCnpj("12345678000195")); // Saída: 12.345.678/0001-95
 *         System.out.println(formatarRg("123456789"));     // Saída: 12.345.678
 *     }
 * }
 */