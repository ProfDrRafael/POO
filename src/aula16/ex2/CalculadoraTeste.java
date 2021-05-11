/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula16.ex2;

import java.io.DataInputStream;
import java.io.IOException;

/**
 *
 * @author Rafael
 */
public class CalculadoraTeste {
    
    public static void main(String[] args) {
        DataInputStream teclado = new DataInputStream (System.in);
        int n1, n2;
        n1 = 0;
        n2 = 0;
        try {
            System.out.println("Digite o primeiro número:");
            n1 = Integer.parseInt(teclado.readLine());
            System.out.println("Digite o segundo número:");
            n2 = Integer.parseInt(teclado.readLine());
        }
        catch (IOException ioe) {
            System.out.println("Erro na entrada dos números!");
        }
        catch (NumberFormatException nfe) {
            System.out.println("Só são aceitos números como entrada");
        }
        catch (Exception e) {
            System.out.println("Erro encontrado! Tente novamente!");
        }

        try {
            Calculadora.somar(n1, n2);
            Calculadora.subtrair(n1, n2);
            Calculadora.multiplicar(n1, n2);
            Calculadora.dividir(n1, n2);
            Calculadora.calcularPotencia(n1, n2);
            Calculadora.calcularRaiz(n2);
            Calculadora.calcularInverso(n1);
        }
        catch (ArithmeticException ae) {
            System.out.println("Não existe divisão por 0!");
        }
        catch (Exception e) {
            System.out.println("Erro encontrado em algum cálculo!");
        }
        finally {
            System.out.println("Obrigado por usar a Calculadora!");
        }
    }
}
