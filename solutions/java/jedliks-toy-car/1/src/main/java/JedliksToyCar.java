public class JedliksToyCar {

    int distance;
    int batteryLevel;
    public static JedliksToyCar buy() {
        this.batteryLevel = 100;
        this.distance = 0;
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
