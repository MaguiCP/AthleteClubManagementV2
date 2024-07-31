package com.mycompany.Projeto;

import java.util.ArrayList;
import java.util.Objects;

/**
 * Representa uma competição externa
 */
public class Competicao_externa extends Competicao implements IPagavel {

    /**
     * O custo base da competição externa
     */
    private float custo_base;
    /**
     * O nome do diretor da competição externa
     */

    private String nome_diretor;
    /**
     * Array da competição externa
     */
    private ArrayList<EquipaExterna> equipas_externas;
    /**
     * Equipa interna da competição externa
     */
    Equipa equipaInterna;
    /**
     * String por Omissão
     */
    private static final String STRING_POR_OMISSAO = "a preencher";
    /**
     * Int por Omissão
     */
    private static final int INT_POR_OMISSAO = 0;

    /**
     * Constroi uma instância de competição externa por omissão
     *
     * @throws ExcecaoNumeroPositivo
     */
    public Competicao_externa() throws ExcecaoNumeroPositivo {
        setCusto_base(INT_POR_OMISSAO);
        setNome_diretor(STRING_POR_OMISSAO);
        setEquipas_externas(new ArrayList<EquipaExterna>());
        setEquipaInterna(new Equipa());
    }

    /**
     * Constrói uma instância de competição externa , recebendo o custo_base ,
     * nome_diretor, codigo, desinacao ,data_inicio,data_fim, nome_coordenador,
     * formato
     *
     * @param custo_base       o custo base da competição externa
     * @param nome_diretor     o nome do diretor da competição externa
     * @param codigo           o código da competição externa
     * @param designacao       a designação da competição
     * @param data_inicio      a data de início da competição
     * @param data_fim         a data de fim da competição
     * @param nome_coordenador o nome do coordenador da competição
     * @param formato          o formato da competição
     * @throws ExcecaoNumeroPositivo exceção do número positivo para o custo
     *                               base
     */
    public Competicao_externa(float custo_base, String nome_diretor, int codigo, String designacao, Data data_inicio,
            Data data_fim, String nome_coordenador, String formato) throws ExcecaoNumeroPositivo {
        super(codigo, designacao, data_inicio, data_fim, nome_coordenador, formato);
        setCusto_base(custo_base);
        setNome_diretor(nome_diretor);
        setEquipas_externas(new ArrayList<EquipaExterna>());
        setEquipaInterna(new Equipa());
    }

    /**
     * Constrói uma instância de competição externa , por cópia de outra
     * competição externa
     *
     * @param competicao_e competição a copiar
     * @throws ExcecaoNumeroPositivo
     */
    public Competicao_externa(Competicao_externa competicao_e) throws ExcecaoNumeroPositivo {
        setCusto_base(competicao_e.custo_base);
        setNome_diretor(competicao_e.nome_diretor);
        setEquipas_externas(competicao_e.equipas_externas);
        setEquipaInterna(competicao_e.equipaInterna);
    }

    /**
     * Devolve a equipe interna da competição externa
     *
     * @return a equipe interna da competição externa
     */
    public Equipa getEquipaInterna() {
        return equipaInterna;
    }

    /**
     * Define a equipe interna da competição externa
     *
     * @param equipaInterna a equipe interna da competição externa
     */
    public void setEquipaInterna(Equipa equipaInterna) {
        this.equipaInterna = equipaInterna;
    }

    /**
     * Devolve o custo base da competição externa
     *
     * @return o custo base da competição externa
     */
    public float getCusto_base() {
        return custo_base;
    }

    /**
     * Devolve o nome do diretor da competição externa
     *
     * @return o nome do diretor da competição externa
     */
    public String getNome_diretor() {
        return nome_diretor;
    }

    /**
     * Devolve a lista de equipas externas da competição externa
     *
     * @return a lista de equipas externas da competição externa
     */
    public ArrayList<EquipaExterna> getEquipas_externas() {
        return equipas_externas;
    }

    /**
     * Define o custo base da competição externa
     *
     * @param custo_base o custo base da competição externa
     * @throws ExcecaoNumeroPositivo exceção do número positivo para o custo
     *                               base
     */
    public void setCusto_base(float custo_base) throws ExcecaoNumeroPositivo {
        if (custo_base <= 0) {
            throw new ExcecaoNumeroPositivo("O " + custo_base + " não é um valor positivo");
        }
        this.custo_base = custo_base;
    }

    /**
     * Define o nome do diretor da competição externa
     *
     * @param nome_diretor o nome do diretor da competição externa
     */
    public void setNome_diretor(String nome_diretor) {
        this.nome_diretor = nome_diretor;
    }

    /**
     * Define a lista das equipas externas da competição externa
     *
     * @param equipas_externas a lista das equipas externas da competição
     *                         externa
     */
    public void setEquipas_externas(ArrayList<EquipaExterna> equipas_externas) {
        this.equipas_externas = equipas_externas;
    }

    /**
     * Adiciona uma equipa interna a uma competição externa
     *
     * @param a equipa interna
     */
    public void adicionarEquipaInternaCompExterna(Equipa a) {
        setEquipaInterna(a);
    }

    /**
     * Adiciona uma equipa externa a uma competição externa
     *
     * @param ee equipa externa
     */
    public void adicionarEquipaExterna(EquipaExterna ee) {
        equipas_externas.add(ee);
    }

    /**
     * Devolve a descrição textual da competição externa
     *
     * @return a descrição textual da competição externa
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("\nCompeticao_externa{");
        sb.append("\ncusto_base=").append(custo_base);
        sb.append("\nnome_diretor=").append(nome_diretor);
        sb.append("\nData de Inicio =").append(getData_inicio());
        sb.append("\nData de Fim =").append(getData_fim());
        sb.append("\nequipas_externas=");
        if (equipas_externas.isEmpty()) {
            sb.append(" (vazio) ");
        } else {
            for (EquipaExterna ee : equipas_externas) {
                sb.append(ee + "\n");
            }
        }
        sb.append("\nequipaInterna=");
        if (equipaInterna == null) {
            sb.append(" (vazio) ");
            sb.append('}');

        } else {
            sb.append(equipaInterna);
        }
        return sb.toString();
    }

    /**
     * Determina se a competição externa é igual a outra competição externa
     *
     * @param obj a competição externa com a qual comparar
     * @return TRUE se as competições externas forem iguais, FALSE caso
     *         contrário
     */
    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        Competicao_externa other = (Competicao_externa) obj;
        return Float.compare(other.custo_base, custo_base) == 0 &&
                Objects.equals(nome_diretor, other.nome_diretor) &&
                Objects.equals(equipas_externas, other.equipas_externas) &&
                Objects.equals(equipaInterna, other.equipaInterna) &&
                super.equals(obj);
    }

    /**
     * Obter o custo da inscrição
     *
     * @param dataInferior a data inferior
     * @param dataSuperior a data superior
     * @return o custo base da inscrição
     */
    @Override
    public float obterCustoInscricao(Data dataInferior, Data dataSuperior) {
        Data a = new Data(dataInferior);
        Data b = new Data(dataSuperior);
        Data c = new Data(getData_fim());
        Data d = new Data(getData_inicio());

        if (a.isMaior(d) == false || a.equals(d)) {
            custo_base = (float) (custo_base * 1.20);
        } else if (b.isMaior(c) == true || b.equals(c)) {
            custo_base = (float) (custo_base * 1.20);
        }
        return custo_base;
    }

    /**
     * Cria uma nova equipa interna
     *
     * @param escalao    escalão da equipa interna
     * @param anoCivil   ano civíl da equipa interna
     * @param modalidade modalidade da equipa interna
     */
    public void adicionarEquipaInterna(String escalao, int anoCivil, Modalidade modalidade) {
        equipaInterna = new Equipa(escalao, anoCivil, modalidade);
    }

    /**
     * Cria uma nova equipa externa e adiciona no array equipas_externas
     *
     * @param nome_equipa   o nome da equipa da externa
     * @param escalao       o escalão da equipa externa
     * @param cidade_origem a cidade de origem da equipa externa
     * @param pais          o país da equipa externa
     * @param acomodacao    a acomodação da equipa externa
     */
    public void adicionarEquipaExterna(String nome_equipa, String escalao, String cidade_origem, String pais,
            boolean acomodacao) {
        EquipaExterna a = new EquipaExterna(nome_equipa, escalao, cidade_origem, pais, acomodacao);
        equipas_externas.add(a);
    }

}
