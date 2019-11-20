package vehicle.model;

interface DirectionState {
    DirectionState turnLeft();
    DirectionState turnRight();
    DirectionState uTurn();
    Location forward();
    String getDirection();
}
