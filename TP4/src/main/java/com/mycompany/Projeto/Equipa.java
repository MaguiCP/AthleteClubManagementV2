package com.mycompany.Projeto;

import java.util.ArrayList;

/**
 * Representa uma equipa
 */
public class Equipa {

    /**
     * O escalão a que pertence a equipa
     */
    private String escalao;

    /**
     * A Modalidade a que pertence a equipa
     */
    private Modalidade modalidade;

    /**
     * O ano civil em que a equipa foi criada
     */
    private int anoCivil;

    /**
     * A lista de jogadores da equipa
     */
    private ArrayList<Jogador> jogadores;

    /**
     * A string por omissão
     */
    private static final String STRING_POR_OMISSAO = "a preencher";

    /**
     * O inteiro por omissão
     */
    private static final int INT_POR_OMISSAO = 0;

    /**
     * Constrói uma instância de equipa por omissão
     */
    public Equipa() {
        setEscalao(STRING_POR_OMISSAO);
        setAnoCivil(INT_POR_OMISSAO);
        setJogadores(new ArrayList<Jogador>());
        setModalidade(new Modalidade());
    }

    /**
     * Constrói uma instância de equipa com escalão, ano civil da sua criação e
     * modalidade. A lista de jogadores é criada vazia.
     *
     * @param escalao    O escaláo da equipa
     * @param anoCivil   O ano civil em que a equipa foi criada
     * @param modalidade A modalidade da equipa
     */
    public Equipa(String escalao, int anoCivil, Modalidade modalidade) {
        setEscalao(escalao);
        setAnoCivil(anoCivil);
        setJogadores(new ArrayList<Jogador>());
        setModalidade(modalidade);
    }

    /**
     * Constrói uma instância de equipa com escalão, ano civil da sua criação,
     * modalidade e lista de jogadores.
     *
     * @param escalao    O escaláo da equipa
     * @param anoCivil   O ano civil em que a equipa foi criada
     * @param modalidade A modalidade da equipa
     * @param jogadores  A lista de jogadores da equipa
     */
    public Equipa(String escalao, int anoCivil, Modalidade modalidade, ArrayList<Jogador> jogadores) {
        setEscalao(escalao);
        setAnoCivil(anoCivil);
        setJogadores(jogadores);
        setModalidade(modalidade);
    }

    /**
     * Constrói uma instância de equipa por cópia de outra equipa.
     *
     * @param equipa A equipa a copiar
     */
    public Equipa(Equipa equipa) {
        setEscalao(equipa.escalao);
        setAnoCivil(equipa.anoCivil);
        setJogadores(equipa.jogadores);
        setModalidade(equipa.modalidade);
    }

    /**
     * Devolve o escalão da equipa
     *
     * @return O escalão da equipa
     */
    public String getEscalao() {
        return escalao;
    }

    /**
     * Devolve o ano civil de criação da equipa
     *
     * @return O ano civil de criação da equipa
     */
    public int getAnoCivil() {
        return anoCivil;
    }

    /**
     * Devolve a modalidade da equipa
     *
     * @return A modalidade da equipa
     */
    public Modalidade getModalidade() {
        return modalidade;
    }

    /**
     * Devolve a lista de jogadores da equipa
     *
     * @return A lista de jogadores da equipa
     */
    public ArrayList<Jogador> getJogadores() {
        return new ArrayList<>(jogadores);
    }

    /**
     * Define o escalão da equipa
     *
     * @param escalao O escalão da equipa
     */
    public void setEscalao(String escalao) {
        this.escalao = escalao;
    }

    /**
     * Define o ano civil da criação da equipa
     *
     * @param anoCivil O ano civil da criação da equipa
     */
    public void setAnoCivil(int anoCivil) {
        this.anoCivil = anoCivil;
    }

    /**
     * Define a lista de jogadores da equipa
     *
     * @param jogadores A lista de jogadores da equipa
     */
    public void setJogadores(ArrayList<Jogador> jogadores) {
        this.jogadores = new ArrayList<>(jogadores);
    }

    /**
     * Define a modalidade da equipa
     *
     * @param modalidade A modalidade da equipa
     */
    public void setModalidade(Modalidade modalidade) {
        this.modalidade = modalidade;
    }

    /**
     * Devolve a descrição textual da equipa
     *
     * @return A descrição textual da equipa
     */
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("\n\tEscalão -> ");
        sb.append(escalao);
        sb.append("\n\tAno Civil: ");
        sb.append(anoCivil);
        sb.append("\n\tModalidade:");
        sb.append(modalidade);
        sb.append("\n\tJogadores da equipa:");
        if (jogadores.isEmpty()) {
            sb.append(" (vazio) ");
        } else {
            for (Jogador j : jogadores) {
                sb.append(j + "\n");
            }
        }
        return sb.toString();
    }

    /**
     * Determina se a equipa é igual a outra equipa
     *
     * @param outroObjeto A equipa com a qual comparar
     *
     * @return TRUE se as equipas forem iguais, FALSE caso contrário
     */
    @Override
    public boolean equals(Object outroObjeto) {
        if (this == outroObjeto) {
            return true;
        }
        if (outroObjeto == null || this.getClass() != outroObjeto.getClass()) {
            return false;
        }
        Equipa obj = (Equipa) outroObjeto;
        return this.escalao.equalsIgnoreCase(obj.escalao)
                && this.anoCivil == obj.anoCivil
                && this.jogadores == obj.jogadores
                && this.modalidade.equals(obj.modalidade);
    }

    /**
     * Adiciona um jogador à equipa, sabendo o número da camisola, posição e a
     * que atleta se refere
     *
     * @param numeroCamisola O numero da camisola do jogador na equipa
     * @param posicaoJogador A posição do jogador na equipa
     * @param atleta         O atleta a que se refere
     */
    public void adicionarJogador(int numeroCamisola, String posicaoJogador, Atleta atleta) {
        jogadores.add(new Jogador(numeroCamisola, posicaoJogador, atleta));
    }

    /**
     * Devolve um jogador com base no seu número de camisola
     *
     * @param numCamisola O número de camisola a procurar na lista de jogadores
     *
     * @return O jogador com o número de camisola requisitado
     */
    public Jogador obterJogador(int numCamisola) {
        Jogador j = null;
        boolean resp = true;
        for (int i = 0; i < jogadores.size() && resp == true; i++) {
            j = jogadores.get(i);
            if (j.getNumeroCamisola() == numCamisola) {
                resp = false;
            }
        }
        return j;
    }

    /**
     * Elimina um jogador da lista de jogadores da equipa. O jogador a remover é
     * escolhido pelo seu número de camisola.
     *
     * @param numCamisola O número de camisola do jogador a remover
     */
    void eliminarJogador(int numCamisola) {
        Jogador j = obterJogador(numCamisola);
        jogadores.remove(j);
    }

    /**
     * Determina se a equipa está associada a uma modalidade
     *
     * @param m A modalidade a verificar
     *
     * @return TRUE se a equipa está associada à modalidade, FALSE caso
     *         contrário
     */
    public boolean isModalidade(Modalidade m) {
        return m.equals(modalidade);
    }

    /**
     * Calcula e devolve o total de prémios individuais de todos os jogadores da
     * equipa
     *
     * @return O total de prémios individuais de todos os jogadores da equipa
     */
    public int totalPremiosIndividuaisEquipa() {
        int total = 0;
        for (Jogador j : jogadores) {
            total += j.totalPremiosIndividuais();
        }
        return total;
    }

    /**
     * Determina se um atleta é jogador da equipa
     *
     * @param atleta O atleta a verificar
     *
     * @return TRUE se o atleta for jogador da equipa, FALSE caso contrário
     */
    public boolean containsJogador(Atleta atleta) {
        for (Jogador j : jogadores) {
            if (j.isAtleta(atleta)) {
                return true;
            }
        }
        return false;
    }
}
