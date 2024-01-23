/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fila;

import java.util.Scanner;

/**
 *
 * @author 17113061
 */
public class App {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        FilaCircular fila = new FilaCircular(2);
        Scanner input = new Scanner(System.in);
        
        fila.insere(1);
        fila.insere(3);
        fila.insere(2);
        fila.insere(5);
        fila.insere(1);
         
        fila.remove();
        fila.remove();
        fila.remove();
        System.out.println(fila.remove());
        fila.remove();
        fila.remove();
        
       
        
        
    }
    
}
