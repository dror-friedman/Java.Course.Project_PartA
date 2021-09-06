import java.util.ArrayList;

public class Junction extends Point {
    private ArrayList<Road> enteringRoads = new ArrayList<Road>();
    private ArrayList<Road> exitingRoads = new ArrayList<Road>();
    private TrafficLights trafficLight = null;
    private static int counter = 1;
    private int id;

    public void addEnteringRoads(Road a) {
        enteringRoads.add(a);
    }

    public void addExitingRoads(Road a) {
        exitingRoads.add(a);
    }

    public TrafficLights getTrafficLight() {
        return trafficLight;
    }

    public ArrayList<Road> getEnteringRoads() {
        return this.enteringRoads;
    }

    public ArrayList<Road> getExitingRoads() {
        return this.exitingRoads;
    }


    public Junction() {
        super();
        id = counter++;
        System.out.println("Creating " + this + " at " + super.toString());
    }

    public Junction(double x, double y) {
        super(x, y);
        id = counter++;
        System.out.println("Creating " + this + " at " + super.toString());

    }

    public void setTrafficLight(TrafficLights trafficLight) {
        this.trafficLight = trafficLight;
    }

    @Override
    public String toString() {
        return "Junction " + id;
    }

    @Override
    public String create() {
        return "";
    }
}

