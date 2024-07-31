package com.mycompany.Projeto;

import java.util.ArrayList;
import java.util.List;

/**
 * Representa um clube
 */
public final class Clube {

    /**
     * A denominação do clube
     */
    private String denominacao;

    /**
     * O NIF do clube
     */
    private String nif;

    /**
     * O endereço do clube
     */
    private String endereco;

    /**
     * A data de constituição do clube
     */
    private Data dataConstituicao;

    /**
     * O contacto telefónico do clube
     */
    private String telefone;

    /**
     * O endereço eletrónico do clube
     */
    private String email;

    /**
     * A página Web do clube
     */
    private String paginaWeb;

    /**
     * Os atletas do clube
     */
    private ArrayList<Atleta> atletas;

    /**
     * As modalidades do clube
     */
    private ArrayList<Modalidade> modalidades;

    /**
     * As equipas do clube
     */
    private ArrayList<Equipa> equipas;

    /**
     * As competicoes do clube
     */
    private ArrayList<Competicao> listaCompeticoes;

    /**
     * A string por omissáo
     */
    private static final String STRING_POR_OMISSAO = "a preencher";

    /**
     * Constroi uma instância de clube por omissão
     */
    public Clube() throws ExcecaoNIF {
        setDenominacao(STRING_POR_OMISSAO);
        setNif(STRING_POR_OMISSAO);
        setEndereco(STRING_POR_OMISSAO);
        setDataConstituicao(new Data());
        setTelefone(STRING_POR_OMISSAO);
        setEmail(STRING_POR_OMISSAO);
        setPaginaWeb(STRING_POR_OMISSAO);
        setModalidades(new ArrayList<>());
        setEquipas(new ArrayList<>());
        setAtletas(new ArrayList<>());

    }

    /**
     * Constrói uma instância de clube, recebendo designação, nif, endereço,
     * dataConstituição, telefone, email e pággina web. Os ArrayList de
     * modalidades, equipas e atletas são criados vazios.
     *
     * @param designacao       A designação do clube
     * @param nif              O NIF do clube
     * @param endereco         O endereço do clube
     * @param dataConstituicao A data de constituição do clube
     * @param telefone         O contacto telefónico do clube
     * @param email            O email do clube
     * @param paginaWeb        A página web do clube
     */
    public Clube(String designacao, String nif, String endereco, Data dataConstituicao, String telefone, String email,
            String paginaWeb) throws ExcecaoNIF {
        setDenominacao(designacao);
        setNif(nif);
        setEndereco(endereco);
        setDataConstituicao(dataConstituicao);
        setTelefone(telefone);
        setEmail(email);
        setPaginaWeb(paginaWeb);
        setModalidades(new ArrayList<Modalidade>());
        setEquipas(new ArrayList<Equipa>());
        setAtletas(new ArrayList<Atleta>());
        setListaCompeticoes(new ArrayList<Competicao>());

    }

    /**
     * Constrói uma instância de clube, recebendo designação, nif, endereço,
     * dataConstituição, telefone, email e página web, e listas de modalidades,
     * equipas e atletas.
     *
     * @param designacao       A designação do clube
     * @param nif              O NIF do clube
     * @param endereco         O endereço do clube
     * @param dataConstituicao A data de constituição do clube
     * @param telefone         O contacto telefónico do clube
     * @param email            O email do clube
     * @param paginaWeb        A página web do clube
     * @param modalidades      A lista de modalidades do clube
     * @param equipas          A lista de equipas do clube
     * @param atletas          A lista de atletas do clube
     */
    public Clube(String designacao, String nif, String endereco, Data dataConstituicao, String telefone, String email,
            String paginaWeb, ArrayList<Modalidade> modalidades, ArrayList<Equipa> equipas, ArrayList<Atleta> atletas,
            ArrayList<Competicao> listaCompeticoes) throws ExcecaoNIF {
        setDenominacao(designacao);
        setNif(nif);
        setEndereco(endereco);
        setDataConstituicao(dataConstituicao);
        setTelefone(telefone);
        setEmail(email);
        setPaginaWeb(paginaWeb);
        setModalidades(modalidades);
        setEquipas(equipas);
        setAtletas(atletas);
        setListaCompeticoes(listaCompeticoes);
    }

    /**
     * Constrói uma instância de clube, por cópia de outro clube
     *
     * @param clube O clube a copiar
     */
    public Clube(Clube clube) throws ExcecaoNIF {
        setDenominacao(clube.denominacao);
        setNif(clube.nif);
        setEndereco(clube.endereco);
        setDataConstituicao(clube.dataConstituicao);
        setTelefone(clube.telefone);
        setEmail(clube.email);
        setPaginaWeb(clube.paginaWeb);
        setModalidades(clube.modalidades);
        setEquipas(clube.equipas);
        setAtletas(clube.atletas);
        setListaCompeticoes(clube.listaCompeticoes);
    }

    /**
     * Define a designação do clube
     *
     * @param designacao A designação do clube
     */
    public void setDenominacao(String designacao) {
        this.denominacao = designacao;
    }

    /**
     * Define o nif do clube
     *
     * @param nif O NIF do clibe
     */
    public void setNif(String nif) throws ExcecaoNIF {
        char c;
        for (int i = 0; i < nif.length(); i++) {
            c = nif.charAt(i);
            if (Character.isDigit(c) == false) {
                throw new ExcecaoNIF("O " + nif + " tem caracteres que não são dígitos ");
            }
            if (nif.length() != 9) {
                throw new ExcecaoNIF("O " + nif + "não tem 9 números");
            }
        }
        this.nif = nif;
    }

    /**
     * Define o endereço do clube
     *
     * @param endereco O endereço do clube
     */
    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    /**
     * Define a data de constituição do clube
     *
     * @param dataConstituicao A data de constituição do clube
     */
    public void setDataConstituicao(Data dataConstituicao) {
        this.dataConstituicao = new Data(dataConstituicao);
    }

    /**
     * Define o contacto telefónico do clube
     *
     * @param telefone O contacto telefónico do clube
     */
    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    /**
     * Define o contacto eletrónico do clube
     *
     * @param email O contacto eletrónico do clube
     */
    public void setEmail(String email) {
        this.email = email;
    }

    /**
     * Define a página web do clube
     *
     * @param paginaWeb A página web do clube
     */
    public void setPaginaWeb(String paginaWeb) {
        this.paginaWeb = paginaWeb;
    }

    /**
     * Define a lista de modalidades do clube
     *
     * @param modalidades A lista de modalidades do clube
     */
    public void setModalidades(ArrayList<Modalidade> modalidades) {
        this.modalidades = new ArrayList<>(modalidades);
    }

    /**
     * Define a lista de equipas do clube
     *
     * @param equipas A lista de equipas do clube
     */
    public void setEquipas(ArrayList<Equipa> equipas) {
        this.equipas = new ArrayList<>(equipas);
    }

    /**
     * Define a lista de atletas do clube
     *
     * @param atletas A lista de atletas do clube
     */
    public void setAtletas(ArrayList<Atleta> atletas) {
        this.atletas = new ArrayList<>(atletas);
    }

    /**
     * Devolve a denominação do clube
     *
     * @return A denominação do clube
     */
    public String getDenominacao() {
        return denominacao;
    }

    /**
     * Devolve o NIF do clube
     *
     * @return O NIF do clube
     */
    public String getNif() {
        return nif;
    }

    /**
     * Devolve o endereço do clube
     *
     * @return O endereço do clube
     */
    public String getEndereco() {
        return endereco;
    }

    /**
     * Devolve a data de constituição do clube
     *
     * @return A data de constituição do clube
     */
    public Data getDataConstituicao() {
        return dataConstituicao;
    }

    /**
     * Devolve o contacto telefónico do clube
     *
     * @return O contacto telefónico do clube
     */
    public String getTelefone() {
        return telefone;
    }

    /**
     * Devolve o email do clube
     *
     * @return O email do clube
     */
    public String getEmail() {
        return email;
    }

    /**
     * Devolve a página web do clube
     *
     * @return A página web do clube
     */
    public String getPaginaWeb() {
        return paginaWeb;
    }

    /**
     * Devolve a lista de atletas do clube
     *
     * @return A lista de atletas do clube
     */
    public ArrayList<Atleta> getAtletas() {
        return new ArrayList<>(atletas);
    }

    /**
     * Devolve a lista de modalidades do clube
     *
     * @return A lista de modalidades do clube
     */
    public ArrayList<Modalidade> getModalidades() {
        return new ArrayList<>(modalidades);
    }

    /**
     * Devolve a lista de equipas do clube
     *
     * @return A lista de equipas do clube
     */
    public ArrayList<Equipa> getEquipas() {
        return new ArrayList<>(equipas);
    }

    public ArrayList<Competicao> getListaCompeticoes() {
        return new ArrayList<>(listaCompeticoes);
    }

    public void setListaCompeticoes(ArrayList<Competicao> listaCompeticoes) {
        this.listaCompeticoes = new ArrayList<>(listaCompeticoes);
    }

    /**
     * Devolve a descrição textual do clube
     *
     * @return A descrição textual do clube
     */
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("\nDesignação -> ");
        sb.append(denominacao);
        sb.append("\nNIF: ");
        sb.append(nif);
        sb.append("\nEndereço: ");
        sb.append(endereco);
        sb.append("\nData de constituição -> ");
        sb.append(dataConstituicao);
        sb.append("\nTelefone -> ");
        sb.append(telefone);
        sb.append("\nEmail -> ");
        sb.append(email);
        sb.append("\nModalidades:");
        if (modalidades.isEmpty()) {
            sb.append(" (vazio) ");
        } else {
            for (Modalidade m : modalidades) {
                sb.append(m);
            }
        }
        sb.append("\nEquipas:");
        if (equipas.isEmpty()) {
            sb.append(" (vazio) ");
        } else {
            for (Equipa e : equipas) {
                sb.append(e);
            }
        }
        sb.append("\nAtletas:");
        if (atletas.isEmpty()) {
            sb.append(" (vazio) ");
        } else {
            for (Atleta a : atletas) {
                sb.append(a);
            }
        }
        return sb.toString();
    }

    /**
     * Determina se o clube é igual a outro clube
     *
     * @param outroObjeto O clube com o qual comparar
     *
     * @return TRUE se os clubes forem iguais, FALSE caso contrário
     */
    @Override
    public boolean equals(Object outroObjeto) {
        if (this == outroObjeto) {
            return true;
        }
        if (outroObjeto == null || this.getClass() != outroObjeto.getClass()) {
            return false;
        }
        Clube obj = (Clube) outroObjeto;
        return this.denominacao.equalsIgnoreCase(obj.denominacao)
                && this.nif.equalsIgnoreCase(obj.nif)
                && this.endereco.equalsIgnoreCase(obj.endereco)
                && this.dataConstituicao.equals(obj.dataConstituicao)
                && this.telefone.equalsIgnoreCase(obj.telefone)
                && this.modalidades == obj.modalidades
                && this.equipas == obj.equipas
                && this.atletas == obj.atletas;
    }

    /**
     * Adiciona um atleta à lista de atletas do clube. O atleta é criado a
     * partir dos dados reebidos: nome, nº de cartão de cidadão, endereço, data
     * de nascimento, contacto telefónico e email
     *
     * @param nome           O nome do atleta a adicionar à lista de atletas do
     *                       clube
     * @param cc             O número de cartão de cidadão do atleta a adicionar à
     *                       lista de
     *                       atletas do clube
     * @param endereco       O endereço do atleta a adicionar à lista de atletas do
     *                       clube
     * @param dataNascimento A data de nascimento do atleta a adicionar à lista
     *                       de atletas do clube
     * @param telefone       O contacto telefónico do atleta a adicionar à lista de
     *                       atletas do clube
     * @param email          O email do atleta a adicionar à lista de atletas do
     *                       clube
     */
    public void adicionarAtleta(String nome, String cc, String endereco, Data dataNascimento, String telefone,
            String email) throws ExcecaoAlfabetoEspaco, ExcecaoCC {
        atletas.add(new Atleta(nome, cc, endereco, dataNascimento, telefone, email));
    }

    /**
     * Adiciona uma modalidade à lista de modalidades do clube. A modalidade é
     * criada a partir dos dados recebidos: nome e ano de ativação
     *
     * @param nome        O nome da modalidade
     * @param anoAtivacao O ano de ativação da modalidade
     */
    public void adicionarModalidade(String nome, int anoAtivacao) {
        modalidades.add(new Modalidade(nome, anoAtivacao));
    }

    /**
     * Adiciona uma equipa à lista de equipas do clube. A equipa é criada a
     * partir dos dados recebidos: escalão, ano civil e número da modalidade
     *
     * @param escalao  O escaláo da equipa
     * @param anoCivil O ano civil em que a equipa foi constituída
     * @param num      O índice da modalidade da equipa
     */
    public void adicionarEquipa(String escalao, int anoCivil, int num) {
        Modalidade modalidade = modalidades.get(num);
        Equipa equipa = new Equipa(escalao, anoCivil, modalidade);
        equipas.add(equipa);
    }

    /**
     * Adiciona um jogador a uma equipa. A equipa e jogador são determinados a
     * partir do seu índice. O número de camisola e posição do jogador são
     * recebidos por parâmetros neste método.
     *
     * @param numEquipa      O índice da equipa na lista de equipas
     * @param numAtleta      O índice do atleta na lista de atletas
     * @param numeroCamisola O número de camisola do atleta na equipa
     * @param posicaoJogador A posição do jogador na equipa
     */
    public void adicionarJogadorEquipa(int numEquipa, int numAtleta, int numeroCamisola, String posicaoJogador) {
        Equipa equipa = equipas.get(numEquipa);
        if (equipa != null) {
            Atleta a = atletas.get(numAtleta);
            if (a != null) {
                equipa.adicionarJogador(numeroCamisola, posicaoJogador, a);
            }
        }
    }

    /**
     * Adiciona um prémio individual a um jogador
     *
     * @param numEquipa   O índice da equipa na lista de equipas
     * @param numCamisola O número de camisola do jogado na equipa
     * @param premio      O prémio atribuído ao jogador
     * @param anoCivil    O ano civil em que foi atribuído o prémio ao jogador
     */
    public void adicionarPremioIndividual(int numEquipa, int numCamisola, String premio, int anoCivil) {
        Equipa equipa = equipas.get(numEquipa);
        if (equipa != null) {
            Jogador j = equipa.obterJogador(numCamisola);
            if (j != null) {
                j.adicionarPremioIndividual(premio, anoCivil);
            }
        }
    }

    /**
     * Devolve os jogadores de uma determinada equipa
     *
     * @param numEquipa O índice da equipa na lista de equipas
     *
     * @return A lista de jogadores da equipa
     */
    public ArrayList<Jogador> obterJogadoresEquipa(int numEquipa) {
        Equipa equipa = equipas.get(numEquipa);
        if (equipa != null) {
            ArrayList<Jogador> jogadores = equipa.getJogadores();
            return jogadores;
        }
        return null;
    }

    /**
     * Elimina um jogador de uma equipa
     *
     * @param numEquipa   O índice da equipa na lista de equipas
     *
     * @param numCamisola O número da camisola do jogador a eliminar
     */
    public void eliminarJogadorEquipa(int numEquipa, int numCamisola) {
        Equipa equipa = equipas.get(numEquipa);
        if (equipa != null) {
            equipa.eliminarJogador(numCamisola);
        }
    }

    /**
     * Determina a quantidade total de prémios individuais dos jogadores que
     * praticam uma dada modalidade
     *
     * @param numModalidade O índice da modalidade na lista das modalidades
     *
     * @return O número total de prémios individuais dos jogadores da modalidade
     */
    public int calcularTotalPremiosIndividuais(int numModalidade) {
        int totalPremios = 0;
        Modalidade modalidade = modalidades.get(numModalidade);
        if (modalidade != null) {
            for (Equipa e : equipas) {
                if (e.isModalidade(modalidade)) {
                    totalPremios += e.totalPremiosIndividuaisEquipa();
                }
            }
        }
        return totalPremios;
    }

    /**
     * Determina a quantidade de vezes que um dado atleta foi inscrito em
     * equipas, independentemente da modalidade
     *
     * @param numAtleta O índice do atleta na lista de atletas
     *
     * @return O número total de inscrições do atleta em equipas
     */
    public int calcularTotalInscricoesAtleta(int numAtleta) {
        int totalInscricoes = 0;
        Atleta atleta = atletas.get(numAtleta);
        if (atleta != null) {
            for (Equipa e : equipas) {
                if (e.containsJogador(atleta)) {
                    totalInscricoes++;
                }
            }
        }
        return totalInscricoes;
    }

    /**
     * Devolve o nome de uma modalidade
     *
     * @param numModalidade O índice da modalidade na lista das modalidades
     *
     * @return O nome da modalidade
     */
    public String obterNomeModalidade(int numModalidade) {
        Modalidade modalidade = modalidades.get(numModalidade);
        if (modalidade != null) {
            return modalidade.getNome();
        }
        return null;
    }

    /**
     * Adiciona uma competição externa e interna
     *
     * @param c competição
     */
    public void adicionarCompeticao(Competicao c) {
        listaCompeticoes.add(c);
    }

    /**
     * Associa uma equipa interna a uma competição interna
     *
     * @param c         competição
     * @param numEquipa número da equipa
     */

    public void associarEquipaInternaCompeticaoInterna(Competicao_interna c, int numEquipa) {
        Equipa a = (Equipa) equipas.get(numEquipa);
        if (a != null) {
            c.adicionarEquipaInternaCompInterna(a);
        }
    }

    /**
     * Associa uma equipa interna a uma competição externa
     *
     * @param c         competição
     * @param numEquipa número da equipa
     */
    public void associarEquipaInternaCompeticaoExterna(Competicao_externa c, int numEquipa) {
        Equipa a = (Equipa) equipas.get(numEquipa);
        if (a != null) {
            c.adicionarEquipaInternaCompExterna(a);
        }
    }

    /**
     * Adiciona uma equipa externa a uma competição externa
     *
     * @param c  competição
     * @param ee equipa externa
     */

    public void associarEquipaExterna(Competicao_externa c, EquipaExterna ee) {
        c.adicionarEquipaExterna(ee);
    }

    /**
     * Elimina uma competição
     *
     * @param codComp
     */

    public void eliminarCompeticao(int codComp) {
        Competicao c = listaCompeticoes.get(codComp);
        if (c != null) {
            listaCompeticoes.remove(c);
        }
    }

    /**
     * Altera a data de início e/ou fim de uma competição
     *
     * @param codComp    código competição
     * @param dataInicio data início
     * @param dataFim    data fim
     */

    public void alterarDataInicioFim(int codComp, Data dataInicio, Data dataFim) {
        Competicao c = listaCompeticoes.get(codComp);
        c.setData_fim(dataFim);
        c.setData_inicio(dataInicio);
    }

    /**
     * Calcula e devolve o valor de todas as inscrições das competições externas
     *
     * @return valor total de inscrições
     */
    public float calcularValorInscricoes() {
        float valorTotalInscricoes = 0;
        for (Competicao c : listaCompeticoes) {
            if (c instanceof Competicao_externa) {
                valorTotalInscricoes = valorTotalInscricoes + ((Competicao_externa) c).getCusto_base();
            }
        }
        return valorTotalInscricoes;
    }

    /**
     * Procura e devolve as competições internas dentro do array lista
     * competições
     *
     * @return lista de competição interna
     */
    public List<Competicao_interna> obterCompeticoesInternas() {
        List<Competicao_interna> lci = new ArrayList<>();
        for (Competicao c : listaCompeticoes) {
            if (c instanceof Competicao_interna) {
                Competicao_interna ci = (Competicao_interna) c;
                lci.add(ci);
            }
        }
        return lci;
    }

    /**
     * Procura e devolve as competições externas dentro do array lista
     * competições
     *
     * @return lista de competição externa
     */
    public List<Competicao_externa> obterCompeticoesExternas() {
        List<Competicao_externa> lce = new ArrayList<>();
        for (Competicao c : listaCompeticoes) {
            if (c instanceof Competicao_externa) {
                Competicao_externa ce = (Competicao_externa) c;
                lce.add(ce);
            }
        }
        return lce;
    }

    /**
     * Procura e devolve as equipas que pretendem alojamento
     *
     * @return lista da equipa externa
     */
    public List<EquipaExterna> obterEquipasQuePretendemAlojamento() {
        List<EquipaExterna> lee1 = new ArrayList<>();
        List<EquipaExterna> lee2 = new ArrayList<>();
        for (Competicao c : listaCompeticoes) {
            if (c instanceof Competicao_externa) {
                Competicao_externa ce = (Competicao_externa) c;
                lee1 = ce.getEquipas_externas();
            }
            for (EquipaExterna ee : lee1) {
                IAlojar ia = (IAlojar) ee;
                if (ia.validarAlojamento() == true) {
                    lee2.add(ee);
                }
            }
        }
        return lee2;
    }

}
