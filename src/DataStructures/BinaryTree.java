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
public class BinaryTree <E> extends DataType 
{
    private Cell<E> root;
    private Cell<E> current;
    
    @Override
    public void add (Object obj)
    {
        boolean added = false;
        current = root;
        if(root == null)
        {
            root = new Cell(obj);
        }
        
        while(!added)
        {
            if(obj.hashCode()< current.getValue().hashCode())
            {
                if(!current.hasLeft())
                {
                    //If cell does not have a left and the obj to be added is less than the current cell value
                    current.setLeft(new Cell(obj));
                    added=true;
                }
                
                else
                {
                    current = current.getLeft();
                }
            }
            
            else if(obj.hashCode()> current.getValue().hashCode())
            {
                if(!current.hasRight())
                {
                    //If cell does not have a right and the obj to be added is greater than the current cell value
                    current.setRight(new Cell(obj));
                    added= true;
                }
                
                else
                {
                    //Move right in the tree if that right exists 
                    current = current.getRight();
                }
            }
        }
    }

    @Override
    public Object[] getValues() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void print() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    private class Cell <E>
    {
        private Cell<E> right;
        private Cell<E> left;
        private E value;

        public Cell(E value) {
            this.value = value;
        }

        public Cell<E> getRight() {
            return right;
        }

        public void setRight(Cell<E> right) {
            this.right = right;
        }

        public Cell<E> getLeft() {
            return left;
        }

        public void setLeft(Cell<E> left) {
            this.left = left;
        }

        public E getValue() {
            return value;
        }

        public void setValue(E value) {
            this.value = value;
        }
        
        public boolean hasLeft()
        {
            if(left!= null)
                return true;
            else
                return false;
        }
        
        public boolean hasRight()
        {
            if(right !=null)
                return true;
            else 
                return false;
        }

       
        
        
    }
    

    
    
}


