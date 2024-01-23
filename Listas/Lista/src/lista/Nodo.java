package lista;

/**
 *
 * @author 17113061
 */
public class Nodo {
    
    public int dado;
    public Nodo next;
    
    public Nodo(int dado)
    {
        this.dado=dado;
        this.next=null;
    }
    public void MostraNodo()
    {
        System.out.println("Dado =  "+this.dado+"\nEndereço = "+this.next);
    }
    
    
}
