import java.util.ArrayList;
import java.util.Random;

public class RandomTrafficLight extends TrafficLights {

    public RandomTrafficLight(Junction junc) {
        super(junc);
    }

    public void switchLight() {
        Random random = new Random();
        int collect = random.nextInt(getJunc().getEnteringRoads().size());
        setActiveRoad(getJunc().getEnteringRoads().get(collect));
    }
    public String toString() {
        return "Random TrafficLights " + this.getJunc() + ", delay= " + this.getDelay() + ": green light on " + this.getCurrentGreen() ;
    }
}
