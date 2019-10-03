/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dsa_algorithms.Searching;

/**
 *
 * @author Andrew Wright
 */
public class BinarySearch <E> extends Search
{

    @Override
    public int search(Object item, Object[] array) 
    {
        int left = 0;
        int right = array.length - 1;

        while (left <= right) 
        {
            int mid = left + (right - left) / 2;

            if (item == array[mid]) 
            {
                for(int i = left; i < right; i++)
                {
                    System.out.println(i);
                    if(item == array[i])
                    {
                        return i;
                    }
                        
                    else 
                    {
                        return mid;
                    }
                }
            } 
            
            else if (item.hashCode() < array[mid].hashCode()) 
            {
                right = mid - 1;
            }
            
            else 
            {
                left = mid + 1;
            }
        }
        return -1;
    }
    
}
