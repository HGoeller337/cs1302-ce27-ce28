package cs1302.sorting;
import java.util.Comparator;

public class BubbleSort
{
    T temp = 0;
    public static <T> void bubble(T[] array, int lo , int hi, Comparator<T> c)
        {
            if(!(lo<=hi))
            {
                Sysyem.out.println("indices invalid");
            }else
            {
                for(int i = lo; i < hi-1; i++)
                {
                    if(c.compare(array[i],array[i+1]>0))
                       {
                           temp = array[i];
                           array[i] = array[i+1];
                           array[i+1] = temp;
                       }//if
                }//for
            }
        }//bubble
                       
    public static void main(String[]args){
        String[] array = {2,3,1,4,5};
        System.out.println(Arrays.toString(array)); // [ 2, 3, 1, 4, 5 ]
        bubble(array, 0, 4, Integer::compareTo);
        System.out.println(Arrays.toString(array)); // [ 2, 1, 3, 4, 5 ]
    


}
