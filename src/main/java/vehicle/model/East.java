package vehicle.model;

class East implements DirectionState {
    private static East instance;
    private static final Location DIRECTION = new Location(1,0);

    static East getInstance() {
        if (instance == null) {
            instance = new East();
        }
        return instance;
    }

    private East() {

    }

    @Override
    public DirectionState turnLeft() {
        return North.getInstance();
    }

    @Override
    public DirectionState turnRight() {
        return South.getInstance();
    }

    @Override
    public DirectionState uTurn() {
        return West.getInstance();
    }

    @Override
    public Location forward() { return DIRECTION; }

    @Override
    public String getDirection() {
        return "East";
    }
}
