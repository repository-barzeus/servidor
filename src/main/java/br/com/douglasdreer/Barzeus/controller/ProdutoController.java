package br.com.douglasdreer.Barzeus.controller;

import br.com.douglasdreer.Barzeus.dto.CategoriaDTO;
import br.com.douglasdreer.Barzeus.dto.ProdutoDTO;
import br.com.douglasdreer.Barzeus.dto.mapper.ProdutoMapper;
import br.com.douglasdreer.Barzeus.dto.request.AtualizarProdutoRequest;
import br.com.douglasdreer.Barzeus.dto.request.CriarProdutoRequest;
import br.com.douglasdreer.Barzeus.dto.response.CategoriaResponse;
import br.com.douglasdreer.Barzeus.dto.response.ProdutoResponse;
import br.com.douglasdreer.Barzeus.dto.response.ExclusaoResponse;
import br.com.douglasdreer.Barzeus.service.CategoriaService;
import br.com.douglasdreer.Barzeus.service.ProdutoService;
import jakarta.validation.constraints.NotNull;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDateTime;
import java.util.List;

@RestController
public class ProdutoController extends BaseController {
    private final ProdutoService service;
    private final CategoriaService categoriaService;
    private final ProdutoMapper mapper;

    public ProdutoController(ProdutoService service, CategoriaService categoriaService, ProdutoMapper mapper) {
        this.service = service;
        this.categoriaService = categoriaService;
        this.mapper = mapper;
    }

    @GetMapping(LISTAR_PRODUTO)
    public ResponseEntity<List<ProdutoDTO>> listarProduto() {
        return ResponseEntity.ok(service.listarProduto());
    }

    @GetMapping(BUSCAR_PRODUTO_POR_ID)
    public ResponseEntity<ProdutoResponse> buscarProdutoPorId(@PathVariable Long produtoId) {
        ProdutoDTO produtoEncontrado =  service.buscarProdutoPorId(produtoId);
        return ResponseEntity.ok(mapper.toResponse(produtoEncontrado));
    }

    @PostMapping(CADASTRAR_NOVO_PRODUTO)
    public ResponseEntity<ProdutoResponse> salvarProduto(
            @Validated @NotNull @RequestBody CriarProdutoRequest request
    ) {
        ProdutoDTO produtoDTO = service.salvarProduto(request);
        CategoriaDTO categoriaEncontrada = categoriaService.buscarCategoriaPorId(produtoDTO.getCategoria().getId());
        produtoDTO.setCategoria(categoriaEncontrada);

        return ResponseEntity.ok(mapper.toResponse(produtoDTO));
    }

    @PutMapping(EDITAR_PRODUTO)
    public ResponseEntity<ProdutoResponse> editarProduto(
            @PathVariable(PRODUTO_ID) Long produtoId,
            @Validated @NotNull @RequestBody AtualizarProdutoRequest request
    ) {
        ProdutoDTO produtoDTO = service.editarProduto(produtoId, request);
        return ResponseEntity.ok(mapper.toResponse(produtoDTO));
    }

    @DeleteMapping(EXCLUIR_PRODUTO)
    public ResponseEntity<ExclusaoResponse> excluirProduto(
            @PathVariable(PRODUTO_ID) Long produtoId
    ) {
        ExclusaoResponse exclusaoResponse = new ExclusaoResponse(
            "Exclusão de Produto",
                "A exclusão do produto " + produtoId + " realizada com sucesso",
                LocalDateTime.now()
        );

        service.excluirProduto(produtoId);

        return ResponseEntity.ok(exclusaoResponse);
    }
}
