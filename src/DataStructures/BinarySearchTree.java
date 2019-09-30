/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DataStructures;

import dsa_algorithms.Sorting.ExampleObject;
import java.util.ArrayList;

/**
 *
 * @author Andrew Wright 
 */
public class BinarySearchTree <E> extends DataType 
{
    protected Cell<E> root;
    protected boolean first = true;

    public BinarySearchTree() 
    {
        root = new Cell();
    }
    
    /**
     * Used to add objects to the binary search tree.
     * Maintains the order of the tree via recursuion and the various if statements
     * @param obj 
     */
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

    /**
     * Returns all of the objects in the tree as a array of objects
     * @return 
     */
    @Override
    public Object[] getValues() 
    {
        ArrayList<E> values = recurseGet(root, new ArrayList<>());
        return values.toArray(new Object[values.size()]);
    }

    /**
     * Prints out all of the objects stored in the tree to the console
     */
    @Override
    public void print() {
        ArrayList<E> values = recurseGet(root, new ArrayList<>());
        for (E value: values)
        {
            System.out.println(value.toString());
        }
    }
    
    /**
     * Gathers all of the values stored in the tree into an ArrayList and returns it 
     * @param current
     * @param values
     * @return 
     */
    private ArrayList<E> recurseGet(Cell current, ArrayList<E> values) 
    {
        
        if(current.hasLeft())
        {
            recurseGet(current.getLeft(),values);
            current.setLeft(null);
        }
            
        if(current.hasRight())
        {
            recurseGet(current.getRight(),values);
            current.setRight(null);
        }
        
        if(!current.hasRight()&&  !current.hasLeft())
            values.add((E)current.getValue());
        return values;
        
    }
    
    /**
     * This is used to look through the tree for a single value
     * @param current
     * @return 
     */
    private E lookUp(Cell current, int id) 
    {
        int currentId = (current.getValue()).hashCode();
        
        if(currentId == id)
            return (E)current.getValue();
        
        else if(current.hasLeft())
        {
            return lookUp(current.getLeft(),id);
            //current.setLeft(null);
        }
            
        else if(current.hasRight())
        {
            return lookUp(current.getRight(),id);
            //current.setRight(null);
        }
        
        if(!current.hasRight()&&  !current.hasLeft())
            return null;
        return null;
        
    }

    /**
     * For looking through the tree for an object of the hashcode that you're looking for
     * @param id
     * @return 
     */
    @Override
    public Object search(int id) {
        return lookUp(root, id);
    }
    
    /**
     * represents a cell in the tree. Use of generics allows it to hold objects of any class
     * @param <E> 
     */
    protected class Cell <E>
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


