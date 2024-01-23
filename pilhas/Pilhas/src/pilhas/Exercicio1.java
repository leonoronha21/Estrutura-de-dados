/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pilhas;

import java.util.Scanner;

/**
 *
 * @author 17113061
 */
public class Exercicio1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
        Pilha Panasonic = new Pilha(4);
        Scanner input = new Scanner(System.in);
        
        int x=0;
        for(x=0;x<4;x++)
        {
            System.out.print("Escreva o número para a posição "+x+":");
            Panasonic.push(input.nextInt());
            
            int save=Panasonic.top();
            
            int divisão = save%2;
            
            if(divisão==0)
            {
                System.out.println("PAR, SALVO NA PILHA!");
                Panasonic.push(save);
            }
            if(divisão==1)
            {
                System.out.println("IMPAR");
                Panasonic.pop();
                Panasonic.isEmpty();
            }
        
        }
        
        while(!Panasonic.isEmpty())
        {
            System.out.println(Panasonic.pop());
        }
       
    }
    
}
