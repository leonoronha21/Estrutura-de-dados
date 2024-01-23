package pilhas;


public class Pilha {
 
    private int memo[];
    private int tamanho, topo;

    
    
    
    public boolean isEmpty()  //Verifica underflow
    {
        if(this.topo==-1)
        {
           return true;
        }
        else
        {
           return false;
        }

    }
    public boolean isFull()  //verifica se a pilha ultrapassou tamanho
    {
            if(this.topo<this.tamanho-1)
            {
                return false;
            }
            else
            {
                return true;
            }
    }
    public Pilha(int tamanho)
    {
        this.tamanho =  tamanho;
        this.memo = new int[this.tamanho];
        this.topo=-1;                                   /* Topo pode ser inicializada na posição 0 ou na posição -1*/
    }
    
    public void push(int elemento)
    {
        /* Algoritmo push
         1- Incrementa o topo
         2- Armazena elemento
        */
        if(!isFull())
        {
            this.topo++;
            this.memo[this.topo]=elemento;
        }
        else
        {
            System.out.println("Overflow!");  
        }

    }
    public int pop()
    {
        /*
        1- Guardar o elemento do topo
        2- Decrementar topo
        3- retornar elemento guardado
        */
        int elemento=0;
        if(!isEmpty())
        {
            
            elemento=this.memo[this.topo];
            this.topo--;
            
        }
        else
        {
            System.out.println("Underflow");    
        }
        return elemento;
    }
    public int top()
    {
        if(!isEmpty())
        {
            return this.memo[this.topo];
        }else{
            return 0;
        }
    }
}
