/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DataStructures;

import java.util.ArrayList;
import java.util.LinkedList;

/**
 *
 * @author Andrew Wright
 */
public class Heap extends DataType
{
    ArrayList<Object> values = new ArrayList<>();
    
    public void add(Object toAdd)
    {
        boolean beenAdded = false;
        if(values.isEmpty())
        {
            values.add(toAdd);
        }
            
        
        for(int i=0; i< values.size();i++)
        {
//            System.err.println("to add: "+toAdd.hashCode());
//            System.err.println("value[i]: "+values.get(i).hashCode());
            if(toAdd.hashCode()<values.get(i).hashCode())
            {
                values.add(toAdd);
                swap(values.size()-1,i);
                beenAdded = true;
                break;
            }
        }
        
        if(!beenAdded)
        {
            values.add(toAdd);
        }
    }
    
    private void swap(int firstIndex, int secondIndex)
    {
        
        Object temp = values.get(firstIndex);
        values.set(firstIndex, values.get(secondIndex));
        values.set(secondIndex, temp);
    }

    public Object[] getValues() 
    {
        return values.toArray(new Object[values.size()]);
    }
    
    public void print()
    {
        for(int i=0;i<values.size();i++)
        {
            System.out.println(values.get(i).toString());
        }
    }
    
    
}
