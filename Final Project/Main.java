import java.util.Random;

/**
 * Created by Lenny on 12/24/2016.
 */
public class Main
{
    public static void main(String[] args) {

        World world = World.getInstance();
        Manager manager = new Manager(world);
        GUI gui = new GUI(world);

        Random rng = new Random();

        RunEnv runThis = new RunEnv(world, manager, rng, gui);
        runThis.initSpawn();
        gui.initGUI();
        runThis.run();
    }
}