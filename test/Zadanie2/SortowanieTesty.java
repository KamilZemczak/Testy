package Zadanie2;

import Zadanie2.Sortowanie;
import org.junit.Test;

/**
 *
 * @author Kamil Zemczak
 */
public class SortowanieTesty {
    Sortowanie sort = new Sortowanie();
    
    public SortowanieTesty() {
        sort.zapelnianieTabeli();
    }
    
    @Test(timeout = 300)
    public void testPopulateArray(){
        sort.zapelnianieTabeli();
    }
    
    @Test(timeout = 1500)
    public void testSortArray(){
        sort.zapelnianieTabeli();
    }
}