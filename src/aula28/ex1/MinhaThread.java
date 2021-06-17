/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula28.ex1;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Rafael
 */
public class MinhaThread extends Thread {
    
    private int tempo;
    private String nome;
    
    public MinhaThread (String nome, int tempo) {
        this.nome = nome;
        this.tempo = tempo;
        start();
    }
    
    @Override
    public void run() {
        for (int i = 1; i <= 10; i++) {
            System.out.println(nome + ": " + i);
            try {
                sleep(tempo);
            } catch (InterruptedException ex) {
                System.out.println("Erro na Thread!");
                ex.printStackTrace();
            }
        }
        System.out.println(nome + " encerrada!");
    }
    
}
