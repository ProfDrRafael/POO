/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula28.ex2;

/**
 *
 * @author Rafael
 */
public class MinhaRunnable implements Runnable {

    private String nome;
    private int tempo;
    
    public MinhaRunnable(String nome, int tempo) {
        this.nome = nome;
        this.tempo = tempo;
        Thread t = new Thread(this);
        t.start();
    }
    
    @Override
    public void run() {
        try {
            for (int i = 10; i >= 0; i--) {
                System.out.println(nome + " - Contador: " + i);
                Thread.sleep(tempo);
            }
        }
        catch (InterruptedException ex) {
            System.out.println("Erro na Thread!");
            ex.printStackTrace();
        }
        finally {
            System.out.println(nome + " encerrada!");
        }
    }
    
}
