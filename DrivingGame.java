import java.util.ArrayList;

public class DrivingGame {
    Map map;
    ArrayList <Vehicle> vehicles = new ArrayList<Vehicle>();


    public DrivingGame(int junction, int vehicle) {
        map = new Map(junction);
        for (int i = 0; i < vehicle; i++) {
            vehicles.add(new Vehicle(map));
        }
    }
    public void play (int turns) {
        ArrayList <TrafficLights> trafficLights = new ArrayList<TrafficLights>();
        for (Junction junc1 : map.getJunctions()) {
            if (junc1.getTrafficLight() != null) {
                trafficLights.add(junc1.getTrafficLight());
            }
        }
        for (int i = 1; i <= turns; i++) {
            System.out.println("Turn " + i);
            for (int x = 0; x< vehicles.size(); x++) {
                vehicles.get(x).move();
            }
            for (TrafficLights trafficLights1 : trafficLights) {
                trafficLights1.check();
            }
        }
    }
}
