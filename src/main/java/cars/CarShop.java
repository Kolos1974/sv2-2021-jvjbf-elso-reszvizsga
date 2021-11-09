package cars;

import java.util.ArrayList;
import java.util.List;

public class CarShop {
    private String name;
    private long maxPrice;
    private List<Car> carsForSell = new ArrayList<>();

    public CarShop(String name, long maxPrice) {
        this.name = name;
        this.maxPrice = maxPrice;
    }

    public String getName() {
        return name;
    }

    public long getMaxPrice() {
        return maxPrice;
    }

    public List<Car> getCarsForSell() {
        return carsForSell;
    }

    public boolean addCar(Car car){
        if (car.getPrice()<=maxPrice){
            carsForSell.add(car);
            return true;
        }
        return false;
    }

    public int sumCarPrice(){
        long sum = 0;
        for (Car element: carsForSell){
            sum += element.getPrice();
        }
        return (int) sum;
    }

    public int numberOfCarsCheaperThan(int price){
        int result = 0;
        for (Car element: carsForSell){
            if (element.getPrice()<=price){
                result++;
            }
        }
        return result;
    }

    public List<Car> carsWithBrand(String brand){
        List<Car> result = new ArrayList<>();
        for (Car element: carsForSell){
            if (element.getBrand().equals(brand)){
                result.add(element);
            }
        }
        return result;
    }

}
