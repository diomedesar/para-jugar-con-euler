package ar.diomedes.training.euler.auxiliar;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 * Created by diomedes on 31/07/2014.
 */
public class PrimeGeneratorTest {
    @Test
    public void testValue0() {
        PrimeGenerator primeGenerator = new PrimeGenerator();
        assertNotNull(primeGenerator);
        assertFalse(primeGenerator.isPrime(0));
    }

    @Test
    public void testValueNegative() {
        PrimeGenerator primeGenerator = new PrimeGenerator();
        assertNotNull(primeGenerator);
        assertFalse(primeGenerator.isPrime(-100));
    }

    @Test
    public void testValueFirstKnown() {
        PrimeGenerator primeGenerator = new PrimeGenerator();
        assertNotNull(primeGenerator);
        assertTrue(primeGenerator.isPrime(2));
        assertTrue(primeGenerator.isPrime(3));
        assertTrue(primeGenerator.isPrime(5));
        assertTrue(primeGenerator.isPrime(7));
        assertTrue(primeGenerator.isPrime(11));
    }

    @Test
    public void testValueWrongValues() {
        PrimeGenerator primeGenerator = new PrimeGenerator();
        assertNotNull(primeGenerator);
        assertFalse(primeGenerator.isPrime(4));
        assertFalse(primeGenerator.isPrime(6));
        assertFalse(primeGenerator.isPrime(9));
        assertFalse(primeGenerator.isPrime(10));
        assertFalse(primeGenerator.isPrime(12));
        assertFalse(primeGenerator.isPrime(15));
    }

}
