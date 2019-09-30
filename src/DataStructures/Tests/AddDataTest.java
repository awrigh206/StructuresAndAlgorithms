/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DataStructures.Tests;

import DataStructures.DataType;
import dsa_algorithms.Sorting.ExampleObject;

/**
 *
 * @author Andrew Wright
 */
public class AddDataTest <E>
{
    private Integer[] values = new Integer[]{};
    
    public void run(DataType<ExampleObject> dataType)
    {
        dataType.add(new ExampleObject(0));
        dataType.add(new ExampleObject(22));
        dataType.add(new ExampleObject(3));
//        dataType.add(new ExampleObject(198));
//        dataType.add(new ExampleObject(1));
//        dataType.add(new ExampleObject(5));
//        dataType.add(new ExampleObject(10));
//        dataType.add(new ExampleObject(11));
//        dataType.add(new ExampleObject(16));
//        dataType.add(new ExampleObject(4));
//        dataType.add(new ExampleObject(100));
        dataType.print();
        //System.out.println( "The result: "+dataType.toString());
    }
    
    
    
}
