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
public class Bubble extends Sort
{
    private Integer[] values = new Integer[]{};
    
    public void sort()
    {
        for (int j =0; j<values.length/2+1; j++)
        {
            for (int i =0; i<values.length-1; i++)
            {
                if (values[i] > values[i+1])
                {
                    //swap the values 
                    int temp = values[i];
                    values[i] = values[i+1];
                    values[i+1] = temp;
                }
            }
        }
        
    }

    public void setValues(Integer[] values) {
        this.values = values;
    }

    public Integer[] getValues() {
        return values;
    }
    
}
