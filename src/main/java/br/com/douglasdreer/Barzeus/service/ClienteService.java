package br.com.douglasdreer.Barzeus.service;

import br.com.douglasdreer.Barzeus.dto.ClienteDTO;
import br.com.douglasdreer.Barzeus.dto.request.AtualizarClienteRequest;
import br.com.douglasdreer.Barzeus.dto.request.CriarClienteRequest;
import br.com.douglasdreer.Barzeus.enums.DocumentoType;

import java.util.List;

public interface ClienteService {
    ClienteDTO salvarCliente(CriarClienteRequest clienteRequest);
    List<ClienteDTO> listarClienteSemPaginacao();
    List<ClienteDTO> listarClientePorNome();
    ClienteDTO buscarClientePorTipoDocumentoAndNumeroDocumento(DocumentoType tipoDocumento, String numeroDocumento);
    ClienteDTO editarCliente(Long clienteId, AtualizarClienteRequest clienteRequest);
}
