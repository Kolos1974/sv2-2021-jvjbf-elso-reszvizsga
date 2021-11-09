package cars;

public class Car {
    private String brand;
    private double engineSize;
    private Color color;
    private long price;

    public Car(String brand, double engineSize, Color color, long price) {
        this.brand = brand;
        this.engineSize = engineSize;
        this.color = color;
        this.price = price;
    }

    public String getBrand() {
        return brand;
    }

    public double getEngineSize() {
        return engineSize;
    }

    public Color getColor() {
        return color;
    }

    public long getPrice() {
        return price;
    }

    public void decreasePrice(int percent){
        // Többféle számítási módszer:
        // price = (long) (price-(price * percent / 100));
        price = (long) (price * ((100 - percent) / 100.0));
    }
}
