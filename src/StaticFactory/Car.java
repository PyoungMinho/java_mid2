package StaticFactory;

public class Car {
    private String brand;
    private String fuelType;


    // private 생성자
    private Car(String brand, String fuelType) {
        this.brand = brand;
        this.fuelType = fuelType;
    }

    public static Car barandColorOf(String brand,String fuelType){

        return new Car(brand,fuelType);
    }
}
