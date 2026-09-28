package br.com.fiap.main;

import br.com.fiap.entities.Cliente;
import br.com.fiap.entities.Colaborador;
import br.com.fiap.entities.Endereco;

import javax.swing.*;

public class TesteSistema {

    // Java 21 psvm // Java 25 public psvma
    public static void main(String[] args) {

        // instanciar objetos
        Cliente objCliente = new Cliente();
        Colaborador objColaborador = new Colaborador();
        Endereco objEndereco = new Endereco();

        // Entradas Cliente
        objCliente.setNome(JOptionPane.showInputDialog("INFORMAÇÕES DO CLIENTE\nNome do Cliente"));
        objCliente.setRg(JOptionPane.showInputDialog("RG do Cliente"));
        objCliente.setIdade( Integer.parseInt(JOptionPane.showInputDialog("Idade")));
        objCliente.setAltura( Double.parseDouble(JOptionPane.showInputDialog("Altura")));

        // Entradas do Colaborador
        objColaborador.setNumeroRegistro(Integer.parseInt(JOptionPane.showInputDialog("INFORMAÇÕES DO COLABORADOR\nN° Registro")));
        objColaborador.setNome(JOptionPane.showInputDialog("Nome do Colaborador"));
        objColaborador.setSetor(JOptionPane.showInputDialog("Setor"));
        objColaborador.setSalario(Double.parseDouble(JOptionPane.showInputDialog("Salário")));
        objColaborador.setEndereco(objEndereco);

        // Entradas do Endereco
        objEndereco.setLogradouro(JOptionPane.showInputDialog("Endereço do Colaborador\nLogradouro"));
        objEndereco.setNumero(Integer.parseInt(JOptionPane.showInputDialog("Número")));
        objEndereco.setComplemento(JOptionPane.showInputDialog("Complemento"));
        objEndereco.setCep(JOptionPane.showInputDialog("CEP"));
        objEndereco.setBairro(JOptionPane.showInputDialog("Bairro"));
        objEndereco.setCidade(JOptionPane.showInputDialog("Cidade"));
        objEndereco.setEstado(JOptionPane.showInputDialog("Estado"));

        // Saidas
        System.out.println(
                objCliente + "" + objColaborador

        );
    }

}
