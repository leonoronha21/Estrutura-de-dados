/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fila;

/**
 *
 * @author 17113061
 */
public class Exercicio1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Fila f1 = new Fila(3);
        Fila f2 = new Fila(3);
        Fila f = new Fila(20);
        int valor=0;
        
        while(!f1.isEmpty()||!f2.isEmpty())
        {
            
            f1.insere(1+1);
            f2.insere(3+3);
        
        }
        
        for(int x=0;x<10;x++)
        {
            System.out.println(f1.remove());
            System.out.println(f2.remove());
            
        }
        
        
        
    
        }
}
