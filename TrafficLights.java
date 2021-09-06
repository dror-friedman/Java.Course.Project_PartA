import java.util.Random;

public abstract class TrafficLights {
    private int delay;
    private int turns = 0;
    private Junction junc;
    private Road activeRoad;

    public TrafficLights(Junction junc) {
        this.junc = junc;
        Random rand = new Random();
        delay = rand.nextInt(3) + 2;
        this.switchLight();
        System.out.println(this);
    }


    public abstract void switchLight();

    public void setActiveRoad(Road activeRoad) {
        this.activeRoad = activeRoad;
    }

    public Junction getJunc() {
        return junc;
    }

    public void check() {
        turns ++;
        if (turns%delay == 0) {
            switchLight();
            System.out.println(this);
        }
    }
//    public TrafficLights(Junction junc) {
//        Random random = new Random();
//        delay = random.nextInt(3) + 2;
//    }
    public Road getCurrentGreen(){
        return activeRoad;
    }
//    public void setCurrentGreen(Road road) {
//        this.road = Road;
//    }
    public int getDelay() {
        return delay;
    }
    public int getTurns() {
        return turns;
    }
}
