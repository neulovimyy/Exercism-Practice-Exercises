public class EliudsEggs {

    public int eggCount(int number) {
        int count = 0;
        int currentNumber = number;

        while (currentNumber > 0) {
            long bitCount = 1;

            while ((bitCount << 1) <= currentNumber) {
                System.out.println("Bit: " + bitCount);
                bitCount <<= 1;
            }
            System.out.println("Current Count: " + currentNumber);

            currentNumber -= (int) bitCount;
            count++;
        }

        return count;
    }
}
