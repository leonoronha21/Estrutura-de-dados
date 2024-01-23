


/**
 *
 * @author 17113061
 */
public class Nodo {
    public Nodo prev;
    public int dado;
    public Nodo next;
    
    public Nodo(int dado)
    {
        this.prev=null;
        this.dado=dado;
        this.next=null;
    }
    public void MostraNodo()
    {
        System.out.println("Dado =  "+this.dado+"\nPrev =  "+this.prev+"\nNext = "+this.next);
    }
    
    
}
