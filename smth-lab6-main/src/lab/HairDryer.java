package lab;

public class HairDryer {
    private String name;
    private String brand;
    private String colour;
    private int price;
    private double rating;

    public HairDryer(String name, String brand, String colour, int price, double rating) {
        this.name = name;
        this.brand = brand;
        this.colour = colour;
        this.price = price;
        this.rating = rating;
    }

    public String getName() {
        return name;
    }

    public String getBrand() {
        return brand;
    }

    public String getColour() {
        return colour;
    }

    public int getPrice() {
        return price;
    }

    public double getRating() {
        return rating;
    }
}

