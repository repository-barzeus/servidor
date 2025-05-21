package br.com.douglasdreer.Barzeus.repository;

import br.com.douglasdreer.Barzeus.model.Produto;
import jakarta.validation.constraints.NotNull;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ProdutoRepository extends JpaRepository<Produto, Long> {
    @Query("SELECT COUNT(p) > 0 FROM Produto p WHERE p.nome = :nome AND p.isAtivo = :status")
    boolean existeProdutoComNomeAndStatus(
            @NotNull @Param("nome") String nome,
            @NotNull @Param("status") boolean status
    );

    @Query("SELECT p FROM Produto p WHERE p.isAtivo = :status")
    List<Produto> listarTodosOsProdutosPorStatus(
            @Param("status") boolean status
    );
}
