/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1;
/**
 *
 * @author Rob
 */
public class MergeSort {
    
    
    
    public void merge(int[] a, int start, int divide, int end)
    {
        int size1 = divide - start + 1;
        int size2 = end - divide;
        int[] L = new int[size1];
        int[] R = new int[size2];
        for (int i = 0; i < size1; i++)
        {
            L[i] = a[start + i];
        }
        for (int i = 0; i < size2; i++)
        {
            R[i] = a[divide + i + 1];
        }
        
        
        int i = 0;
        int j = 0;
        for (int k = start; k <= end; k++)
        {
            if (j == R.length || (i != L.length && L[i] <= R[j]))
            {
                a[k] = L[i];
                i++;
            }
            else
            {
                a[k] = R[j];
                j++;
            }
        }
        
    }
    
    public void sort(int[] a, int start, int end)
        {
            if (start < end)
            {
                int temp = (start + end)/2;
                
                sort(a, start, temp);
                sort(a, temp + 1, end);
                merge(a, start, temp, end);
                
            }
        }
    
}
