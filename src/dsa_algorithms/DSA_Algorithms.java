/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dsa_algorithms;

import DataStructures.Heap;
import DataStructures.Tests.AddDataTest;
import dsa_algorithms.Sorting.Bubble;
import dsa_algorithms.Sorting.HeapSort;
import dsa_algorithms.Sorting.Insert;
import dsa_algorithms.Sorting.QuickSortLoop;
import dsa_algorithms.Sorting.QuickSortRecursive;
import dsa_algorithms.Sorting.Sort;
import dsa_algorithms.Sorting.Testers.SortTest;

/**
 *
 * @author Andrew Wright
 */
public class DSA_Algorithms 
{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
//        // This is used for testing purposes only 
        //SortTest test = new SortTest();
        //test.run(new QuickSortRecursive());
//        SortTest test2 = new SortTest();
//        test2.run(new Bubble());
        AddDataTest dataTest = new AddDataTest();
        dataTest.run(new Heap());
    }
    
}
