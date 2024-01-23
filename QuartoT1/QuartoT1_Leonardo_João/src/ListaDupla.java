/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


/**
 *
 * @author 17113061
 */
public class ListaDupla {
    
    public Nodo prim;
    public Nodo ult;
    
    public ListaDupla()
    {
        this.prim=null;
        this.ult=null;
    }
    public boolean isEmpty()
    {
        if(this.prim==null)
        {
            return true;
        }
        else
        {
            return false;
        }
    }
    public void InsereInicio(int dado)
    {
        Nodo NovoNodo = new Nodo(dado);
        
        if(!isEmpty())
        {
            this.prim.prev=NovoNodo;
           
        }else{
            this.ult = NovoNodo;
        }
        NovoNodo.next=this.prim;
        this.prim=NovoNodo;
        
    }
    public void InsereFim(int dado)
    {
        Nodo NovoNodo = new Nodo(dado);
        if(!isEmpty())
        {
            this.ult.next = NovoNodo;
        }
        else
        {
            this.prim = NovoNodo;
        }
        NovoNodo.prev=this.ult;
        this.ult = NovoNodo;
        
    }
    public void MostraLista(int opcao)
    {
       if(opcao==1)
       {
            Nodo NodoAux = this.prim;
            while(NodoAux!=null)
            {
              NodoAux.MostraNodo();
              NodoAux = NodoAux.next;
            }
       }
       if(opcao==2)
       {
           Nodo NodoAux = this.ult;
           while(NodoAux!=null)
           {
                NodoAux.MostraNodo();
                NodoAux = NodoAux.prev;
           }
       }
    }
    public Nodo removeInicio()
    {
        Nodo NodoAux = this.prim;
        
        if(this.prim.next!=null){
            
            this.prim.next.prev = null;
        }
        else{
            this.ult = null;
        }
        this.prim = this.prim.next;
        return NodoAux;
        
    }
    public Nodo RemoveFim()
    {
        Nodo NodoAux=this.ult;
        if (this.ult.prev!=null)
        {
            this.ult.prev.next = null;
        }
        else{
            this.prim=null;
        }
        this.ult = this.ult.next;
        return NodoAux;
    }
    public void insere (int dado, int pos)
    {
        if((pos==0)|| isEmpty())
        {
             InsereInicio(dado);                                           // Analisa os paramentros da posicao e insere inicio
        }
        else
        {
            int contNodos=1;
            Nodo nodoAux = this.prim;                                      // Conta quantos nodos tem    
            while(nodoAux.next!=null)   
            {
                contNodos++;
                nodoAux=nodoAux.next;                                      // Percorre o nodo
            }
            if(pos>contNodos)
            {
                InsereFim(dado);                                           // Insere fim caso posicao>que tamanho endereço logico
            }
            else
            {
                contNodos=1;            
                nodoAux=this.prim;                                         // Conecta o nodo para a posicao 0 e verifica onde inserir o novo nodo
                
                while(contNodos<pos-1)
                {
                    contNodos++;
                    nodoAux=nodoAux.next;
                }
                Nodo novo_nodo = new Nodo(dado);
                novo_nodo.next=nodoAux.next;
                nodoAux.next=novo_nodo;
            }
            
                
        }       
    }
    public void OrdenaLista()
    {
        Nodo NodoAux = this.prim;
        while(NodoAux!=null)
        {
            int menor = 0;
            if(menor<NodoAux.dado)
            {
                menor=NodoAux.dado;
                InsereInicio(menor);
                NodoAux = NodoAux.next;
             
            }
            
            
            
        }
        
    }
    
}