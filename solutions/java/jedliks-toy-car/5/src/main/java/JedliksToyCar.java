public class JedliksToyCar {

    int distance = 0;
    int batteryLevel = 100;

    public static JedliksToyCar buy() {
        return new JedliksToyCar();
    }

    public String distanceDisplay() {
        return "Driven "+ this.distance +" meters";
    }

    public String batteryDisplay() {
        String output = "";
        if(this.batteryLevel > 0) {
            output = "Battery at " + this.batteryLevel + "%";
        } else if(this.batteryLevel == 0) {
            output = "Battery empty";
        }
        return output;
    }

    public void drive() {
        if (this.batteryLevel != 0) {
            this.distance += 20;
            this.batteryLevel -= 1;
        }
    }
}
