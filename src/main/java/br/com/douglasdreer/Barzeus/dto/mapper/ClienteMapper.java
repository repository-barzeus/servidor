package br.com.douglasdreer.Barzeus.dto.mapper;

import br.com.douglasdreer.Barzeus.dto.ClienteDTO;
import br.com.douglasdreer.Barzeus.dto.request.AtualizarClienteRequest;
import br.com.douglasdreer.Barzeus.dto.request.CriarClienteRequest;
import br.com.douglasdreer.Barzeus.model.Cliente;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel = "spring")
public interface ClienteMapper {
    @Mapping(target = "id", ignore = true)
    Cliente toModel(CriarClienteRequest clienteRequest);
    Cliente toModel(AtualizarClienteRequest clienteRequest);

    ClienteDTO toDTO(Cliente entity);


}
