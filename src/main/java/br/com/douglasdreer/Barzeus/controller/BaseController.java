package br.com.douglasdreer.Barzeus.controller;

public abstract class BaseController {
    /**
     * <h2>Variáveis globais</h2>
     * <hr />
     */
    final static String PRODUTO_ID = "produtoId";
    final static String PRODUTO_PARAMETRO = "{" + PRODUTO_ID + "}";
    final static String CATEGORIA_ID = "categoriaId";
    final static String CATEGORIA_PARAMETRO = "{" + CATEGORIA_ID + "}";
    final static String CLIENTE_ID = "clienteId";
    final static String COMANDA_ID = "comandaId";


    /**
     * <h6 style='text-right'>Administração</h6>
     * <h2>Produtos:</h2>
     * <hr />
     * <p>As URL's referentes à manutenção dos produtos</p>
     */
    final static String BASE_URL_CADASTRO_PRODUTO = "/admin/produtos";

    final static String LISTAR_PRODUTO = BASE_URL_CADASTRO_PRODUTO;
    final static String BUSCAR_PRODUTO_POR_ID = BASE_URL_CADASTRO_PRODUTO + "/" + PRODUTO_PARAMETRO;
    final static String CADASTRAR_NOVO_PRODUTO = BASE_URL_CADASTRO_PRODUTO;
    final static String EDITAR_PRODUTO = BASE_URL_CADASTRO_PRODUTO + "/" + PRODUTO_PARAMETRO;
    final static String EXCLUIR_PRODUTO = BASE_URL_CADASTRO_PRODUTO + "/" + PRODUTO_PARAMETRO;

    /**
     * <h6 style='text-right'>Administração</h6>
     * <h2>Categorias:</h2>
     * <hr />
     * <p>As URL's referentes à manutenção dos categorias</p>
     */
    final static String BASE_URL_CADASTRO_CATEGORIA = "/admin/categorias";
    final static String LISTA_CATEGORIAS = BASE_URL_CADASTRO_CATEGORIA;
    final static String BUSCAR_CATEGORIA_POR_ID = BASE_URL_CADASTRO_CATEGORIA + "/" + CATEGORIA_PARAMETRO;
    final static String CADASTRAR_CATEGORIA = BASE_URL_CADASTRO_CATEGORIA;
    final static String CADASTRAR_CATEGORIA_LOTE = BASE_URL_CADASTRO_CATEGORIA + "/lote";
    final static String EDITAR_CATEGORIA = BASE_URL_CADASTRO_CATEGORIA + "/" + BASE_URL_CADASTRO_CATEGORIA;
    final static String EXCLUIR_CATEGORIA = BASE_URL_CADASTRO_CATEGORIA + "/" + BASE_URL_CADASTRO_CATEGORIA;
}
