package ar.diomedes.training.euler;

import java.util.logging.Logger;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

/**
 * Created by diomedes on 30/07/2014.
 *
 * https://projecteuler.net/problem=1
 *
 * If we list all the natural numbers below 10 that are multiples of 3 or 5, we get 3, 5, 6 and 9. The sum of these multiples is 23.
 *
 * Find the sum of all the multiples of 3 or 5 below 1000.
 */
public class Problema1 {
    private final Log LOG = LogFactory.getLog(this.getClass());

    public int solve(int top) {
        int sum = 0;
        for (int i = 3; i < top; i++) {
            // LOG.info("por evaluar " + i);
            if (i % 3 == 0 || i % 5 == 0) sum += i;
        }
        LOG.info("resultado = " + sum);
        return sum;
    }
}