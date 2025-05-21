package br.com.douglasdreer.Barzeus.dto.mapper;

import br.com.douglasdreer.Barzeus.dto.ProdutoDTO;
import br.com.douglasdreer.Barzeus.dto.request.AtualizarProdutoRequest;
import br.com.douglasdreer.Barzeus.dto.request.CriarProdutoRequest;
import br.com.douglasdreer.Barzeus.dto.response.ProdutoResponse;
import br.com.douglasdreer.Barzeus.model.Produto;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel = "spring")
public interface ProdutoMapper {

    @Mapping(target = "id", ignore = true)
    Produto toModel(CriarProdutoRequest request);

    @Mapping(target = "id", ignore = true)
    Produto toModel(AtualizarProdutoRequest request);

    ProdutoDTO toDTO(Produto entity);
    ProdutoResponse toResponse(ProdutoDTO dto);
}
