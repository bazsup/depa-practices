package vehicle.model;

class North implements DirectionState {
    private static North instance;
    private static final Location DIRECTION = new Location(0,1);

    static North getInstance() {
        if (instance == null) {
            instance = new North();
        }
        return instance;
    }

    private North() {

    }

    @Override
    public DirectionState turnLeft() {
        return West.getInstance();
    }

    @Override
    public DirectionState turnRight() {
        return East.getInstance();
    }

    @Override
    public DirectionState uTurn() {
        return South.getInstance();
    }

    @Override
    public Location forward() { return DIRECTION; }

    @Override
    public String getDirection() {
        return "North";
    }
}
