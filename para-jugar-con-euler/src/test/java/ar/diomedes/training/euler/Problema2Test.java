package ar.diomedes.training.euler;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 * Created by diomedes on 30/07/2014.
 *
 * https://projecteuler.net/problem=2
 *

 Each new term in the Fibonacci sequence is generated by adding the previous two terms. By starting with 1 and 2, the first 10 terms will be:

 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, ...

 By considering the terms in the Fibonacci sequence whose values do not exceed four million, find the sum of the even-valued terms.
 */
public class Problema2Test {
    @Test
    public void testSumOfPrimesBelow10() {
        Problema2 problema = new Problema2();
        assertEquals(10, problema.solve(10));
        assertEquals(44, problema.solve(100));
        assertEquals(4613732, problema.solve(4000000));
    }
}