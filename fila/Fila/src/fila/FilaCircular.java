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
public class FilaCircular {
        
        private int inicio;
        private int fim;
        private int memo[];
        private int tamanho;
        private int total;
        
        public FilaCircular(int tamanho)
        {
            this.tamanho=tamanho;
            this.memo = new int[this.tamanho];
            this.inicio=0;
            this.fim=0;
            this.total=0;
            
        }
        
        public void insere(int elemento)
        {
            //1- guarda o elemeto no fim
            //2- anda o fim
           if(!isFull()) 
           {
               this.memo[this.fim]=elemento;
               this.total++;
           
                if(this.fim==this.tamanho-1)
                 {
                    this.fim=0;
                 } else
                   {
                    this.fim++;
           
                   }
           }else
           
               System.out.println("OVERFLOW!");
           }
        
        public int remove()
        {
            //1-guarda o elemento que esta no fim da fila
            //2-andar o inicio
            //3- retorna o elemento guardado
            
            int retorno=0;
            if(!isEmpty())
            {
                retorno=this.memo[this.inicio];
                this.total--;
                if(this.inicio==this.tamanho-1)
                {
                    this.inicio=0;
                }else{
                    this.inicio++;
                }
                
            }else{
                System.out.println("UNDERFLOW");
            }
            return retorno;
        }
        public boolean isFull()
        {
            if(this.total==this.tamanho)
            {
                return true;
            }
            else 
            {
                return false;
            }
        }
        public boolean isEmpty()
        {
            if(this.total==0)
            {
                return true;
            }else{
                return false;
            }
        }
}
