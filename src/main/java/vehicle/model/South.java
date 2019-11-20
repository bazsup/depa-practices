package vehicle.model;

class South implements DirectionState {
    private static South instance;
    private static final Location DIRECTION = new Location(0,-1);

    static South getInstance() {
        if (instance == null) {
            instance = new South();
        }
        return instance;
    }

    private South() {

    }

    @Override
    public DirectionState turnLeft() {
        return East.getInstance();
    }

    @Override
    public DirectionState turnRight() {
        return West.getInstance();
    }

    @Override
    public DirectionState uTurn() {
        return North.getInstance();
    }

    @Override
    public Location forward() { return DIRECTION; }

    @Override
    public String getDirection() {
        return "South";
    }
}
