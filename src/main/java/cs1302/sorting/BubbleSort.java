package cs1302.sorting;

public class BubbleSort
{



    public static <T> void bubblsSort(T[] array, int lo, int hi, Comparator<T> c){
        if (lo > hi){
            System.out.println("invalid indices");
            return;
        }
        int count = 0;
        T[] unsorted = array;
        while(hi>=lo){
            array[count] = bubble(unsorted, 0, hi, Integer::compareTo);
            hi--;
            count++;
        }

    }
},
