package com.mycompany.Projeto;

import java.util.Comparator;

/**
 * Compara a data de início da competição
 */
public class CompararDataInicio implements Comparator<Competicao> {
    public int compare(Competicao c1, Competicao c2) {
        if (c1.getData_inicio() == c2.getData_inicio())
            return 0;
        else if (!c1.getData_inicio().isMaior(c2.getData_inicio()))
            return -1;
        else
            return 1;
    }
}
