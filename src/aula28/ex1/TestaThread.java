/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula28.ex1;

/**
 *
 * @author Rafael
 */
public class TestaThread {
    
    public static void main(String[] args) {
        MinhaThread t1 = new MinhaThread("Thread 1", 500);
//        t1.start();
        MinhaThread t2 = new MinhaThread("Thread 2", 1000);
//        t2.start();
        MinhaThread t3 = new MinhaThread("Thread 3", 2000);
//        t3.start();
        MinhaThread t4 = new MinhaThread("Thread 4", 1500);
//        t4.start();
    }
    
}
