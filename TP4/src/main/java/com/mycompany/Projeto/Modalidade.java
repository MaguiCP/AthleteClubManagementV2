package com.mycompany.Projeto;

/**
 * Representa uma modalidade
 */
public class Modalidade {
    /**
     * O nome da modalidade
     */
    private String nome;

    /**
     * O ano de início da modalidade
     */
    private int anoAtivacao;

    /**
     * A string por omissão
     */
    private static final String STRING_POR_OMISSAO = "a preencher";

    /**
     * O inteiro por omissão
     */
    private static final int INT_POR_OMISSAO = 0;

    /**
     * Constrói uma instância de modalidade por omissão
     */
    public Modalidade() {
        setNome(STRING_POR_OMISSAO);
        setAnoAtivacao(INT_POR_OMISSAO);
    }

    /**
     * Constrói uma instância de modalidade a partir do seu nome e data de início
     * 
     * @param nome        O nome da modalidade
     * @param anoAtivacao O ano de início da modalidade
     */
    public Modalidade(String nome, int anoAtivacao) {
        setNome(nome);
        setAnoAtivacao(anoAtivacao);
    }

    /**
     * Constrói uma instância de modalidade como cópia de outra modalidade
     * 
     * @param modalidade A modalidade a copiar
     */
    public Modalidade(Modalidade modalidade) {
        setNome(modalidade.nome);
        setAnoAtivacao(modalidade.anoAtivacao);
    }

    /**
     * Devolve o nome da modalidade
     * 
     * @return O nome da modalidade
     */
    public String getNome() {
        return nome;
    }

    /**
     * Devolve o ano de início da modalidade
     * 
     * @return O ano de início da modalidade
     */
    public int getAnoAtivacao() {
        return anoAtivacao;
    }

    /**
     * Define o nome da modalidade
     * 
     * @param nome O nome da modalidade
     */
    public void setNome(String nome) {
        this.nome = nome;
    }

    /**
     * Define o ano de início da modalidade
     * 
     * @param anoAtivacao O ano de início da modalidade
     */
    public void setAnoAtivacao(int anoAtivacao) {
        this.anoAtivacao = anoAtivacao;
    }

    /**
     * Devolve a descrição textual da modalidade
     * 
     * @return A descrição textual da modalidade
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("\n\t\tNome -> ");
        sb.append(nome);
        sb.append("\n\t\tAno de ativação: ");
        sb.append(anoAtivacao);
        sb.append("\n\t\t---------------- ");
        return sb.toString();
    }

    /**
     * Determina se a modalidade é igual a outra modalidade
     *
     * @param outroObjeto A modalidade com a qual comparar
     *
     * @return TRUE se as modalidades forem iguais, FALSE caso contrário
     */
    @Override
    public boolean equals(Object outroObjeto) {
        if (this == outroObjeto) {
            return true;
        }
        if (outroObjeto == null || this.getClass() != outroObjeto.getClass()) {
            return false;
        }
        Modalidade obj = (Modalidade) outroObjeto;
        return this.nome.equalsIgnoreCase(obj.nome) &&
                this.anoAtivacao == obj.anoAtivacao;
    }
}
