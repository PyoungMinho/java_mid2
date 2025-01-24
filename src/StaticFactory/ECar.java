package StaticFactory;

public class ECar extends CarType {
    @Override
    public void drive() {
        System.out.println("Driving an electric car!");
    }
}
