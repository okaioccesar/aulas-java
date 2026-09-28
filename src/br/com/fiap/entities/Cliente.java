package br.com.fiap.entities;

public class Cliente {

<<<<<<< HEAD
    // visibilidade, tipo de dados e atributos
    private String nome;
    private String rg;
    private int idade;
    private double altura;

   // metodos getters e setters - botão direito -> generate -> getters and setters
    public String getNome() {
=======
    // visibilidade, tipo de dados e atributo
    private String nome;
    private String cpf;
    private int idade;
    private double altura;
    private Endereco endereco; //atributo de referência

    // metodos setters (entradas) e metodos getters (retornar / exibir)

    public String getNome() {

>>>>>>> 9cfe21282bd6bfc2fa0f1086e62eec737873bf08
        return nome;
    }

    public void setNome(String nome) {
<<<<<<< HEAD
        this.nome = nome;
    }

    public String getRg() {
        return rg;
    }

    public void setRg(String rg) {
        this.rg = rg;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public double getAltura() {
=======

        this.nome = nome;
    }

    public double getAltura() {

>>>>>>> 9cfe21282bd6bfc2fa0f1086e62eec737873bf08
        return altura;
    }

    public void setAltura(double altura) {
<<<<<<< HEAD
        this.altura = altura;
    }

    @Override
    public String toString() {
        return "Cliente" +
                "\nnome='" + nome + '\'' +
                "\nrg='" + rg + '\'' +
                "\nidade=" + idade +
                "\naltura=" + altura;
=======

        this.altura = altura;
    }

    public int getIdade() {

        return idade;
    }

    public void setIdade(int idade) {

        this.idade = idade;
    }

    public String getCpf() {

        return cpf;
    }

    public void setCpf(String cpf) {

        this.cpf = cpf;
>>>>>>> 9cfe21282bd6bfc2fa0f1086e62eec737873bf08
    }
}
