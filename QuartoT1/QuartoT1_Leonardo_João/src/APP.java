
import java.util.Scanner;


/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Leonardo
 */
public class APP {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int sai=1;
        ListaDupla L1 = new ListaDupla();
        ListaDupla L2 = new ListaDupla();
        
        Scanner in = new Scanner(System.in);
        while(sai!=0){
                
            System.out.println("Deseja inserir na lista 1 ou na lista 2");
            int opcaolista = in.nextInt();
            if(opcaolista==1){
                System.out.println("Insira um número para Lista 1:");
                int numL1 = in.nextInt();
                if(L1.isEmpty()){
                    L1.InsereInicio(numL1);
                }
                else{
                    Nodo NodoAux = L1.prim;
                    int maior = NodoAux.dado;
                    while(NodoAux!=null)
                    {
                        if(maior>NodoAux.dado.)
                        {
                            
                        }
                    }
                    
                }
                
                L1.InsereInicio(numL1);
            }
            if(opcaolista==2){
                System.out.println("Insira um número para Lista 2:");
                int numL2 = in.nextInt();
                if(L2.isEmpty()){
                    L2.InsereInicio(numl2);
                }
            }
                System.out.println("Deseja inserir outro? \n1-Inserir outro \n0-Sair");
                sai=in.nextInt();
        }
       L1.MostraLista(1);
       L2.MostraLista(1);
       
     
       
      
      
      
       
       
       
       
       
    }
        
}
