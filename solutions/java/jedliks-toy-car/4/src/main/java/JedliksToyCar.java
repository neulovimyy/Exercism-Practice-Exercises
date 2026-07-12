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
        String output = "";
        if(batteryLevel > 0) {
            output = "Battery at " + batteryLevel + "%";
        } else if(batteryLevel == 0) {
            output = "Battery empty";
        }
        return output;
    }

    public void drive() {
        if (batteryLevel != 0) {
            distance += 20;
            batteryLevel -= 1;
        }
    }
}
