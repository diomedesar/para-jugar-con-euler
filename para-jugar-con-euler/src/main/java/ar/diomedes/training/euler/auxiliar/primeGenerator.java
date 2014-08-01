package ar.diomedes.training.euler.auxiliar;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

/**
 * Created by diomedes on 31/07/2014.
 */
public class PrimeGenerator {
    private final Log LOG = LogFactory.getLog(this.getClass());

    public void primes(long top) {
        long value = 0;
        long prime = 0;
        while (value <= top) {
            if (isPrime(value)) {
                prime = value;
                LOG.info(prime);
            }

            value++;
        }
    }

    public boolean isPrime(long value) {
        LOG.info("por evaluar " + value);
        boolean salida = false;
        if (value == 2 || value == 3) {
            LOG.info("Es 2, sale con true");
            salida=true;
        }
        if (value < 2 ) {
            LOG.info("Es menor de 2, sale con false");
            salida=false;
        } else {
            LOG.info("Es mayor de 2, itera");
            for (long i = value -1 ; i > 3; i--) {
                LOG.info("\tEvalua si el módulo de " + value + " por " + i + " es 0");
                if (value % i == 0 ) {
                    LOG.info("\t\tEs 0, encontró un divisor y sale por false");
                    salida = false;
                } else {
                    LOG.info("\t\tNo es 0, vuelve a correr con " + i);
                    if (isPrime(i)) salida = true; else salida = false;
                }
            }
        }

        return salida;
    }
}
