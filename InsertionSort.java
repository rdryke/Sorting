/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1;
import java.util.*;
/**
 *
 * @author Rob
 */
public class InsertionSort {
    
    
    int[] a;
    
    
    
    public InsertionSort(int n)
    {
        
        a = new int[n];
    }
    
    public InsertionSort()
    {
        a = new int[10];
    }
     
    
    public void sort()
    {
         int temp, i;
           
        for (int j = 1; j < a.length; j++)
        {
            temp = a[j];
            i = j -1;
           
            while (i >= 0 && a[i] > temp)
            {
                a[i + 1] = a[i];
                i--;
                
            }
            a[i + 1] = temp;
        }
        
    }
    
}
