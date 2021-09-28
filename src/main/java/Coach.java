/**
 * A class that implements Drivable and Tradable.
 */
public class Coach implements Drivable, Tradable {
    private int maxSpeed;

    /**
     * Creates a new Coach object.
     */
    public Coach() {
        this.maxSpeed = 1;
    }

    /**
     * Increase the maximum speed of this Coach.
     */
    @Override
    public void upgradeSpeed() {
        this.maxSpeed++;
    }

    /**
     * Decrease the maximum speed of this Coach.
     */
    @Override
    public void downgradeSpeed() {
        this.maxSpeed--;
    }

    /**
     * Return the maximum speed of this Coach.
     *
     * @return the current maximum speed of this Coach.
     */
    @Override
    public int getMaxSpeed() {
        return maxSpeed;
    }

    /**
     * Return the price of this Coach.
     *
     * @return the price of this Coach.
     */
    @Override
    public int getPrice() {
        return 10;
    }

    /**
     * Return a string representation of this Coach.
     *
     * @return the ID and maximum speed of this Coach.
     */
    @Override
    public String toString(){
        String id = super.toString();
        return id + "(Max speed: " + this.maxSpeed + ")";
    }
}
