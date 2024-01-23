/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author 17113061
 */
public class Tree {
    private Nodo root;
    
    public Tree()
    {
        this.root=null;
    }
    public Nodo getRoot()
    {
        return this.root;
    }
    public void Insert(int dado)
    {
        Nodo newNodo= new Nodo(dado);
        if(this.root==null)
        {
            this.root=newNodo;
        }
        else
        {
            Nodo nodoAux = this.root;
            Nodo nodoDad = this.root;
            boolean found = false;
            while(!found)
            {
                nodoDad = nodoAux;
                if(dado<nodoAux.dado)
                {
                    nodoAux=nodoAux.left;
                    if(nodoAux==null)
                    {
                        nodoDad.left= newNodo;
                        found=true;
                    }
                }
                else
                {
                    nodoAux=nodoAux.right;
                    if(nodoAux==null)
                    {
                        nodoDad.right=newNodo;
                        found=true;
                    }
                }
            }
        }
    }
    public Nodo Search(int dado)
    {
        Nodo nodoAux = this.root;
        
        while(nodoAux.dado!=dado)
        {
            if(dado<nodoAux.dado)
            {
                nodoAux=nodoAux.left;
                
            }
            else
            {
                nodoAux=nodoAux.right;
            }
            if(nodoAux==null)
            {
                    return null;
            }
            
        }
        return nodoAux;
    
    }
    public boolean delete (int dado)
	{
		Nodo nodoCurrent = root;
		Nodo nodoAnterior = root;
		
		boolean sonLeft = true;
		
		while (nodoCurrent.dado != dado)
		{
			nodoAnterior = nodoCurrent;
			
			if (dado < nodoCurrent.dado)
			{
				sonLeft = true;
				nodoCurrent = nodoCurrent.left;
			}
			else
			{
				nodoCurrent = nodoCurrent.right;
				sonLeft = false;
			}
				
			
			if (nodoCurrent == null)
				return false;
		}


		// encontrou o nodo
		
		// caso 1: n�o tem filhos
		//
		if ((nodoCurrent.left == null) && (nodoCurrent.right == null))
		{
		     if (nodoCurrent == root)	
		         root = null;
		     else
		     {
		  		if (sonLeft)
		  			nodoAnterior.left = null;
		  		else
		  			nodoAnterior.right = null;
		     }
		}
		// caso 2: tem um �nico filho
		else
		   if (nodoCurrent.right == null)
           {
		   	   if (nodoCurrent == root)	
		   	       root = nodoCurrent.left;
		   	   else
		   	      if (sonLeft)
		   	      		nodoAnterior.left = nodoCurrent.left;
		   	      else
		   	      	    nodoAnterior.right = nodoCurrent.left;	
		   	      	   
		    }
		    else
		      if (nodoCurrent.left == null)
		      {
		      	  if (nodoCurrent == root)
		      	      root = nodoCurrent.right;
		      	  else
		      	    if (sonLeft)
		      	        nodoAnterior.left = nodoCurrent.right;
		      	    else
		      	        nodoAnterior.right = nodoCurrent.right;
		      }
		      // caso3: tem 2 filhos
		      else
		      {
		      	Nodo sucessor = getSucessor(nodoCurrent);
		      	
		      	if (nodoCurrent == root)
		      	{
		      		root = sucessor;
		      	}
		      	else 
		      	  if (sonLeft)
		      	  {
		      	  	nodoAnterior.left = sucessor;
		      	  }
		      	  else
		      	  {
		      	  	nodoAnterior.right = sucessor;
		      	  }
		      	  
		      	sucessor.left = nodoCurrent.left;  
		      	  
		      }
		      return true;
		
	}
	
	private Nodo getSucessor(Nodo nodoExcluir)
	{
		Nodo paiSucessor = nodoExcluir;
		Nodo sucessor    = nodoExcluir;
		Nodo nodoAtual   = nodoExcluir.right;
		
		while (nodoAtual != null)
		{
			paiSucessor = sucessor;
			sucessor    = nodoAtual;
			nodoAtual   = nodoAtual.left;
		}
		
		if (sucessor != nodoExcluir.right)
		{
			paiSucessor.left = sucessor.right;
			sucessor.right    = nodoExcluir.right;
		}
		
		return sucessor;
	}
}
