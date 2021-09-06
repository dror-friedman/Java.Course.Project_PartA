import java.util.ArrayList;
import java.util.Random;

public class Vehicle {

    private int speed;
    private ArrayList<Road> route = new ArrayList<>();
    private double distance;
    private int roadID = 0;

    public ArrayList<Road> getRoute() {
        return route;
    }

    private static int vehicleID = 0;


    public Vehicle (Map map) {
        Random random = new Random();
        speed = random.nextInt(91) + 30;
        route = map.randomizeRoutes();
        distance = route.get(roadID).getLength();
        ++vehicleID;
        System.out.println("Creating Vehicle " + this);
    }

    public void move() {
        if (distance == 0 && route.size()-1 == roadID) {
            System.out.println("Vehicle " + vehicleID + " arrived to it's destination: " + route.get(roadID).getEnd());
            return;
        }
        if (distance == 0 && route.size()-1 > roadID) {
            roadID++;
            distance = route.get(roadID).getLength();
        }
        if (distance > 0){
            distance -= speed;
            if (distance < 0){
                distance = 0;
            }
            System.out.println("Vehicle "+ vehicleID + " is moving on the " + route.get(roadID));
        }
    }

    public int getSpeed() {
        return speed;
    }

    public String toString() {
        return vehicleID+ " , speed: " + this.getSpeed()+ " path: "+ this.getRoute() ;
    }
}


