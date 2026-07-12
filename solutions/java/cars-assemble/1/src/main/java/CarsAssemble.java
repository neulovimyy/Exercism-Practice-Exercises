public class CarsAssemble {

    private static final double PRODUCTION_RATE = 221;

    public double productionRatePerHour(int speed) {
        double successRate = 0;
        if (speed > 0 && speed <=4) {
            successRate = 1;
        } else if (speed >=5 && speed <=8) {
            successRate = 0.9;
        } else if (speed == 9) {
            successRate = 0.8;
        } else if (speed == 10) {
            successRate = 0.77;
        }
        return PRODUCTION_RATE * speed * successRate;
    }

    public int workingItemsPerMinute(int speed) {
        double productionRate = productionRatePerHour(speed);
        return (int) (productionRate / 60);
    }
}
