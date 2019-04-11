package cs1302.sorting;

import java.util.Comparator;
public class SelectionSort{

    public static void main (String[] args){
        Integer[] test = {1, 3, 5, 7, 8, 2, 9};
        for(int i = 0; i < test.length; i++){
            System.out.println(test[i]);
        }// for 
        selectionSort(test, 2, 5, Integer::compareTo);
        for(int i = 0; i < test.length; i++){
            System.out.println(test[i]);
        }// for 
    }// main
    
    public static <T> void selectMin(T[] array, int lo, int hi, Comparator<T> c)
        {
             T[] temp = array;
            if(!(lo<=hi))
            {
                System.out.println("indices invalid");
            }else
            {
                    for(int z = lo+1; z <= hi; z++){
                        if(c.compare(temp[lo], temp[z]) > 0){
                            T tempT = temp[lo]; 
                            temp[lo] = temp[z];
                            temp[z] = tempT;
                        }// if
                    }// for
                }//for
            } 
    public static <T> void selectionSort(T[] array, int lo, int hi, Comparator<T> c){
        for(int i = lo; i <= hi; i++){
            selectMin(array, i, hi, c);
        }// for
    }// selctionSort
} //hewwo
