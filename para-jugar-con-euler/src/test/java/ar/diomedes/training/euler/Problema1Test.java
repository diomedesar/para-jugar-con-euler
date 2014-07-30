package ar.diomedes.training.euler;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 * Created by diomedes on 30/07/2014.
 *
 * https://projecteuler.net/problem=1
 *
 * If we list all the natural numbers below 10 that are multiples of 3 or 5, we get 3, 5, 6 and 9. The sum of these multiples is 23.
 *
 * Find the sum of all the multiples of 3 or 5 below 1000.
 */
public class Problema1Test {

    @Test
    public void testSumOfPrimesBelow10() {
        Problema1 problema = new Problema1();
        assertEquals(23, problema.solve(10));
        assertEquals(0, problema.solve(0));
        assertEquals(233168, problema.solve(1000));
        assertEquals(0, problema.solve(1));


    }
}
