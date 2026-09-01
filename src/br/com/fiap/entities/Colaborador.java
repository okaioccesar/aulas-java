package br.com.fiap.entities;

public class Colaborador {

    // visibilidade, tipo de dados e atributos
    private int numeroRegistro;
    private String nome;
    private String cargo;
    private double salario;

    // metodos setters (entrada) e metodos getters (retornar / exibir)


    public int getNumeroRegistro() {
        return numeroRegistro;
    }

    public void setNumeroRegistro(int numeroRegistro) {
        this.numeroRegistro = numeroRegistro;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }
}
