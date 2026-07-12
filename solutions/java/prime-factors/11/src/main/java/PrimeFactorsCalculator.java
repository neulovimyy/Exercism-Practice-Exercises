import java.util.List;
import java.util.ArrayList;

class PrimeFactorsCalculator {

    public List<Long> calculatePrimeFactorsOf(long number) {
        List<Long> primeFactors = new ArrayList<>();
        divideNumber(number, primeFactors);
        return primeFactors;
    }

    private void divideNumber(long number, List<Long> primeFactors) {
        if (number <= 1) {
            return;
        }
        for(long i = 2; i * i <= number; i++) {
            if (number % i == 0) {
                primeFactors.add(i);
                if (number / i > 1) {
                    divideNumber(number/i, primeFactors);
                    return;
                }
            }
        }
        primeFactors.add(number);
    }

}