package br.com.fiap.main;

import br.com.fiap.entities.Cliente;
import br.com.fiap.entities.Endereco;
import br.com.fiap.entities.Colaborador;

public class TesteSistema {

    public static void main(String[] args) {

        // Instanciar objetos
        Cliente objCliente = new Cliente();
        Endereco objEndereco = new Endereco();
        Colaborador objColaborador = new Colaborador();

        // Entradas do cliente
        objCliente.setNome("Cesar");
        objCliente.setCpf("123.456.789-01");
        objCliente.setIdade(22);
        objCliente.setAltura(1.80);

        // Entradas do Endereço do Cliente
        objEndereco.setLogradouro("Travessa Passagem Tucuruvi");
        objEndereco.setNumero(32);
        objEndereco.setComplemento("Casa");
        objEndereco.setCep("09950-771");
        objEndereco.setBairro("Piraporinha");
        objEndereco.setCidade("Diadema");
        objEndereco.setEstado("São Paulo");

        // Entradas do Colaborador
        objColaborador.setNumeroRegistro(17);
        objColaborador.setNome("Cesar");
        objColaborador.setCargo("Desenvolvedor");
        objColaborador.setSalario(15.000);

        // Saídas do Cliente
        System.out.println("\nNome do Cliente: " + objCliente.getNome());
        System.out.println("CPF do Cliente: " + objCliente.getCpf());
        System.out.println("Idade do Cliente: " + objCliente.getIdade());
        System.out.println("Altura do Cliente: " + objCliente.getAltura());

        // Saídas Endereço do Cliente
        System.out.println("\nLogradouro do Cliente: " + objEndereco.getLogradouro());
        System.out.println("Numero: " + objEndereco.getNumero());
        System.out.println("Complemento: " + objEndereco.getComplemento());
        System.out.println("CEP: " + objEndereco.getCep());
        System.out.println("Bairro: " + objEndereco.getBairro());
        System.out.println("Cidade: " + objEndereco.getCidade());
        System.out.println("Estado: " + objEndereco.getEstado());

        // Saídas do Colaborador
        System.out.println("\nN° Registro do Colaborador: " + objColaborador.getNumeroRegistro());
        System.out.println("Nome do Colaborador(a): " + objColaborador.getNome());
        System.out.println("Cargo: " + objColaborador.getCargo());
        System.out.println("Salário: " + objColaborador.getSalario());

    }
}