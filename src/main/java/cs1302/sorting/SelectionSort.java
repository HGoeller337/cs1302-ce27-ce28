package cs1302.sorting;

import java.util.Comparator;
public class SelectionSort{

    public static void main (String[] args){
        int[] test = {1, 3, 5, 7, 8, 2, 9};
        for(int i = 0; i < test.length; i++){
            System.out.println(test[i]);
        }// for 
        selectMin(test, 2, 5, new Comparator());
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
                for(int i = lo; i < hi; i++)
                {
                    for(int z = i+1; z < hi; z++){
                        if(c.compare(temp[i], temp[z]) > 0){
                            T tempT = temp[i]; 
                            temp[i] = temp[z];
                            temp[z] = tempT;
                        }// if
                    }// for
                }//for
            } 

        }
    
} //hewwo
