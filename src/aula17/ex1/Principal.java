/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula17.ex1;

import java.util.InputMismatchException;

/**
 *
 * @author Rafael
 */
public class Principal {
    
    public static void main(String[] args) {
        Vetor v = new Vetor();
        
        try {
            v.preencher();
        }
        catch (ArrayIndexOutOfBoundsException aioobe) {
            System.out.println("O limite do vetor foi ultrapassado!");
        }
        catch (InputMismatchException ime) {
            System.out.println("Foi inserido um valor não numérico!");
        }
        catch (Exception e) {
            System.out.println("Ocorreu um erro!");
        }
        finally {
            v.exibir();
        }
    }
    
}
