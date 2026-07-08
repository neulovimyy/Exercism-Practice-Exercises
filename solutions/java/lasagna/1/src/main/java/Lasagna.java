public class Lasagna {

    // TODO: define the 'expectedMinutesInOven()' method
    int expectedMinutesInOven = 40;

    int expectedMinutesInOven() {
        return expectedMinutesInOven;
    }

    // TODO: define the 'remainingMinutesInOven()' method
    int remainingMinutesInOven(int minutes) {
        return expectedMinutesInOven - minutes;
    }

    int preparationTimeInMinutes = 2;
    // TODO: define the 'preparationTimeInMinutes()' method
    int preparationTimeInMinutes(int layers) {
        return layers * preparationTimeInMinutes;
    }

    // TODO: define the 'totalTimeInMinutes()' method
    int totalTimeInMinutes(int layers, int minutes) {
        return (preparationTimeInMinutes * layers) + minutes;
    }
}
