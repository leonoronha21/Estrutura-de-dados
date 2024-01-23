/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author 17113061
 */
public class APP {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Tree tree = new Tree();
        
        tree.Insert(20);
        tree.Insert(15);
        tree.Insert(25);
        tree.Insert(13);
        tree.Insert(17);
        tree.Insert(23);
        tree.Insert(42);
        tree.Insert(10);
        tree.Insert(16);
        tree.Insert(18);
        tree.Insert(21);
        tree.Insert(30);
        tree.Insert(47);
        tree.Insert(18);
        
        
       tree.Search(10);
       
       tree.delete(10);
       
       tree.Search(10).MostraNodo();
    
}

}