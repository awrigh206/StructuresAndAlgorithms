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
public abstract class Sort <E>
{
    public abstract Integer[] getValues();
    public abstract void setValues(Integer[] values);
    public abstract void sort();
}
