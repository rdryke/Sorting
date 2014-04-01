/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1;

/**
 *
 * @author Rob
 */
public class BubbleSort {
    
    public void sort(int[] a)
    {
        boolean check = true;
        while (check)
        {
            check = false;
            for (int i = 1; i < a.length; i++)
            {
                if (a[i - 1] > a[i])
                {
                    int temp = a[i - 1];
                    a[i - 1] = a[i];
                    a[i] = temp;
                    check = true;
                }
            }
            
        }
    }
    
}
