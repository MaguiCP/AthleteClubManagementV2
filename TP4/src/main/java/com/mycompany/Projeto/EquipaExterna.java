package com.mycompany.Projeto;

/**
 * Representa uma equipa externa
 */
public class EquipaExterna implements IAlojar {

    /**
     * O nome da equipa externa
     */
    private String nome_equipa;
    /**
     * O escalão da equipa externa
     */
    private String escalao;
    /**
     * A cidade origem da equipa externa;
     */
    private String cidade_origem;
    /**
     * O país da equipa externa
     */
    private String pais;
    /**
     * A acomodação da equipa externa;
     */
    private boolean acomodacao;
    /**
     * String por omissão
     */
    private static final String STRING_POR_OMISSAO = "a preencher";
    /**
     * Boolean por omissão
     */
    private static final boolean BOOLEAN_POR_OMISSAO = false;

    /**
     * Contrói uma instância de equipa externa por omissão
     */
    public EquipaExterna() {
        setNome_equipa(STRING_POR_OMISSAO);
        setEscalao(STRING_POR_OMISSAO);
        setCidade_origem(STRING_POR_OMISSAO);
        setPais(STRING_POR_OMISSAO);
        setAcomodacao(BOOLEAN_POR_OMISSAO);
    }

    /**
     * Constrói uma instância de equipa externa recebendo nome_equipa, escalao,
     * cidade origem , pais, acomodacao
     *
     * @param nome_equipa   o nome da equipa externa
     * @param escalao       o escalão da equipa externa
     * @param cidade_origem a cidade origem da equipa externa
     * @param pais          o país da equipa externa
     * @param acomodacao    a acomodação da equipa externa
     */
    public EquipaExterna(String nome_equipa, String escalao, String cidade_origem, String pais, boolean acomodacao) {
        setNome_equipa(nome_equipa);
        setEscalao(escalao);
        setCidade_origem(cidade_origem);
        setPais(pais);
        setAcomodacao(acomodacao);
    }

    /**
     * Constrói uma instância de equipa externa , por cópia de outra equipa
     * externa
     *
     * @param equipa equipa externa a copiar
     */
    public EquipaExterna(EquipaExterna equipa) {
        setNome_equipa(equipa.nome_equipa);
        setEscalao(equipa.escalao);
        setCidade_origem(equipa.cidade_origem);
        setPais(equipa.pais);
        setAcomodacao(equipa.acomodacao);
    }

    /**
     * Devolve o nome da equipa externa
     *
     * @return nome da equipa externa
     */
    public String getNome_equipa() {
        return nome_equipa;
    }

    /**
     * Devolve o escalão da equipa externa
     *
     * @return o escalão da equipa externa
     */
    public String getEscalao() {
        return escalao;
    }

    /**
     * Devolve a cidade de origem da equipa externa
     *
     * @return cidade de origem da equipa externa
     */
    public String getCidade_origem() {
        return cidade_origem;
    }

    /**
     * Devolve o país da equipa externa
     *
     * @return o país da equipa externa
     */
    public String getPais() {
        return pais;
    }

    /**
     * Define o nome da equipa externa
     *
     * @param nome_equipa o nome da equipa externa
     */
    public void setNome_equipa(String nome_equipa) {
        this.nome_equipa = nome_equipa;
    }

    /**
     * Define o escalão da equipa externa
     *
     * @param escalao o escalão da equipa externa
     */
    public void setEscalao(String escalao) {
        this.escalao = escalao;
    }

    /**
     * Define a cidade de origem da equipa externa
     *
     * @param cidade_origem a cidade de origem da equipa externa
     */
    public void setCidade_origem(String cidade_origem) {
        this.cidade_origem = cidade_origem;
    }

    /**
     * Define Devolve o país da equipa externa
     *
     * @param pais Devolve o país da equipa externa
     */
    public void setPais(String pais) {
        this.pais = pais;
    }

    /**
     * Implementa a interface Ialojar, valida o alojamento
     *
     * @return acomodção
     */
    @Override
    public boolean validarAlojamento() {
        return acomodacao;
    }

    /**
     * Define a acomodação da equipa externa
     *
     * @param acomodacao a acomodação da equipa externa
     */
    public void setAcomodacao(boolean acomodacao) {
        this.acomodacao = acomodacao;
    }

    /**
     * Determina se a equipa externa é igual a outra equipa externa
     *
     * @param obj a equipa externa com a qual comparar
     * @return TRUE se as equipa externa forem iguais, FALSE caso contrário
     */
    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        EquipaExterna other = (EquipaExterna) obj;
        return nome_equipa.equals(other.nome_equipa) &&
                escalao.equals(other.escalao) &&
                cidade_origem.equals(other.cidade_origem) &&
                pais.equals(other.pais) &&
                acomodacao == other.acomodacao;
    }

    /**
     * Devolve a descrição textual da competição
     *
     * @return devolve a descrição textual da competição
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("\nEquipaExterna{");
        sb.append("\nnome_equipa=").append(nome_equipa);
        sb.append("\nescalao=").append(escalao);
        sb.append("\ncidade_origem=").append(cidade_origem);
        sb.append("\npais=").append(pais);
        sb.append("\nacomodacao=").append(acomodacao);
        sb.append('}');
        return sb.toString();
    }

}
