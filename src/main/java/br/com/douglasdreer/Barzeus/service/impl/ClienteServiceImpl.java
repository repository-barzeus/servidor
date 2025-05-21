package br.com.douglasdreer.Barzeus.service.impl;

import br.com.douglasdreer.Barzeus.dto.ClienteDTO;
import br.com.douglasdreer.Barzeus.dto.mapper.ClienteMapper;
import br.com.douglasdreer.Barzeus.dto.request.AtualizarClienteRequest;
import br.com.douglasdreer.Barzeus.dto.request.CriarClienteRequest;
import br.com.douglasdreer.Barzeus.dto.validation.ClienteValidate;
import br.com.douglasdreer.Barzeus.enums.DocumentoType;
import br.com.douglasdreer.Barzeus.repository.ClienteRepository;
import br.com.douglasdreer.Barzeus.service.ClienteService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ClienteServiceImpl implements ClienteService {
    private final ClienteRepository repository;
    private final ClienteMapper mapper;
    private final ClienteValidate validate;

    public ClienteServiceImpl(ClienteRepository repository, ClienteMapper mapper, ClienteValidate validate) {
        this.repository = repository;
        this.mapper = mapper;
        this.validate = validate;
    }

    @Override
    public ClienteDTO salvarCliente(CriarClienteRequest clienteRequest) {
        return null;
    }

    @Override
    public List<ClienteDTO> listarClienteSemPaginacao() {
        return List.of();
    }

    @Override
    public List<ClienteDTO> listarClientePorNome() {
        return List.of();
    }

    @Override
    public ClienteDTO buscarClientePorTipoDocumentoAndNumeroDocumento(DocumentoType tipoDocumento, String numeroDocumento) {
        return null;
    }

    @Override
    public ClienteDTO editarCliente(Long clienteId, AtualizarClienteRequest clienteRequest) {
        return null;
    }

}
