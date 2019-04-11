package cs1302.sorting;
import java.util.Comparator;

public class BubbleSort
{

    public static <T> void bubble(T[] array, int lo , int hi, Comparator<T> c)
        {
            T temp = null;
            if(!(lo<=hi))
            {
                System.out.println("indices invalid");
            }else
            {
                for(int i = lo; i < hi-1; i++)
                {
                    if(c.compare(array[i],array[i+1])>0)
                       {
                           temp = array[i];
                           array[i] = array[i+1];
                           array[i+1] = temp;
                       }//if
                }//for
            }
        }//bubble

    public static <T> void bubbleSort(T[] array, int lo, int hi, Comparator<T> c){
        if (lo > hi){
            System.out.println("invalid indices");
            return;
        }
        int count = 0;
        T[] unsorted = array;
        while(hi>=lo){
            bubble(unsorted, 0, hi, c);
            array[count] = unsorted[count];
            hi--;
            count++;
        }

    }
}
