package com.mycompany.Projeto;

import java.util.Collections;
import java.util.List;
import javax.swing.JOptionPane;

/**
 * Classe de teste
 */
public class Main {

    public static void main(String[] args) throws ExcecaoNIF, ExcecaoAlfabetoEspaco, ExcecaoCC, ExcecaoNumeroPositivo {
        // Criar clube
        Clube c1 = null;
        try {
            c1 = new Clube("Clube X", "123456789", "Porto", new Data(2014, 5, 2), "931122334", "clubex@gmail.com",
                    "www.clubex.pt");
            inserirInicial(c1);
        } catch (ExcecaoNIF e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }

        // i. Listar todas as competições
        List<Competicao> lc = c1.getListaCompeticoes();
        System.out.println("1. Listar todas as competições\n" + lc);

        // ii. Listar só as competições internas
        List<Competicao_interna> lci = c1.obterCompeticoesInternas();
        System.out.println("2. Listar só as competições internas\n" + lci);

        // iii. Listar só as competições externas
        List<Competicao_externa> lce = c1.obterCompeticoesExternas();
        System.out.println("3. Listar só as competições externas\n" + lce);

        // iv. Listar todas as competições, mas ordenadas por ordem da data de início
        CompararDataInicio cv = new CompararDataInicio();
        Collections.sort(lc, cv);
        System.out.println("4. Listar todas as competições, mas ordenadas por ordem da data de início");
        for (Competicao c : lc) {
            System.out.println("> " + c.toString());
        }

        // v. Listar todas as equipas externas que pretendem alojamento
        List<EquipaExterna> lee = c1.obterEquipasQuePretendemAlojamento();
        System.out.println("5. Listar todas as equipas externas que pretendem alojamento\n" + lee);

        // vi. Listar o valor de todas as inscrições em competições externas
        System.out.println("\n6. Listar o valor de todas as inscrições em competições externas");
        float a = c1.calcularValorInscricoes();
        System.out.println("O valor de todas as inscrições em competições externas é: " + a);
    }

    private static void inserirInicial(Clube c1)
            throws ExcecaoAlfabetoEspaco, ExcecaoCC, ExcecaoNumeroPositivo, ExcecaoNIF {

        // I) Adicionar 2 modalidades ao clube
        c1.adicionarModalidade("futebol", 1990);
        c1.adicionarModalidade("futsal", 1995);

        // II) Adicionar 10 atletas ao clube
        try {
            c1.adicionarAtleta("Pedro Nunes", "11111111", "Porto", new Data(2000, 3, 1), "91234343234",
                    "pedronumes@gmail.com");
            c1.adicionarAtleta("Mário Alves", "22222221", "Maia", new Data(2000, 12, 5), "91666777888",
                    "marioalves@gmail.com");
            c1.adicionarAtleta("Miguel Oliveira", "33333331", "Gaia", new Data(1997, 2, 15), "91666777888",
                    "marioalves@gmail.com");
            c1.adicionarAtleta("Rui Silva", "44444441", "Porto", new Data(1997, 12, 5), "91666777888",
                    "marioalves@gmail.com");
            c1.adicionarAtleta("Tiago Silva", "55555551", "Gaia", new Data(2000, 10, 22), "91666777888",
                    "marioalves@gmail.com");
            c1.adicionarAtleta("José Pedro", "66666661", "Valongo", new Data(2000, 1, 16), "91666777888",
                    "marioalves@gmail.com");
            c1.adicionarAtleta("Gabriel Bastos", "77777771", "Matosinhos", new Data(1997, 6, 24), "91666777888",
                    "marioalves@gmail.com");
            c1.adicionarAtleta("Gustavo Mendes", "88888881", "Maia", new Data(2000, 8, 1), "91666777888",
                    "marioalves@gmail.com");
            c1.adicionarAtleta("Alexandre Santos", "99999991", "Porto", new Data(2002, 4, 25), "91666777888",
                    "marioalves@gmail.com");
            c1.adicionarAtleta("Gonçalo Barbosa", "12121211", "Matosinhos", new Data(2002, 9, 15), "91666777888",
                    "marioalves@gmail.com");
        } catch (ExcecaoAlfabetoEspaco | ExcecaoCC e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
        // Adicionar 2 equipas
        c1.adicionarEquipa("sub21", 2020, 0);
        c1.adicionarEquipa("sub23", 2021, 1);

        c1.adicionarJogadorEquipa(0, 0, 12, "defesa esquerdo");
        c1.adicionarJogadorEquipa(1, 1, 7, "atacante");
        c1.adicionarJogadorEquipa(0, 1, 24, "defesa esquerdo");
        c1.adicionarJogadorEquipa(1, 0, 14, "atacante");

        // Criar 6 equipa externa
        EquipaExterna ee1 = new EquipaExterna("Equipa 1", "sub21", "Porto", "Portugal", true);
        EquipaExterna ee2 = new EquipaExterna("Equipa 2", "sub23", "Gaia", "Portugal", false);
        EquipaExterna ee3 = new EquipaExterna("Equipa 3", "sub21", "Maia", "Portugal", true);
        EquipaExterna ee4 = new EquipaExterna("Equipa 4", "sub23", "Valongo", "Portugal", false);
        EquipaExterna ee5 = new EquipaExterna("Equipa 5", "sub21", "Matosinhos", "Portugal", true);
        EquipaExterna ee6 = new EquipaExterna("Equipa 6", "sub23", "Lisboa", "Portugal", false);

        // Adicionar 2 competições internas
        Competicao_interna ci1 = new Competicao_interna(1, "Competição i1", new Data(2022, 6, 16),
                new Data(2022, 6, 18), "Luís", Competicao.FORMATO_COMPETICAO_A_ELIMINAR);
        Competicao_interna ci2 = new Competicao_interna(2, "Competição i2", new Data(2022, 6, 20),
                new Data(2022, 6, 22), "Miguel", Competicao.FORMATO_COMPETICAO_MISTA);

        // Adicionar 2 competições externas
        Competicao_externa ce1 = null;
        Competicao_externa ce2 = null;

        try {
            ce1 = new Competicao_externa(200, "José", 3, "Competição 3", new Data(2022, 7, 1), new Data(2022, 7, 3),
                    "Maria", Competicao.FORMATO_COMPETICAO_POR_PONTOS);
            ce2 = new Competicao_externa(300, "Paula", 4, "Competição 4", new Data(2022, 7, 4), new Data(2022, 7, 6),
                    "Leonor", Competicao.FORMATO_COMPETICAO_MISTA);
        } catch (ExcecaoNumeroPositivo e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
        // Adicionar 4 competições à lista
        c1.adicionarCompeticao(ci1);
        c1.adicionarCompeticao(ci2);

        c1.adicionarCompeticao(ce1);
        c1.adicionarCompeticao(ce2);

        // Associar 6 equipas externas às competições externas
        c1.associarEquipaExterna(ce2, ee1);
        c1.associarEquipaExterna(ce2, ee2);
        c1.associarEquipaExterna(ce2, ee3);
        c1.associarEquipaExterna(ce1, ee4);
        c1.associarEquipaExterna(ce1, ee5);
        c1.associarEquipaExterna(ce1, ee6);

        // Associar 1 equipa interna a cada uma das competições externas
        c1.associarEquipaInternaCompeticaoExterna(ce2, 0);
        c1.associarEquipaInternaCompeticaoExterna(ce1, 1);

        // Associar 2 equipas internas a cada uma das competições internas
        c1.associarEquipaInternaCompeticaoInterna(ci2, 0);
        c1.associarEquipaInternaCompeticaoInterna(ci2, 1);
        c1.associarEquipaInternaCompeticaoInterna(ci1, 0);
        c1.associarEquipaInternaCompeticaoInterna(ci1, 1);

    }
}
