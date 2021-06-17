/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula24.ex2;

/**
 *
 * @author Rafael
 */
public class Conta {
    
    private int numero;
    private float saldo;
    private Pessoa titular;

    public boolean depositar (float valor) {
        this.saldo = this.saldo + valor;
        return true;
    }
    
    public boolean sacar (float valor) {
        if (valor <= this.saldo) {
            this.saldo = this.saldo - valor; 
            return true;
        }
        else {
            return false;
        }
    }
    
    /**
     * @return the numero
     */
    public int getNumero() {
        return numero;
    }

    /**
     * @param numero the numero to set
     */
    public void setNumero(int numero) {
        this.numero = numero;
    }

    /**
     * @return the saldo
     */
    public float getSaldo() {
        return saldo;
    }

    /**
     * @param saldo the saldo to set
     */
    public void setSaldo(float saldo) {
        this.saldo = saldo;
    }

    /**
     * @return the titular
     */
    public Pessoa getTitular() {
        return titular;
    }

    /**
     * @param titular the titular to set
     */
    public void setTitular(Pessoa titular) {
        this.titular = titular;
    }
}
