/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula16.ex2;

/**
 *
 * @author Rafael
 */
public class Calculadora {
    
    public static void somar (int a, int b) {
        int res;
        res = a + b;
        System.out.println("O resultado da soma é: " + res);
    }
    public static void subtrair (int a, int b) {
        int res;
        res = a - b;
        System.out.println("O resultado da subtração é: " + res);        
    }
    public static void multiplicar (int a, int b) {
        int res;
        res = a * b;
        System.out.println("O resultado da multiplicação é: " + res);        
    }
    public static void dividir (int a, int b) {
        int res = 0;
        res = a / b;
        System.out.println("O resultado da divisão é: " + res);        
    }
    public static void calcularPotencia (int a, int b) {
        int res;
        res = (int) Math.pow(a, b);
        System.out.println("O resultado da potência é: " + res);        
    }
    public static void calcularRaiz (int a) {
        int res;
        res = (int) Math.sqrt(a);
        System.out.println("O resultado da raiz quadrada é: " + res);
    }    
    public static void calcularInverso (int a) {
        int res;
        res = a * (-1);
        System.out.println("O resultado do inverso é: " + res);
    }
    
}
