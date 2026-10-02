public class HomeApp {
    public static void main(String[] args) {
        HomeInterface home = new HomeInterface();


        System.out.println("Turning on all services...");
        home.turnOnAll();


        System.out.println("\nTurning off the lights only...");
        home.turnOffLight();


        System.out.println("\nTurning on the TV...");
        home.turnOnTV();


        System.out.println("\nTurning off all services...");
        home.turnOffAll();
    }
}
