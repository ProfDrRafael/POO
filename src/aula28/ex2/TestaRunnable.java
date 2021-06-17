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
public class TestaRunnable {
    
    public static void main(String[] args) {
        MinhaRunnable r1 = new MinhaRunnable("Thread 1", 600);
        MinhaRunnable r2 = new MinhaRunnable("Thread 2", 1200);
        MinhaRunnable r3 = new MinhaRunnable("Thread 3", 1800);
        MinhaRunnable r4 = new MinhaRunnable("Thread 4", 2400);   
        
//        Thread t1 = new Thread(r1);
//        Thread t2 = new Thread(r2);
//        Thread t3 = new Thread(r3);
//        Thread t4 = new Thread(r4);
//        
//        t1.start();
//        t2.start();
//        t3.start();
//        t4.start();
    }
    
}
