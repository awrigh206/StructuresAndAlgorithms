/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DataStructures;

/**
 *
 * @author Andrew Wright
 */
public abstract class DataType <E>
{
    public abstract void add(E obj);
    public abstract E[] getValues();
    public abstract void print();
}
