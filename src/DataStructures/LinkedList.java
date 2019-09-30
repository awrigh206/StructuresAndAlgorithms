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
public class LinkedList <E> extends DataType
{
    private Cell head;
    private boolean first = true;
    private int length;

    public LinkedList() 
    {
        length =0;
    }

    @Override
    public void add(Object obj) 
    {
        Cell tempCell = new Cell (obj);
        tempCell.setNext(head);
        head = tempCell;
        length++;
    }

    @Override
    public Object[] getValues() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void print() {
        Cell current = head;
        while(current.hasNext())
        {
            System.out.println("value: "+current.getValue().toString());
            current = current.getNext();
        }
    }

    @Override
    public Object search(int id) 
    {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public int getLength() {
        return length;
    }
    
    private class Cell <E>
    {
        private E value;
        private Cell next;
        private Cell previous;

        public Cell(E value) {
            this.value = value;
        }
        
        public E getValue() {
            return value;
        }

        public void setValue(E value) {
            this.value = value;
        }

        public Cell getNext() {
            return next;
        }

        public void setNext(Cell next) {
            this.next = next;
        }

        public Cell getPrevious() {
            return previous;
        }

        public void setPrevious(Cell previous) {
            this.previous = previous;
        }

        
        
        public boolean hasNext()
        {
            if(next != null)
                return true;
            else 
                return false;
        }
        
        
    }
    
}
