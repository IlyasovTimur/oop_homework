package Cars;

public class Car {
    String brand;
    String model;
    double engineVolume;
    String color;
    int year;
    String country;

    public Car(double engineVolume,String color, int year) {
        this("default", "default", engineVolume, color, year, "default");
    }
    public Car(String brand, String model, double engineVolume, int year, String country) {
        this(brand, model, engineVolume, "белый", year, country);
    }

    public Car(String brand, String model, double engineVolume,String color, int year, String country) {
        this.brand = brand;
        this.model = model;
        if (engineVolume <= 0) {
            this.engineVolume = 1.5;
        } else {
            this.engineVolume = engineVolume;
        }
        this.color = color;
        if (year <= 0) {
            this.year = 2000;
        } else {
            this.year = year;
        }
        this.country = country;
    }

    @Override
    public String toString() {
        return String.format("%s %s, %d год выпуска, производство %s, цвет %s, объем двигателя %s",brand,model,year,country,color,engineVolume);
    }
}
