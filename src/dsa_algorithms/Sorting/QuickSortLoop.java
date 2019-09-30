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
public class QuickSortLoop extends Sort 
{
    //DOES NOT WORK. REVISIT
    private Integer[] values;

    @Override
    public Integer[] getValues() {
        return values;
    }

    @Override
    public void setValues(Integer[] values) {
        this.values = values;
    }

    @Override
    public void sort() 
    {
        Integer left = 0;
        Integer right = values.length-1;
        
        while(left<right)
        {
            right = values.length-1;
            left =0;
            int pivotIndex = partition(values,left,right); 
            partition(values, left, pivotIndex - 1);  // sort the left subarray
            partition(values, pivotIndex + 1, right); // sort the right subarray
        }
    }
    
    private int partition(Integer[] array, int left, int right) 
    {
        int pivot = array[right];  // choose the rightmost element as the pivot
        int partitionIndex = left; // the first element greater than the pivot

        /* move large values into the right side of the array */
        for (int i = left; i < right; i++) 
        {
            if (array[i] <= pivot) // may be used '<' as well
            { 
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
    
}
