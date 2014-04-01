/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1;

/**
 *
 * @author Rob
 */
public class Quicksort {
    
    public void rQuicksort(int[] a, int p, int r)
    {
        if (p < r)
        {
            int q = rPartition(a, p, r);
            rQuicksort(a, p, q -1);
            rQuicksort(a, q + 1, r);
        }
    }
    
    public int rPartition(int[] a, int p, int r)
    {
        int i = p + (int)(Math.random() * ((r - p) + 1));
        int temp = a[r];
        a[r] = a[i];
        a[i] = temp;
        return partition(a, p, r);
    }
    
    public int partition(int[] a, int p, int r)
    {
        int x = a[r];
        int i = p - 1;
        for (int j = p; j < r; j++)
        {
            if (a[j] <= x)
            {
                i++;
                int temp = a[j];
                a[j] = a[i];
                a[i] = temp;
            }
        }
        int temp = a[i + 1];
        a[i + 1] = a[r];
        a[r] = temp;
        return i + 1;
    }
    
}
