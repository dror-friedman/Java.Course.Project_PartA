public class SequentialTrafficLight extends TrafficLights {
    private int count = 0;
//
    public SequentialTrafficLight (Junction juncofTrafficLight){
        super (juncofTrafficLight);
    }

    public void switchLight() {
        setActiveRoad(getJunc().getEnteringRoads().get(count++ % getJunc().getEnteringRoads().size()));
    }

    @Override
    public String toString() {
        return "Sequential TrafficLights " + this.getJunc() + ", delay= " + this.getDelay() + ": green light on " + this.getCurrentGreen();
    }
}
