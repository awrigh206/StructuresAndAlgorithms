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
        
        if(first)
        {
            root = obj;
            first = false;
        }
            
        else if(obj.hashCode()<current.hashCode())
        {
            obj.setLeft(current);
            
            if(current.getPrevious()!=null && !isFull(current.getPrevious().getLeft()))
                current.getPrevious().setLeft(obj);
            else if(current.getPrevious()!=null && !isFull(current.getPrevious().getRight()))
                current.getPrevious().setRight(obj);
            else
                place(obj,current.getLeft());
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
                if(!isFull(root.getLeft()))
                    place(obj, root.getLeft());
                else if (!isFull(root.getRight()))
                    place(obj, root.getRight());
                else
                    place(obj, root.getLeft());
            }
        }
    }
    
    private boolean isFull(Cell current)
    {
        if(current.hasLeft() && current.hasRight())
            return true;
        else 
            return false;
    }
    
    
    
    
}