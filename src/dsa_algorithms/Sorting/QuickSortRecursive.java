/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dsa_algorithms.Sorting;

import java.util.ArrayList;

/**
 *
 * @author Andrew Wright
 */
public class QuickSortRecursive extends Sort
{
    private Integer[] values;
    

    @Override
    public Integer[] getValues() 
    {
        return values;
    }

    @Override
    public void setValues(Integer[] values) 
    {
        this.values = values;
    }

    @Override
    public void sort() 
    {
        quick(values,0, values.length-1);
    }
    
    public void quick(Integer[] values, Integer left, Integer right)
    {
        if(left<right)
        {
            int pivotIndex = partition(values,left,right); 
            quick(values, left, pivotIndex - 1);  // sort the left subarray
            quick(values, pivotIndex + 1, right); // sort the right subarray
        }
    }
    
    private int partition(Integer[] array, int left, int right) 
    {
        int pivot = array[right];  // choose the rightmost element as the pivot
        int partitionIndex = left; // the first element greater than the pivot

        /* move large values into the right side of the array */
        for (int i = left; i < right; i++) {
            if (array[i] <= pivot) { // may be used '<' as well
                swap(array, i, partitionIndex);
                partitionIndex++;
            }
        }

        swap(array, partitionIndex, right); // put the pivot on a suitable position

        return partitionIndex;
    }
 
    private void swap(Integer[] array, int i, int j) 
    {
        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }

    private void print(Integer[] values)
    {
        for (Integer i: values)
        {
            System.out.println(i);
        }
    }
    
}
