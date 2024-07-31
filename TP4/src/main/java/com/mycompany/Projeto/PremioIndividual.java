package com.mycompany.Projeto;

/**
 * Representa um prémio individual
 */
public class PremioIndividual {
    /**
     * O nome do prémio individual
     */
    private String nome;

    /**
     * O ano civil em que o prémio foi atribuído
     */
    private int anoCivil;

    /**
     * A string por omissão
     */
    private static final String STRING_POR_OMISSAO = "a preencher";

    /**
     * O inteiro por omissão
     */
    private static final int INT_POR_OMISSAO = 0;

    /**
     * Constrói uma instância de PremioIndividual por omissão
     */
    public PremioIndividual() {
        setNome(STRING_POR_OMISSAO);
        setAnoCivil(INT_POR_OMISSAO);
    }

    /**
     * Constrói uma instância de PremioIndividual a partir do seu nome e ano de
     * atribuição
     * 
     * @param nome     O nome do prémio
     * @param anoCivil O ano civil em que o prémio foi atribuido
     */
    public PremioIndividual(String nome, int anoCivil) {
        setNome(nome);
        setAnoCivil(anoCivil);
    }

    /**
     * Constrói uma instância de PremioIndividual por cópia de outro prémio
     * 
     * @param premioIndvidual O prémio a copiar
     */
    public PremioIndividual(PremioIndividual premioIndvidual) {
        setNome(premioIndvidual.nome);
        setAnoCivil(premioIndvidual.anoCivil);
    }

    /**
     * Devolve o nome do prémio
     * 
     * @return O nome do prémio
     */
    public String getNome() {
        return nome;
    }

    /**
     * Devolve o ano civil em que o prémio foi atribuído
     * 
     * @return O ano civil em que o prémio foi atribuído
     */
    public int getAnoCivil() {
        return anoCivil;
    }

    /**
     * Define o nome do prémio
     * 
     * @param nome O nome do prémio
     */
    public void setNome(String nome) {
        this.nome = nome;
    }

    /**
     * Define o ano civil em que o prémio foi atribuído
     * 
     * @param anoCivil O o ano civil em que o prémio foi atribuído
     */
    public void setAnoCivil(int anoCivil) {
        this.anoCivil = anoCivil;
    }

    /**
     * Devolve a descrição textual do prémio individual
     * 
     * @return A descrição textual do prémio individual
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("\n\t\t\tNome -> ");
        sb.append(nome);
        sb.append("\n\t\t\tAno civil -> ");
        sb.append(anoCivil);
        sb.append("\n\t\t\t<<<<>>>>>");
        return sb.toString();
    }

    /**
     * Determina se o prémio é igual a outro prémio
     *
     * @param outroObjeto O prémio com o qual comparar
     *
     * @return TRUE se os prémios forem iguais, FALSE caso contrário
     */
    @Override
    public boolean equals(Object outroObjeto) {
        if (this == outroObjeto) {
            return true;
        }
        if (outroObjeto == null || this.getClass() != outroObjeto.getClass()) {
            return false;
        }
        PremioIndividual obj = (PremioIndividual) outroObjeto;
        return this.nome.equalsIgnoreCase(obj.nome) &&
                this.anoCivil == obj.anoCivil;
    }
}
