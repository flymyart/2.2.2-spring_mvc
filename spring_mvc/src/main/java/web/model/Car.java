package web.model;

public class Car {

    private int series;
    private String model;
    private int price;

    public Car(int series, String model, int price) {
        this.series = series;
        this.model = model;
        this.price = price;
    }

    public int getPrice() {
        return price;
    }

    public int getSeries() {
        return series;
    }

    public String getModel() {
        return model;
    }
}
