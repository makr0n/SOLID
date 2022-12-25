public class Pickup extends Car implements iRefueling, iWipe {
    private int loadCapacity;

    public int getLoadCapacity() {
        return loadCapacity;
    }

    public void setLoadCapacity(int loadCapacity) {
        this.loadCapacity = loadCapacity;
    }

    @Override
    public TypeFuel fuel() {

        return null;
    }

    @Override
    public void wipeWindshield() {

    }

    @Override
    public void wipeHeadlights() {

    }

    @Override
    public void wipeMirrors() {

    }

    public Pickup(int loadCapacity) {
        this.loadCapacity = loadCapacity;
    }
}
