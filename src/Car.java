public class Car {
    private int price;
    private int speed;
    private int maxspeed;

    public Car(int price, int speed, int maxspeed) {
        this.price = price;
        this.speed = speed;
        this.maxspeed = maxspeed;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getSpeed() {
        return speed;
    }

    public int getMaxspeed() {
        return maxspeed;
    }
    public void setMaxspeed(int speed) {
        this.speed = speed;
    }
    @Override
    public String toString(){
        return "Car {" + "price =" + price +
                "speed =" + speed + "maxspeed =" + maxspeed + "}";
    }
}
