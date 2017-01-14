package Zadanie1;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Kamil Zemczak
 */
public class RownKwadratoweTesty {
    
    public RownKwadratoweTesty() {
    }
    
    @Test(expected = IllegalArgumentException.class)
    public void testRownKwadratoweLogika(){
        RownKwadratoweLogika rk = new RownKwadratoweLogika(0, 1, 2);
    }
    
    @Test
    public void testlbPierwiastkow() {
        assertEquals(1, new RownKwadratoweLogika(1, 0, 0).lbPierwiastkow(), 0);
        assertEquals(2, new RownKwadratoweLogika(1, 0, -4).lbPierwiastkow(), 0);
        assertEquals(0, new RownKwadratoweLogika(1, 0, 4).lbPierwiastkow(), 0);
    }
    
    @Test
    public void testGetPierwiastki() {
        assertArrayEquals(new double[]{0}, new RownKwadratoweLogika(1, 0, 0).getPierwiastki(), 0);
        assertArrayEquals(new double[]{-2, 2}, new RownKwadratoweLogika(1, 0, -4).getPierwiastki(), 0);
        assertNull(new RownKwadratoweLogika(1, 0, 1).getPierwiastki());
 
    }
}
