package br.com.douglasdreer.Barzeus.service.impl;

import br.com.douglasdreer.Barzeus.dto.ProdutoDTO;
import br.com.douglasdreer.Barzeus.dto.mapper.ProdutoMapper;
import br.com.douglasdreer.Barzeus.dto.request.AtualizarProdutoRequest;
import br.com.douglasdreer.Barzeus.dto.request.CriarProdutoRequest;
import br.com.douglasdreer.Barzeus.exception.ProdutoNaoEncontradoException;
import br.com.douglasdreer.Barzeus.model.Produto;
import br.com.douglasdreer.Barzeus.repository.ProdutoRepository;
import br.com.douglasdreer.Barzeus.service.ProdutoService;
import jakarta.transaction.Transactional;
import lombok.extern.log4j.Log4j2;
import org.springframework.stereotype.Service;

import java.util.List;

@Log4j2
@Service
public class ProdutoServiceImpl implements ProdutoService {
    private final ProdutoRepository repository;
    private final ProdutoMapper mapper;

    final static String PRODUTO_NAO_ENCONTRADO = "Produto não encontrado";

    public ProdutoServiceImpl(ProdutoRepository repository, ProdutoMapper mapper) {
        this.repository = repository;
        this.mapper = mapper;
    }


    /**
     * {@inheritDoc}
     */
    @Override
    public List<ProdutoDTO> listarProduto() {
        return repository.findAll()
                .stream()
                .map(mapper::toDTO)
                .toList();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ProdutoDTO buscarProdutoPorId(Long produtoId) {
        Produto produtoEncontrado = repository
                .findById(produtoId)
                .orElseThrow(() -> new ProdutoNaoEncontradoException("Produto não encontrado"));
        return mapper.toDTO(produtoEncontrado);
    }


    /**
     * {@inheritDoc}
     */
    @Override
    @Transactional(rollbackOn = Exception.class)
    public ProdutoDTO salvarProduto(CriarProdutoRequest produto) {
        Produto produtoSalvo = mapper.toModel(produto);
        produtoSalvo =  repository.save(produtoSalvo);
        return mapper.toDTO(produtoSalvo);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    @Transactional(rollbackOn = Exception.class)
    public List<ProdutoDTO> salvarProdutosEmLote(List<CriarProdutoRequest> produtoList) {
        List<Produto> produtos = produtoList
                .stream()
                .map(mapper::toModel)
                .toList();

        return repository.saveAll(produtos)
                .stream()
                .map(mapper::toDTO)
                .toList();

    }

    /**
     * {@inheritDoc}
     */
    @Override
    @Transactional(rollbackOn = Exception.class)
    public ProdutoDTO editarProduto(Long produtoId, AtualizarProdutoRequest produtoRequest) {
        if (!repository.existsById(produtoId)) {
            throw new ProdutoNaoEncontradoException(PRODUTO_NAO_ENCONTRADO);
        }

        Produto produtoAtualizado = mapper.toModel(produtoRequest);
        produtoAtualizado = repository.save(produtoAtualizado);
        return mapper.toDTO(produtoAtualizado);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    @Transactional(rollbackOn = Exception.class)
    public void excluirProduto(Long produtoId) {
        Produto produto = repository.findById(produtoId)
                .orElseThrow(() -> new ProdutoNaoEncontradoException(PRODUTO_NAO_ENCONTRADO));
        repository.deleteById(produtoId);
    }
}
