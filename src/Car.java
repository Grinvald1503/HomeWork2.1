public class Car {
    private String brand;
    private String model;
    private double engineVolume;
    private String color;
    private int year;
    private String country;

    public Car(String brand, String model, double engineVolume, String color, int year, String country) {

        if (brand == null) {
            this.brand = "default";
        } else {
            this.brand = brand;
        }

        if (model == null) {
            this.model = "default";
        } else {
            this.model = model;
        }
        if (country == null) {
            this.country = "default";
        } else {
            this.country = country;
        }
        if (engineVolume <= 0) {
            this.engineVolume = 1.5;
        } else {
            this.engineVolume = engineVolume;
        }
        if (color == null) {
            this.color = "Белый";
        } else {
            this.color = color;
        }
        if (year <= 0) {
            this.year = 2000;
        } else {
            this.year = year;
        }
    }

    @Override
    public String toString() {
        return "Марка - " + brand + ", Модель - " + model + ", Обём двигателя в литрах - " + engineVolume + ", Цвет авто - " + color + ", Год производства - " + year + ", Страна производства - " + country + ".";
    }
}
