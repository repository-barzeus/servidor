package br.com.douglasdreer.Barzeus.model;

import br.com.douglasdreer.Barzeus.enums.ContatoType;
import br.com.douglasdreer.Barzeus.enums.DocumentoType;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import java.time.LocalDateTime;
import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Data

@Entity
@Table(name = "TBL_CLIENTES")
public class Cliente {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public Long id;

    @Column(name = "nome", nullable = false)
    private String nome;
    private String sobrenome;

    @OneToMany(mappedBy = "cliente", cascade = CascadeType.ALL)
    private List<Comanda> comandas;

    @OneToOne
    private Comanda comandaAtiva;


    @Enumerated(EnumType.STRING)
    @Column(name = "documento", unique = true, nullable = false)
    private DocumentoType documento;

    @Column(nullable = false, unique = true)
    private String numeroDocumento;

    @Enumerated(EnumType.STRING)
    @Column(name = "contato")
    private ContatoType contatoType;

    @Column(nullable = false, unique = true)
    private String numeroContato;

    @Column(name = "ativo")
    private boolean isAtivo;

    @Column(name = "criado_em", updatable = false)
    @CreationTimestamp
    private LocalDateTime criadoEm;

    @Column(name = "modificado_em")
    @UpdateTimestamp
    private LocalDateTime modificadoEm;

}
