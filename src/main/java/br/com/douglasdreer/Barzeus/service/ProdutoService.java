package br.com.douglasdreer.Barzeus.service;

import br.com.douglasdreer.Barzeus.dto.ProdutoDTO;
import br.com.douglasdreer.Barzeus.dto.request.AtualizarProdutoRequest;
import br.com.douglasdreer.Barzeus.dto.request.CriarProdutoRequest;
import br.com.douglasdreer.Barzeus.enums.StatusProdutoType;

import java.util.List;

public interface ProdutoService {

    /**
     * Listar todos os produtos sem paginação
     * @return
     */
    List<ProdutoDTO> listarProduto();

    /**
     * Buscar produto por id
     * @param id {@link Long}
     * @return categoria
     *
     * @see br.com.douglasdreer.Barzeus.repository.ProdutoRepository#findById(Object);
     */
    ProdutoDTO buscarProdutoPorId(Long id);

    /**
     * Salva um novo produto
     * @param produto Produto que deverá ser salvo
     * @return {@link ProdutoDTO}
     *
     * @see br.com.douglasdreer.Barzeus.repository.ProdutoRepository#save
     */
    ProdutoDTO salvarProduto(CriarProdutoRequest produto);

    /**
     * Salvar um lista de produtos
     * @param produtoList Lista de produtos a serem salvos
     * @return ProdutoDTO lista de produtos salvos
     * @see br.com.douglasdreer.Barzeus.repository.ProdutoRepository#saveAll(Iterable)
     */
    List<ProdutoDTO> salvarProdutosEmLote(List<CriarProdutoRequest> produtoList);

    /**
     * Altera os dados do produto
     * @param produto
     * @return {@link ProdutoDTO}
     */
    ProdutoDTO editarProduto(Long produtoId, AtualizarProdutoRequest produto);

    /**
     * Excluí o produto
     * @param produtoId Código do produto {@link Long}
     * @see br.com.douglasdreer.Barzeus.repository.ProdutoRepository#deleteAllById(Iterable)
     */
    void excluirProduto(Long produtoId);
}
