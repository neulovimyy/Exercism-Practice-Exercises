public class JedliksToyCar {

    public static int distance;
    public static int batteryLevel;
    public static JedliksToyCar buy() {
        JedliksToyCar car = new JedliksToyCar();
        car.distance = 0;
        car.batteryLevel = 100;
        return car;
    }

    public String distanceDisplay() {
        return "Driven "+ distance +" meters";
    }

    public String batteryDisplay() {
        if(batteryLevel > 0) {
            return "Battery at " + batteryLevel + "%";
        } else if(batteryLevel == 0) {
            return "Battery empty";
        }
    }

    public void drive() {
        if (batteryLevel != 0) {
            distance += 20;
            batteryLevel -= 1;
        }
    }
}
