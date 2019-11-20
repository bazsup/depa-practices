package vehicle.model;

public class Vehicle {
    private Location location;
    private DirectionState directionState;

    public Vehicle() {
        this.directionState = North.getInstance();
        this.location = new Location(0, 0);
    }

    public void move(int distance) {
        this.location.move(distance, directionState.forward());
    }

    public void turnLeft() {
        directionState = directionState.turnLeft();
    }

    public void turnRight() {
        directionState = directionState.turnRight();
    }

    public void uTurn() {
        directionState = directionState.uTurn();
    }

    public String getCurrentLocation() {
        return this.location.toString();
    }

    public String getDirection () {
        return directionState.getDirection();
    }
}
