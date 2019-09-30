/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DataStructures;

import java.util.ArrayList;

/**
 *
 * @author Andrew Wright 
 */
public class BinaryTree <E> extends DataType 
{
    private Cell<E> root;
    private boolean first = true;

    public BinaryTree() 
    {
        root = new Cell();
    }
    
    @Override
    public void add (Object obj)
    {
        Cell<E> current;
        boolean added = false;
        current = root;
        
        if(first)
        {
            root = new Cell(obj);
            root.setPrevious(null);
            first = false;
        }
        
        else 
        {
            while(!added)
            {
                int currentHash = current.getValue().hashCode();
                int toAddHash = obj.hashCode();

                if(toAddHash<= currentHash)
                {
                    if(!current.hasLeft())
                    {
                        //If cell does not have a left and the obj to be added is less than the current cell value
                        current.setLeft(new Cell(obj));
                        current.getLeft().setPrevious(current);
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
                        current.getRight().setPrevious(current);
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
        
        
    }

    @Override
    public Object[] getValues() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void print() {
        printRecurse(root);
    }
    
    public void printRecurse(Cell current) 
    {
        //Cell<E> current = root;
        ArrayList<E> values = new ArrayList<>();
        
        if(current.hasLeft())
        {
            printRecurse(current.getLeft());
            current.setLeft(null);
        }
            
        if(current.hasRight())
        {
            printRecurse(current.getRight());
            current.setRight(null);
        }
        
        if(!current.hasRight()&&  !current.hasLeft())
            System.out.println(current.getValue());
            
        
        
//        while (current != null)
//        {
//            while(current.hasLeft())
//            {
//                current = current.getLeft();
//                if(!current.hasRight()  && !current.hasLeft())
//                {
//                    System.out.println(current.getValue().toString());
//                    current = current.getPrevious();
//                    current.setLeft(null);
//                } 
//
//                while(current.hasRight())
//                {
//                    current = current.getRight();
//                    if(!current.hasLeft() && !current.hasRight())
//                    {
//                        System.out.println(current.getValue().toString());
//                        current = current.getPrevious();
//                        current.setRight(null);
//                        break;
//                    } 
//                }
//            }
//
//            while(current.hasRight())
//            {
//                current = current.getRight();
//                if(!current.hasRight()  && !current.hasLeft())
//                {
//                    System.out.println(current.getValue().toString());
//                    current = current.getPrevious();
//                    current.setRight(null);
//                } 
//
//                while(current.hasLeft())
//                {
//                    current = current.getLeft();
//                    if(!current.hasLeft() && !current.hasRight())
//                    {
//                        System.out.println(current.getValue().toString());
//                        current = current.getPrevious();
//                        current.setLeft(null);
//                        break;
//                    } 
//                }
//            }
//        }
        
    }
    
    private class Cell <E>
    {
        private Cell<E> right;
        private Cell<E> left;
        private Cell<E> previous;
        private E value;
        
        public Cell()
        {
            value = null;
        }

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

        public Cell<E> getPrevious() {
            return previous;
        }

        public void setPrevious(Cell<E> previous) {
            this.previous = previous;
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

        @Override
        public String toString() {
            return "Cell{" + "right=" + right + ", left=" + left + ", value=" + value + '}';
        }
        
    }

    @Override
    public String toString() {
        return "BinaryTree{" + "root=" + root + '}';
    }
}


