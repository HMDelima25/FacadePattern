public class TV implements HomeService {
    @Override
    public void turnOn() {
        System.out.println("TV is on.");
    }


    @Override
    public void turnOff() {
        System.out.println("TV is off.");
    }
}


