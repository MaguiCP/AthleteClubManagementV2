package com.mycompany.Projeto;

/**
 * Representa uma competição
 */
public abstract class Competicao {

    /**
     * O código da competição
     */
    private int codigo;
    /**
     * A designação da competição
     */
    private String designacao;
    /**
     * A data de início da competição
     */
    private Data data_inicio;
    /**
     * A data de fim da competição
     */
    private Data data_fim;
    /**
     * O nome do coordenador da competição
     */
    private String nome_coordenador;
    /**
     * O formato da competição
     */
    private String formato;

    /**
     * Formato da competição a eliminar
     */
    public static final String FORMATO_COMPETICAO_A_ELIMINAR = "Competição a eliminar";
    /**
     * Formato da competição por pontos
     */
    public static final String FORMATO_COMPETICAO_POR_PONTOS = "Cozinha por pontos";
    /**
     * formato da competição mista
     */
    public static final String FORMATO_COMPETICAO_MISTA = "Cozinha mista";
    /**
     * String por omissão
     */
    private static final String STRING_POR_OMISSAO = "a preencher";
    /**
     * Inteiro por omissão
     */
    private static final int INT_POR_OMISSAO = 0;

    /**
     * Constroi uma instância de competição por omissão
     */
    Competicao() {
        setCodigo(INT_POR_OMISSAO);
        setDesignacao(STRING_POR_OMISSAO);
        setData_inicio(new Data());
        setData_fim(new Data());
        setNome_coordenador(STRING_POR_OMISSAO);
        setFormato(STRING_POR_OMISSAO);

    }

    /**
     * Constrói uma instância de competição, recebendo o código, designação,
     * data_inicio, data_fim, nome_coordenador, formato
     *
     * @param codigo           o código da competição
     * @param designacao       a designação da competição
     * @param data_inicio      a data de início da competição
     * @param data_fim         a data de fim da competição
     * @param nome_coordenador o nome do coordenador da competição
     * @param formato          o formato da competição
     */
    public Competicao(int codigo, String designacao, Data data_inicio, Data data_fim, String nome_coordenador,
            String formato) {
        this.codigo = codigo;
        this.designacao = designacao;
        this.data_inicio = data_inicio;
        this.data_fim = data_fim;
        this.nome_coordenador = nome_coordenador;
        this.formato = formato;
    }

    /**
     * Constrói uma instância de competição , por cópia de outra competição
     * 
     * @param competicao competição a copiar
     */
    public Competicao(Competicao competicao) {
        setCodigo(competicao.codigo);
        setDesignacao(competicao.designacao);
        setData_inicio(competicao.data_inicio);
        setData_fim(competicao.data_fim);
        setNome_coordenador(competicao.nome_coordenador);
        setFormato(competicao.formato);

    }

    /**
     * Devolve o código da competição
     * 
     * @return codigo da competição
     */
    public int getCodigo() {
        return codigo;
    }

    /**
     * Devolve a designação da competição
     * 
     * @return designacao da competição
     */
    public String getDesignacao() {
        return designacao;
    }

    /**
     * Devolve a data de início da competição
     * 
     * @return a data de início da competição
     */
    public Data getData_inicio() {
        return data_inicio;
    }

    /**
     * Devolve a data de fim da competição
     * 
     * @return a data de fim da competição
     */
    public Data getData_fim() {
        return data_fim;
    }

    /**
     * Devolve o nome do coordenador da competição
     * 
     * @return o nome do coordenador da competição
     */
    public String getNome_coordenador() {
        return nome_coordenador;
    }

    /**
     * Devolve o formato da competição
     * 
     * @return formato da competição
     */
    public String getFormato() {
        return formato;
    }

    /**
     * Define o código da competição
     * 
     * @param codigo da competição
     */
    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    /**
     * Define a designação da competição
     * 
     * @param designacao
     */
    public void setDesignacao(String designacao) {
        this.designacao = designacao;
    }

    /**
     * Define a data de início da competição
     * 
     * @param data_inicio da competição
     */
    public void setData_inicio(Data data_inicio) {
        this.data_inicio = data_inicio;
    }

    /**
     * Define a data de fim da competição
     * 
     * @param data_fim da competição
     */
    public void setData_fim(Data data_fim) {
        this.data_fim = data_fim;
    }

    /**
     * Define o nome do coordenador da competição
     * 
     * @param nome_coordenador da competição
     */
    public void setNome_coordenador(String nome_coordenador) {
        this.nome_coordenador = nome_coordenador;
    }

    /**
     * Define o formato da competição
     * 
     * @param formato da competição
     */
    public void setFormato(String formato) {
        this.formato = formato;
    }

    /**
     * Devolve a descrição textual da competição
     * 
     * @return a descrição textual da competição
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("\nCompeticao{");
        sb.append("\ncodigo=").append(codigo);
        sb.append("\ndesignacao=").append(designacao);
        sb.append("\ndata_inicio=").append(data_inicio);
        sb.append("\ndata_fim=").append(data_fim);
        sb.append("\nnome_coordenador=").append(nome_coordenador);
        sb.append("\nformato=").append(formato);
        sb.append('}');
        return sb.toString();
    }

    /**
     * Determina se a competição é igual a outra competição
     * 
     * @param obj a competição com a qual comparar
     * @return TRUE se as competições forem iguais, FALSE caso contrário
     */
    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        Competicao other = (Competicao) obj;
        return codigo == other.codigo &&
                designacao.equals(other.designacao) &&
                data_inicio.equals(other.data_inicio) &&
                data_fim.equals(other.data_fim) &&
                nome_coordenador.equals(other.nome_coordenador) &&
                formato.equals(other.formato);
    }
}
