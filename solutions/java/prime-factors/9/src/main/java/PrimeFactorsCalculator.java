import java.util.List;
import java.util.ArrayList;

class PrimeFactorsCalculator {

    List<Long> primeFactors = new ArrayList<>();
    List<Long> calculatePrimeFactorsOf(long number) {
        if(number <= 1) {
            return List.of();
        }
        divideNumber(number);
        return primeFactors;
    }

    private void divideNumber(long number) {
        if (number <= 1) {
            return;
        }
        for(long i = 2; i <= number; i++) {
            if (number % i == 0) {
                primeFactors.add(i);
                divideNumber(number/i);
            }
        }
    }

}