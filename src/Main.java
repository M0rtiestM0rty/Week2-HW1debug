/*
how selection sort sorts the array E A S Y
Q U E S T I O N.Show, in the style of the example trace

public class Selection
{
public static void sort(Comparable[] a)
{ // Sort a[] into increasing order.
int N = a.length; // array length
for (int i = 0; i < N; i++)
{ // Exchange a[i] with smallest entry in a[i+1...N).
int min = i; // index of minimal entr.
for (int j = i+1; j < N; j++)
if (less(a[j], a[min])) min = j;
exch(a, i, min);
}
}
 */
import java.util.Arrays;

public class Main
{
    public static void sort (Comparable[] a)
    {
        int N = a.length;

        for(int i = 0;i < N;i++)
        {
            int min = i;

            for( int j = i + 1;j < N;j++)
            {
                if (less(a [j], a [min]))
                {
                    min = j;
                }// end if statement
            }//end nested for loop

        exch(a,i, min);

            System.out.println("pass:" + ( i + 1) + " :" + Arrays.toString(a));

        }// end first for loop
    }// end sort method

    private static boolean less (Comparable v,Comparable w)
    {
        return v.compareTo(w) < 0;
    }// end private method


    private static void exch (Comparable[] a, int i, int j)
    {
        Comparable temp = a[i];
        a[i] = a[j];
        a[j] = temp;
    }// end exch method

    public static void main (String[] args)
    {
        Character [] arr = {'E','A','S','Y','Q','U','E','S','T','I','O','N'};

        System.out.println( "OG Array:" + Arrays.toString(arr));
        sort(arr);
        System.out.println( "Sorted Array:" + Arrays.toString(arr));

    }// end main
}// end class