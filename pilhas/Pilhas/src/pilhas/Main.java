/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pilhas;

/**
 *
 * @author 17113061
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Pilha duracell  = new Pilha(4);
        
        duracell.push(5);
        duracell.push(2);
        duracell.push(1);
        duracell.push(3);
     
        
        System.out.println(duracell.pop());
        System.out.println(duracell.pop());
        System.out.println(duracell.pop());
        System.out.println(duracell.pop());
        System.out.println(duracell.pop());
        System.out.println(duracell.pop());
        System.out.println(duracell.top());
        
        
        
               
        
    }
    
}
