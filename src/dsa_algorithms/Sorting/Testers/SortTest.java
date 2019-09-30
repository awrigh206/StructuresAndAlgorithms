/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dsa_algorithms.Sorting.Testers;

import dsa_algorithms.Sorting.Sort;

/**
 *
 * @author Andrew Wright
 */
public class SortTest <E>
{
    private Integer[] values = new Integer[]{};
    
    public void run(Sort<E> sort)
    {
        values = new Integer[] {1,51,2,3,45,78,9,19,5,4,65,41,23,15,8,22,45,885,100};
        sort.setValues(values);
        sort.sort();
        values = sort.getValues();
        
        for (int current: values)
        {
            System.out.println(current);
        }
    }
    
}
