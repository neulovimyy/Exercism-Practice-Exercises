import java.util.List;

class PrimeFactorsCalculator {

    List<Integer> primeFactors;
    List<Long> calculatePrimeFactorsOf(long number) {
        if(number <= 1) {
            return List.of();
        }
        divideNumber(number);
        return primeFactors;
    }

    long divideNumber(number) {
        for(int i = 2; i <= number; i++) {
            if (number % i == 0) {
                primeFactors.add(i);
                divideNumber(number/i);
            }
        }
    }

}