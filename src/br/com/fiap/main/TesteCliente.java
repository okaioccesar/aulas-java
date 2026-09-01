package br.com.fiap.main;

import br.com.fiap.entities.Cliente;

public class TesteCliente {

    public static void main(String[] args) {

    // Instanciar objeto
        Cliente  objCliente = new Cliente ();

    // Entradas
        objCliente.setNome("Cesar");
        objCliente.setCpf("123.456.789-01");
        objCliente.setIdade(22);
        objCliente.setAltura(1.80);

    // Saídas
        System.out.println(objCliente.getNome());
        System.out.println(objCliente.getCpf());
        System.out.println(objCliente.getIdade());
        System.out.println(objCliente.getAltura());

    }
}
