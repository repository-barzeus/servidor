package br.com.douglasdreer.Barzeus.repository;

import br.com.douglasdreer.Barzeus.enums.DocumentoType;
import br.com.douglasdreer.Barzeus.model.Cliente;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface ClienteRepository extends JpaRepository<Cliente, Long> {
//    @Query(name = "SELECT COUNT(c) > 0 FROM Cliente c WHERE c.documento = :documento AND c.numeroDocumento = :numeroDocumento")
//    boolean existeTipoDocumentoAndNumeroDocumento(DocumentoType documento, String numeroDocumento);
}
