/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula17.ex1;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author Rafael
 */
public class Vetor {
    
    private int vet[] = new int[10];
    
    public void preencher() throws ArrayIndexOutOfBoundsException, InputMismatchException {
        Scanner leitura = new Scanner(System.in);
        int num;
        int i = 0;
        
        while (true) {
            System.out.println("Digite o valor a inserir no vetor ou digite 0 para encerrar:");
            num = leitura.nextInt();
            
            vet[i] = num;
            
            if (num == 0) {
                break;
            }
            i++;
        }
        
    }
    public void exibir() {
        System.out.println("Os valores do vetor são:");
        for (int i = 0; i < vet.length; i++) {
            System.out.print(vet[i] + "  ");
        }
    }
    
}
