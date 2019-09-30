/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dsa_algorithms.Sorting;

import java.util.PriorityQueue;

/**
 *
 * @author Andrew Wright
 */
public class HeapSort extends Sort
{
    private PriorityQueue<Integer> minHeap;
    
    public HeapSort()
    {
        minHeap = new PriorityQueue<Integer>();
    }

    @Override
    public Integer[] getValues() 
    {
        Integer[] results = new Integer[minHeap.size()];
        int count =0;
        
        while(!minHeap.isEmpty())
        {
            results[count] = minHeap.poll();
            count++;
        }
        return results;
    }

    @Override
    public void setValues(Integer[] values) 
    {
        for(int i:values)
        {
            minHeap.add(i);
        }
    }

    @Override
    public void sort() {
        
    }
}
