package br.com.fiap.entities;

public class Endereco {

<<<<<<< HEAD
    //visibilidade, tipo de dados e atributo
=======
      //visivlidade, tipo de dados e atributos
>>>>>>> 9cfe21282bd6bfc2fa0f1086e62eec737873bf08
    private String logradouro;
    private int numero;
    private String complemento;
    private String cep;
    private String bairro;
    private String cidade;
    private String estado;

<<<<<<< HEAD

    // metodos getters e setters - botão direito -> generate -> getters and setters
=======
    // metodos setters (entradas) e getters (saidas)


>>>>>>> 9cfe21282bd6bfc2fa0f1086e62eec737873bf08
    public String getLogradouro() {
        return logradouro;
    }

    public void setLogradouro(String logradouro) {
        this.logradouro = logradouro;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getComplemento() {
        return complemento;
    }

    public void setComplemento(String complemento) {
        this.complemento = complemento;
    }

    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }

    public String getBairro() {
        return bairro;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }
<<<<<<< HEAD

    @Override
    public String toString() {
        return "Endereço" +
                "\nlogradouro='" + logradouro + '\'' +
                "\nnumero=" + numero +
                "\ncomplemento='" + complemento + '\'' +
                "\ncep='" + cep + '\'' +
                "\nbairro='" + bairro + '\'' +
                "\ncidade='" + cidade + '\'' +
                "\nestado='" + estado + '\'';
    }
=======
>>>>>>> 9cfe21282bd6bfc2fa0f1086e62eec737873bf08
}
