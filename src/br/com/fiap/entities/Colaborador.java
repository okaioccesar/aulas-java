package br.com.fiap.entities;

public class Colaborador {

<<<<<<< HEAD
    //visibilidade, tipo de dados e atributo

    private int numeroRegistro;
    private String nome;
    private String setor;
    private double salario;
    private Endereco endereco; // atributo de referencia


    // metodos getters e setters - botão direito -> generate -> getters and setters
    public int getNumeroRegistro() {
=======
    // visibilidade, tipo de dados e atributos
    private int numeroRegistro;
    private String nome;
    private String cargo;
    private double salario;

    // metodos setters (entrada) e metodos getters (retornar / exibir)


    public int getNumeroRegistro() {

>>>>>>> 9cfe21282bd6bfc2fa0f1086e62eec737873bf08
        return numeroRegistro;
    }

    public void setNumeroRegistro(int numeroRegistro) {
<<<<<<< HEAD
=======

>>>>>>> 9cfe21282bd6bfc2fa0f1086e62eec737873bf08
        this.numeroRegistro = numeroRegistro;
    }

    public String getNome() {
<<<<<<< HEAD
=======

>>>>>>> 9cfe21282bd6bfc2fa0f1086e62eec737873bf08
        return nome;
    }

    public void setNome(String nome) {
<<<<<<< HEAD
        this.nome = nome;
    }

    public String getSetor() {
        return setor;
    }

    public void setSetor(String setor) {
        this.setor = setor;
    }

    public double getSalario() {
=======

        this.nome = nome;
    }

    public String getCargo() {

        return cargo;
    }

    public void setCargo(String cargo) {

        this.cargo = cargo;
    }

    public double getSalario() {

>>>>>>> 9cfe21282bd6bfc2fa0f1086e62eec737873bf08
        return salario;
    }

    public void setSalario(double salario) {
<<<<<<< HEAD
        this.salario = salario;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }

    @Override
    public String toString() {
        return "Colaborador" +
                "\nNumero de Registro=" + numeroRegistro +
                "\nnome='" + nome + '\'' +
                "\nsetor='" + setor + '\'' +
                "\nsalario=" + salario + endereco;
    }
=======

        this.salario = salario;
    }
>>>>>>> 9cfe21282bd6bfc2fa0f1086e62eec737873bf08
}
