/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula17.ex2;

import java.util.Scanner;

/**
 *
 * @author Rafael
 */
public class LetraTeste {
    
    public static void main(String[] args) {
        Letra letra = new Letra();
        Scanner leitura = new Scanner(System.in);
        String s1, s2;
        
        try {
            System.out.println("Digite a primeira string:");
            s1 = leitura.next();
            System.out.println("Digite a segunda string:");
            s2 = leitura.next();

            if (letra.compararStringsIguais(s1, s2)) {
                System.out.println("Strings iguais!");
            }
            else {
                System.out.println("Strings diferentes!");
            }

            System.out.println("Quantidade de caracteres s1: " + letra.contarCaracteres(s1));
            System.out.println("Quantidade de caracteres s2: " + letra.contarCaracteres(s2));    
            System.out.println("Maiúsculo: " + letra.converterMaiusculo(s1));
            System.out.println("Minúsculo: " + letra.converterMinusculo(s2));
        }
        catch (ClassCastException cce) {
            System.out.println("Erro de conversão!");
        }
        catch (ArrayIndexOutOfBoundsException aiooe) {
            System.out.println("Limite ultrapassado!");
        }
        catch (StringIndexOutOfBoundsException sioobe) {
            System.out.println("Limite ultrapassado!");
        }
        catch (RuntimeException re) {
            System.out.println("Encontramos um erro!");
        }
        finally {
            System.out.println("Obrigado por usar o programa!");
        }
    }
    
}
