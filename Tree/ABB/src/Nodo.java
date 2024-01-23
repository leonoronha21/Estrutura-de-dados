


/**
 *
 * @author 17113061
 */
public class Nodo {
    public Nodo left;
    public int dado;
    public Nodo right;
    
    public Nodo(int dado)
    {
        this.left=null;
        this.dado=dado;
        this.right=null;
    }
    public void MostraNodo()
    {
        System.out.println("——>Left="+this.left+"\n——>Dado= "+this.dado+"\n——>Right= "+this.right);
    }
    
    
}
