package Zadanie2;

import java.util.Arrays;
import java.util.Random;

/**
 *
 * @author Kamil Zemczak
 */
public class Sortowanie {
    private int[] arr;
    private int size = 10000000;
    
    
    public void zapelnianieTabeli() {
        arr = new int[size];
        Random rnd = new Random();
        
        for(int i = 0; i < size; i++)
            arr[i] = rnd.nextInt();
    }
    
    public void sortowanie() {
        Arrays.sort(arr);
    }
    
     public static void main(String[] args) {
        Sortowanie sort = new Sortowanie();
        
        sort.zapelnianieTabeli();
        System.out.println("Tabliza zapełniona.");
        sort.zapelnianieTabeli();
        System.out.println("Tablica posortowana.");
        
    }    
}
