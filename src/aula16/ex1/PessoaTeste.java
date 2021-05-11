/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula16.ex1;

import java.io.DataInputStream;
import java.io.IOException;

/**
 *
 * @author Rafael
 */
public class PessoaTeste {
    
    public static void main(String[] args) {
        
        Pessoa p1 = new Pessoa();
        
        DataInputStream teclado = new DataInputStream (System.in);
       
        try {
            System.out.println("Digite o nome da Pessoa:");
            p1.setNome(teclado.readLine());
            System.out.println("Digite a idade da Pessoa: (Somente números)");
            p1.setIdade(Short.parseShort(teclado.readLine()));
            System.out.println("Digite o CPF da Pessoa: (Somente números)");
            p1.setCpf(Long.parseLong(teclado.readLine()));
            System.out.println("Digite o logradouro da Pessoa:");
            p1.setLogradouro(teclado.readLine());
            System.out.println("Digite o número da casa da Pessoa: (Somente números)");
            p1.setNumero(Integer.parseInt(teclado.readLine()));
            System.out.println("Digite o bairro da Pessoa:");
            p1.setBairro(teclado.readLine());
            System.out.println("Digite a cidade da Pessoa:");
            p1.setCidade(teclado.readLine());
            System.out.println("Digite o estado da Pessoa:");
            p1.setEstado(teclado.readLine());
            System.out.println("Digite o CEP da Pessoa: (Somente números)");
            p1.setCep(Long.parseLong(teclado.readLine()));
        }
        catch (IOException ioe) {
            System.out.println("Erro na entrada de dados da Pessoa!");
        }
        catch (NumberFormatException nfe) {
            System.out.println("Alguns números inseridos são inválidos!");
        }
        catch (Exception e) {
            System.out.println("Ocorreu um erro. Tente novamente!");
        }
        finally {
            System.out.println("Obrigado por utilizar o sistema!");
        }
        
        System.out.println("Dados da Pessoa:");
        System.out.println(p1.getNome());
        System.out.println(p1.getIdade());
        System.out.println(p1.getCpf());
        System.out.println(p1.getCep());
        System.out.println(p1.getLogradouro());
        System.out.println(p1.getNumero());
        System.out.println(p1.getBairro());
        System.out.println(p1.getCidade());
        System.out.println(p1.getEstado());
    }
    
}
