/* This file contains a single class, Car, which implements Tradable and Drivable.
 */

public class Car implements Tradable, Drivable{
    private int maxSpeed;

    /**
     * Construct a car, setting the max speed to a given value.
     *
     * @param speed the highest speed the object can achieve.
     */
    public Car(int speed) {
        this.maxSpeed = speed;
    }

    /**
     * Get the price of a car.
     */
    @Override
    public int getPrice() {
        return 100;
    }

    /**
     * Increase the max speed of the car by 1.
     */
    @Override
    public void upgradeSpeed() {
        this.maxSpeed += 1;
    }

    /**
     * Decrease the max speed of the car by 1.
     */
    @Override
    public void downgradeSpeed() {
        this.maxSpeed -= 1;
    }

    /**
     * Return the max speed of the car.
     */
    @Override
    public int getMaxSpeed() {
        return this.maxSpeed;
    }
}
