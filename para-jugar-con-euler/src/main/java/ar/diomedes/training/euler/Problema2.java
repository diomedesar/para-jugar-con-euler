package ar.diomedes.training.euler;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

/**
 * Created by diomedes on 30/07/2014.
 *
 * https://projecteuler.net/problem=2
 *

 Each new term in the Fibonacci sequence is generated by adding the previous two terms. By starting with 1 and 2, the first 10 terms will be:

 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, ...

 By considering the terms in the Fibonacci sequence whose values do not exceed four million, find the sum of the even-valued terms.
 */
public class Problema2 {
    private final Log LOG = LogFactory.getLog(this.getClass());

    public long solve(final int top) {

        long sum = 0;
        long valorActual = 1;
        long valorAnterior = 1;
        long fibo = 0;
        do {

            LOG.info(fibo);
            valorAnterior = valorActual;
            valorActual = fibo;
            if (fibo % 2 == 0 ) sum += fibo;
            fibo = valorActual + valorAnterior;
        } while(fibo < top); // 4000000
        return sum;
    }
}