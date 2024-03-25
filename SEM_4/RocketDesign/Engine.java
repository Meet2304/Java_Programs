package SEM_4.RocketDesign;

public class Engine implements RocketDesign {

    @Override
    public void specs() {
        System.out.println("Raptor Engine:");
        System.out.println("Thrust: 230 tf");
        System.out.println("Chamber Pressure: 350 bar");
    }
}
