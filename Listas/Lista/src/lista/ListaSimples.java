/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lista;

/**
 *
 * @author 17113061
 */
public class ListaSimples {
 
    public Nodo prim;
    
    public ListaSimples()
    {
        this.prim = null;
    }
    public boolean IsEmpty()
    {
        if(this.prim==null)
        {
            return true;
        }
        else{
            return false;
        }
    }
    public void InsereInicio(int dado)
    {   /*1-Criar um novo nodo com o dado.
         2-Conectar o nodo -> next do novo nodo vaai receber o prim
         3-Prim recebe o novo nodo.
        */
        Nodo nodo = new Nodo(dado);
        
        nodo.next = this.prim;
        this.prim=nodo;
        
    }
    public Nodo RemoveInicio()
    {
        /*  1- guardar o prim em uma variavel auxiliar
            2-atualizar o prim -> next do prim
            3-retornar o nodo guardado        
        */
        Nodo Nodoauxiliar = this.prim;
        this.prim = this.prim.next;
        return Nodoauxiliar;       
    }
    public void MostraLista()
    {
        Nodo nodoAux = this.prim;
        while(nodoAux!=null)
        {
            nodoAux.MostraNodo();
            nodoAux = nodoAux.next;
        }
        
    }
        
}
