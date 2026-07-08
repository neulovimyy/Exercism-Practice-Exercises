public class Lasagna {

    int expectedMinutesInOven = 40;

    public int expectedMinutesInOven() {
        return expectedMinutesInOven;
    }

    public int remainingMinutesInOven(int minutes) {
        return expectedMinutesInOven() - minutes;
    }

    int preparationTimeInMinutes = 2;
    public int preparationTimeInMinutes(int layers) {
        return layers * preparationTimeInMinutes;
    }

    public int totalTimeInMinutes(int layers, int minutes) {
        return preparationTimeInMinutes(layers) + minutes;
    }
}
