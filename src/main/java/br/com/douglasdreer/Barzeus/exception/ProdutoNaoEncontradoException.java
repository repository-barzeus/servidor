package br.com.douglasdreer.Barzeus.exception;

import jakarta.persistence.EntityNotFoundException;

public class ProdutoNaoEncontradoException extends EntityNotFoundException {
    public ProdutoNaoEncontradoException(String message) {
        super(message);
    }
}
