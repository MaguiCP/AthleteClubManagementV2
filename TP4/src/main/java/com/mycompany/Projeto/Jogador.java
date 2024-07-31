package com.mycompany.Projeto;

import java.util.ArrayList;

/**
 * Representa um jogador
 */
public class Jogador {
    /**
     * O número da camisola do jogador
     */
    private int numeroCamisola;

    /**
     * A posição do jogador
     */
    private String posicaoJogador;

    /**
     * O altleta associado ao jogador
     */
    private Atleta atleta;

    /**
     * A lista de prémios individuais do jogador
     */
    private ArrayList<PremioIndividual> premiosIndividuais;

    /**
     * Constrói uma instância de jogador a partir do número da camisola, posição do
     * jogador e atleta a que corresponde. A lista de prémios individuais é criada
     * vazia.
     * 
     * @param numeroCamisola O número da camisola do jogador
     * @param posicaoJogador A posição do jogador
     * @param atleta         O atleta a que o jogador corresponde
     */
    public Jogador(int numeroCamisola, String posicaoJogador, Atleta atleta) {
        setNumeroCamisola(numeroCamisola);
        setPosicaoJogador(posicaoJogador);
        setAtleta(atleta);
        setPremiosIndividuais(new ArrayList<>());
    }

    /**
     * Constrói uma instância de jogador a partir do número da camisola, posição do
     * jogador, atleta a que corresponde e lista de prémios individuais.
     * 
     * @param numeroCamisola     O número da camisola do jogador
     * @param posicaoJogador     A posição do jogador
     * @param atleta             O atleta a que o jogador corresponde
     * @param premiosIndividuais A lista de prémios individuais
     */
    public Jogador(int numeroCamisola, String posicaoJogador, Atleta atleta,
            ArrayList<PremioIndividual> premiosIndividuais) {
        setNumeroCamisola(numeroCamisola);
        setPosicaoJogador(posicaoJogador);
        setAtleta(atleta);
        setPremiosIndividuais(premiosIndividuais);
    }

    /**
     * Constrói uma instância de jogador como cópia de outro jogador
     * 
     * @param jogador O jogador a copiar
     */
    Jogador(Jogador jogador) {
        this(jogador.numeroCamisola, jogador.posicaoJogador, jogador.atleta, jogador.premiosIndividuais);
    }

    /**
     * Devolve o número da camisola do jogador
     * 
     * @return O número da camisola do jogador
     */
    public int getNumeroCamisola() {
        return numeroCamisola;
    }

    /**
     * Devolve a posição do jogador
     * 
     * @return A posição do jogador
     */
    public String getPosicaoJogador() {
        return posicaoJogador;
    }

    /**
     * Devolve o atleta a que corresponde o jogador
     * 
     * @return O atleta a que corresponde o jogador
     */
    public Atleta getAtleta() {
        return atleta;
    }

    /**
     * Devolve a lista de prémios individuais do jogador
     * 
     * @return A lista de prémios individuais do jogador
     */
    public ArrayList<PremioIndividual> getPremiosIndividuais() {
        return new ArrayList<>(premiosIndividuais);
    }

    /**
     * Define o número da camisola do jogador
     * 
     * @param numeroCamisola O número da camisola do jogador
     */
    public void setNumeroCamisola(int numeroCamisola) {
        this.numeroCamisola = numeroCamisola;
    }

    /**
     * Define a posição do jogador
     * 
     * @param posicaoJogador A posição do jogador
     */
    public void setPosicaoJogador(String posicaoJogador) {
        this.posicaoJogador = posicaoJogador;
    }

    /**
     * Define o atleta que corresponde ao jogador
     * 
     * @param atleta O atleta que corresponde ao jogador
     */
    public void setAtleta(Atleta atleta) {
        this.atleta = atleta;
    }

    /**
     * Define a lista de prémios individuais do jogador
     * 
     * @param premiosIndividuais A lista de prémios individuais do jogador
     */
    public void setPremiosIndividuais(ArrayList<PremioIndividual> premiosIndividuais) {
        this.premiosIndividuais = new ArrayList<>(premiosIndividuais);
    }

    /**
     * Devolve a descrição textual do jogador
     * 
     * @return A descrição textual do jogador
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("\n\t\tNúmero da camisola -> ");
        sb.append(numeroCamisola);
        sb.append("\n\t\tPosição do jogador: ");
        sb.append(posicaoJogador);
        sb.append("\n\t\tDados pessoais (atleta): ");
        sb.append(atleta.toString());
        sb.append("\n\t\tPrémios Individuais:");
        if (premiosIndividuais.isEmpty()) {
            sb.append(" ( vazio ) ");
        } else {
            for (PremioIndividual pi : premiosIndividuais) {
                sb.append(pi + "\n");
            }
        }
        return sb.toString();
    }

    /**
     * Determina se o jogador é igual a outro jogador
     *
     * @param outroObjeto O jogador com o qual comparar
     *
     * @return TRUE se os jogadors forem iguais, FALSE caso contrário
     */
    @Override
    public boolean equals(Object outroObjeto) {
        if (this == outroObjeto) {
            return true;
        }
        if (outroObjeto == null || this.getClass() != outroObjeto.getClass()) {
            return false;
        }
        Jogador obj = (Jogador) outroObjeto;
        return this.numeroCamisola == obj.numeroCamisola
                && this.posicaoJogador.equalsIgnoreCase(obj.posicaoJogador)
                && this.atleta.equals(obj.atleta)
                && this.premiosIndividuais == obj.premiosIndividuais;
    }

    /**
     * Adiciona um prémio individual ao jogador
     * 
     * @param nome     O nome do prémio
     * @param anoCivil O ano civil em que o prémio foi atribuído
     */
    public void adicionarPremioIndividual(String nome, int anoCivil) {
        premiosIndividuais.add(new PremioIndividual(nome, anoCivil));
    }

    /**
     * Calcula e devolve o número total de prémios individuais do jogador
     * 
     * @return O número total de prémios individuais do jogador
     */
    public int totalPremiosIndividuais() {
        return premiosIndividuais.size();
    }

    /**
     * Determina se o jogador está associado a um atleta
     * 
     * @param atleta O atleta a verificar
     * 
     * @return TRUE caso o jogador esteja associado ao atleta, FALSO caso contrário
     */
    public boolean isAtleta(Atleta atleta) {
        return this.atleta.equals(atleta);
    }
}
