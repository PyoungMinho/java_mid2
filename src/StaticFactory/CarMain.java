package StaticFactory;

public class CarMain {
    public static void main(String[] args) {
        Car teslaCAr = Car.barandColorOf("Tesla","oil");

        CellPhone cp1 = CellPhone.getGalaxyPhone();
        CellPhone cp2 = CellPhone.getHuaweiPhone();
        CellPhone cp3 = CellPhone.getApplePhone();
    }
}
