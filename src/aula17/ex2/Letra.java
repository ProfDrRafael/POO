/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula17.ex2;

/**
 *
 * @author Rafael
 */
public class Letra {
    
    public boolean compararStringsIguais(String s1, String s2) throws ClassCastException, ArrayIndexOutOfBoundsException, StringIndexOutOfBoundsException {
        char v1[] = s1.toCharArray();
        char v2[] = s2.toCharArray();
        
        if (v1.length != v2.length) {
            return false;
        }
        
        for (int i = 0; i < v1.length; i++) {
            if (v1[i] != v2[i]) {
                return false;
            }
        }
        return true;
    }
    
    public int contarCaracteres(String s) throws RuntimeException {
        return s.length();
    }
    
    public String converterMaiusculo(String s) throws ClassCastException, ArrayIndexOutOfBoundsException, StringIndexOutOfBoundsException {
        char[] vetor = s.toCharArray();
        for (int i = 0; i < s.length(); i++) {
            vetor[i] = Character.toUpperCase(vetor[i]);
        }
        s = String.valueOf(vetor);
        return s;        
    }
    
    public String converterMinusculo(String s) throws ClassCastException, ArrayIndexOutOfBoundsException, StringIndexOutOfBoundsException {
        char[] vetor = s.toCharArray();
        for (int i = 0; i < s.length(); i++) {
            vetor[i] = Character.toLowerCase(vetor[i]);
        }
        s = String.valueOf(vetor);
        return s;
    }
}
