package com.mycompany.Projeto;

import java.util.ArrayList;
import java.util.Objects;

/**
 * Representa uma competição interna
 */
public class Competicao_interna extends Competicao {

    /**
     * O array das equipas internas
     */
    private ArrayList<Equipa> equipas_internas;

    /**
     * Constroi uma instância de competição interna
     */
    public Competicao_interna() {
        setEquipas_internas(new ArrayList<Equipa>());
    }

    /**
     * Constroi uma instância de competição interna , por cópia de outra
     * competição interna
     *
     * @param competicao
     */
    public Competicao_interna(Competicao competicao) {
        super(competicao);
        setEquipas_internas(new ArrayList<Equipa>());
    }

    /**
     * Constroi uma instância de competição interna recebendo o codigo,
     * data_inicio, nome_coordenador, formato
     *
     * @param codigo           código da competição
     * @param designacao       designação da competição
     * @param data_inicio      data de início da competição
     * @param data_fim         data de fim da competição
     * @param nome_coordenador nome do coordenador da competição
     * @param formato          formato da competição
     */
    public Competicao_interna(int codigo, String designacao, Data data_inicio, Data data_fim, String nome_coordenador,
            String formato) {
        super(codigo, designacao, data_inicio, data_fim, nome_coordenador, formato);
        setEquipas_internas(new ArrayList<Equipa>());
    }

    /**
     * Devolve o Array das equipas internas
     *
     * @return o array das equipas internas
     */
    public ArrayList<Equipa> getEquipas_internas() {
        return equipas_internas;
    }

    /**
     * Define o Array das equipas internas
     *
     * @param equipas_internas o array equipas internas
     */
    public void setEquipas_internas(ArrayList<Equipa> equipas_internas) {
        this.equipas_internas = equipas_internas;
    }

    /**
     * Adiciona uma equipa interna a uma competição interna
     *
     * @param a equipa interna
     */
    public void adicionarEquipaInternaCompInterna(Equipa a) {
        equipas_internas.add(a);
    }

    /**
     * Devolve a descrição textual da competição interna
     *
     * @return a descrição textual da competição interna
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("\nCompeticao_interna{");
        sb.append("\nData de Inicio =").append(getData_inicio());
        sb.append("\nData de Fim =").append(getData_fim());
        sb.append("\nequipas=");
        if (equipas_internas.isEmpty()) {
            sb.append(" (vazio) ");
        } else {
            for (Equipa ei : equipas_internas) {
                sb.append(ei + "\n");
            }
        }
        sb.append('}');
        return sb.toString();
    }

    /**
     * Determina se a competição interna é igual a outra competição interna
     *
     * @param obj a competição interna com a qual comparar
     * @return RUE se as competições internas forem iguais, FALSE caso contrário
     */
    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        Competicao_interna other = (Competicao_interna) obj;
        return Objects.equals(getEquipas_internas(), other.getEquipas_internas()) &&
                super.equals(other);
    }

}
