package br.com.fiap.main;

import br.com.fiap.entities.Colaborador;

public class TesteColaborador {

    public static void main(String[] args) {

        // Instanciar objeto

        Colaborador objColaborador = new Colaborador ();

        // Entradas
        objColaborador.setNumeroRegistro(17);
        objColaborador.setNome("Cesar");
        objColaborador.setCargo("Desenvolvedor");
        objColaborador.setSalario(15.000);

        // Saídas
        System.out.println(objColaborador.getNumeroRegistro());
        System.out.println(objColaborador.getNome());
        System.out.println(objColaborador.getCargo());
        System.out.println(objColaborador.getSalario());
    }

}

//projeto livro codigo, editora, titulo, valor