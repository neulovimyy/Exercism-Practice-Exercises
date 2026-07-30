class ProductionRemoteControlCar implements RemoteControlCar, Comparable{

    int distanceTravelled;
    int numberOfVictories;

    @Override
    public void drive() {
        distanceTravelled += 10;
    }

    @Override
    public int getDistanceTravelled() {
        return distanceTravelled;
    }

    public int getNumberOfVictories() {
        return numberOfVictories;
    }

    public void setNumberOfVictories(int numberOfVictories) {
        this.numberOfVictories = numberOfVictories;
    }

    @Override
    public int compareTo(Object o) {
        ProductionRemoteControlCar other = (ProductionRemoteControlCar) o;
        return Integer.compare(this.numberOfVictories, other.numberOfVictories);
    }
}
