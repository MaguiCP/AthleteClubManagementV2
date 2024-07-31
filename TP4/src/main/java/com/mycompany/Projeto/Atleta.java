package com.mycompany.Projeto;

/**
 * Representa um atleta
 */
public class Atleta {

    /**
     * O nome do atleta
     */
    private String nome;

    /**
     * O número de cartão de cidadão do atleta
     */
    private String cc;

    /**
     * O endereço do atleta
     */
    private String endereco;

    /**
     * A data de nascimento do atleta
     */
    private Data dataNascimento;

    /**
     * O contacto telefónico do atleta
     */
    private String telefone;

    /**
     * O email do atleta
     */
    private String email;

    /**
     * A String por omissão
     */
    private static final String STRING_POR_OMISSAO = "a preencher";

    /**
     * Constrói uma instância de atleta por omissão
     */
    public Atleta() throws ExcecaoAlfabetoEspaco, ExcecaoCC {
        setNome(STRING_POR_OMISSAO);
        setCc(STRING_POR_OMISSAO);
        setEndereco(STRING_POR_OMISSAO);
        setDataNascimento(new Data());
        setTelefone(STRING_POR_OMISSAO);
        setEmail(STRING_POR_OMISSAO);
    }

    /**
     * Constrói uma instância de atleta a partir do nome, número do cartão de
     * cidadão, endereço, data de nascimento, contacto telefónico e email
     *
     * @param nome           O nome do atleta
     * @param cc             O número de cartão de cidadão do atleta
     * @param endereco       O endereço do atleta
     * @param dataNascimento A data de nascimento do atleta
     * @param telefone       O contacto telefónico do atleta
     * @param email          O email do atleta
     */
    public Atleta(String nome, String cc, String endereco, Data dataNascimento, String telefone, String email)
            throws ExcecaoAlfabetoEspaco, ExcecaoCC {
        setNome(nome);
        setCc(cc);
        setEndereco(endereco);
        setDataNascimento(dataNascimento);
        setTelefone(telefone);
        setEmail(email);
    }

    /**
     * Constrói uma instância de atleta por cópia de outro atleta
     *
     * @param atleta O atleta a copiar
     */
    public Atleta(Atleta atleta) throws ExcecaoAlfabetoEspaco, ExcecaoCC {
        setNome(atleta.nome);
        setCc(atleta.cc);
        setEndereco(atleta.endereco);
        setDataNascimento(atleta.dataNascimento);
        setTelefone(atleta.telefone);
        setEmail(atleta.email);
    }

    /**
     * Devolve o nome do atleta
     *
     * @return O nome do atleta
     */
    public String getNome() {
        return nome;
    }

    /**
     * Devolve o número de cartão de cidadão do atleta
     *
     * @return O número de cartão de cidadão do atleta
     */
    public String getCc() {
        return cc;
    }

    /**
     * Devolve o endereo do atleta
     *
     * @return O endereo do atleta
     */
    public String getEndereco() {
        return endereco;
    }

    /**
     * Devolve a data de nascimento do atleta
     *
     * @return A data de nascimento do atleta
     */
    public Data getDataNascimento() {
        return dataNascimento;
    }

    /**
     * Devolve o contacto telefónico do atleta
     *
     * @return O contacto telefónico do atleta
     */
    public String getTelefone() {
        return telefone;
    }

    /**
     * Devolve o email do atleta
     *
     * @return O email do atleta
     */
    public String getEmail() {
        return email;
    }

    /**
     * Define o nome do atleta
     *
     * @param nome O nome do atleta
     */
    public void setNome(String nome) throws ExcecaoAlfabetoEspaco {
        char c;
        for (int i = 0; i < nome.length(); i++) {
            c = nome.charAt(i);
            if (Character.isLetter(c) == false && Character.isSpaceChar(c) == false) {
                throw new ExcecaoAlfabetoEspaco("O " + nome + " tem caracteres que não são letras");
            }
        }
        this.nome = nome;
    }

    /**
     * Define o número de cartão de cidadão do atleta
     *
     * @param cc O número de cartão de cidadão do atleta
     */
    public void setCc(String cc) throws ExcecaoCC {
        char c;
        for (int i = 0; i < cc.length(); i++) {
            c = cc.charAt(i);
            if (Character.isDigit(c) == false) {
                throw new ExcecaoCC("O " + cc + " tem caracteres que não são dígitos ");
            }
            if (cc.length() != 8) {
                throw new ExcecaoCC("O " + cc + "não tem 8 números");
            }
        }
        this.cc = cc;
    }

    /**
     * Define o endereço do atleta
     *
     * @param endereco O endereço do atleta
     */
    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    /**
     * Define a data de nascimento do atleta
     *
     * @param dataNascimento A data de nascimento do atleta
     */
    public void setDataNascimento(Data dataNascimento) {
        this.dataNascimento = new Data(dataNascimento);
    }

    /**
     * Define o contacto telefónico do atleta
     *
     * @param telefone O contacto telefónico do atleta
     */
    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    /**
     * Define o email do atleta
     *
     * @param email O email do atleta
     */
    public void setEmail(String email) {
        this.email = email;
    }

    /**
     * Devolve a descrição textual de Atleta
     *
     * @return A descrição textual de Atleta
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("\n\t\t\tNome -> ");
        sb.append(nome);
        sb.append("\n\t\t\tCC: ");
        sb.append(cc);
        sb.append("\n\t\t\tEndereço: ");
        sb.append(endereco);
        sb.append("\n\t\t\tData de nascimento -> ");
        sb.append(dataNascimento);
        sb.append("\n\t\t\tTelefone -> ");
        sb.append(telefone);
        sb.append("\n\t\t\tEmail -> ");
        sb.append(email);
        sb.append("\n\t\t\t.................. ");
        return sb.toString();
    }

    /**
     * Determina se o atleta é igual a outro atleta
     *
     * @param outroObjeto O atleta com o qual comparar
     *
     * @return TRUE se os atletas forem iguais, FALSE caso contrário
     */
    @Override
    public boolean equals(Object outroObjeto) {
        if (this == outroObjeto) {
            return true;
        }
        if (outroObjeto == null || this.getClass() != outroObjeto.getClass()) {
            return false;
        }
        Atleta obj = (Atleta) outroObjeto;
        return this.nome.equalsIgnoreCase(obj.nome)
                && this.cc.equalsIgnoreCase(obj.cc)
                && this.endereco.equalsIgnoreCase(obj.endereco)
                && this.dataNascimento.equals(obj.dataNascimento)
                && this.telefone.equalsIgnoreCase(obj.telefone)
                && this.email.equalsIgnoreCase(obj.email);
    }

}
