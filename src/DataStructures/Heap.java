/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DataStructures;



/**
 *
 * @author Andrew Wright
 */
public class Heap <E> extends BinarySearchTree
{

    @Override
    public void add(Object obj) 
    {
        place(new Cell(obj),root);
           
            
    }
    
    private void place(Cell obj, Cell current)
    {
        System.err.println("hello there");
        boolean first = true;
        
        if(first)
        {
            root = obj;
            first = false;
        }
            
        else if(obj.hashCode()<current.hashCode())
        {
            obj.setLeft(current);
            current.getPrevious().setLeft(obj);
        }
        
        else
        {
            if(!current.hasLeft())
            {
                current.setLeft(obj);
            }
            
            if(!current.hasRight())
            {
                current.setRight(obj);
            }
            
            if(current.hasLeft()&& current.hasRight())
            {
                place(obj, root.getLeft());
            }
        }
    }
    
    
    
    
}