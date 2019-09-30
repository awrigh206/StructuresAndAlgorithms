/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dsa_algorithms.Sorting;

/**
 *
 * @author Andrew Wright
 */
public class Insert implements ISort
{
    private int[] values = new int[]{};
    
    public void sort()
    {
        for(int i =1; i<values.length;i++)
        {
            int key = values[i];
            int j =i-1;
            
            while(j>= 0 && values[j]>key)
            {
                values[j+1] =values[j];
                j=j-1;
            }
            values[j+1] = key;
        }
    }

    public void setValues(int[] values) {
        this.values = values;
    }

    public int[] getValues() {
        return values;
    }
    
    
    
    
}
