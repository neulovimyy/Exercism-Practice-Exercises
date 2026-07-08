public class Lasagna {

    // TODO: define the 'expectedMinutesInOven()' method
    int expectedMinutesInOven = 40;

    public int expectedMinutesInOven() {
        return expectedMinutesInOven;
    }

    // TODO: define the 'remainingMinutesInOven()' method
    public int remainingMinutesInOven(int minutes) {
        return expectedMinutesInOven - minutes;
    }

    int preparationTimeInMinutes = 2;
    // TODO: define the 'preparationTimeInMinutes()' method
    public int preparationTimeInMinutes(int layers) {
        return layers * preparationTimeInMinutes;
    }

    // TODO: define the 'totalTimeInMinutes()' method
    public int totalTimeInMinutes(int layers, int minutes) {
        return (preparationTimeInMinutes * layers) + minutes;
    }
}
