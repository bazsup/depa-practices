package vehicle.model;

class West implements DirectionState {
    private static final West instance = new West();
    private static final Location DIRECTION = new Location(-1,0);

    static West getInstance() {
        return instance;
    }

    private West() {

    }

    @Override
    public DirectionState turnLeft() {
        return South.getInstance();
    }

    @Override
    public DirectionState turnRight() {
        return North.getInstance();
    }

    @Override
    public DirectionState uTurn() {
        return East.getInstance();
    }

    @Override
    public Location forward() { return DIRECTION; }

    @Override
    public String getDirection() {
        return "West";
    }
}
