package vehicle.model;

class Location {
    private int x;
    private int y;

    public Location(int x, int y) {
        this.x = x;
        this.y = y;
    }

    void move(int distance, Location direction) {
        this.x += direction.x * distance;
        this.y += direction.y * distance;
    }

    @Override
    public String toString() {
        return x + ", " + y;
    }
}
