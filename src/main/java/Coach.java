public class Coach implements Drivable, Tradable {
    private int maxSpeed;

    public Coach() {
        this.maxSpeed = 1;
    }

    @Override
    public void upgradeSpeed() {
        this.maxSpeed++;
    }

    @Override
    public void downgradeSpeed() {
        this.maxSpeed--;
    }

    @Override
    public int getMaxSpeed() {
        return maxSpeed;
    }

    @Override
    public int getPrice() {
        return 10;
    }

    @Override
    public String toString(){
        String id = super.toString();
        return id + "(Max speed: " + this.maxSpeed + ")";
    }
}
