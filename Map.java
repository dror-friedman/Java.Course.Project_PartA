import java.util.ArrayList;
import java.util.Random;

public class Map {
    private ArrayList <Junction> junctions = new ArrayList<Junction>();
    private ArrayList <Road> roads = new ArrayList<Road>();
    Junction length1 = new Junction();

    public Map(int num) {
        for (int i = 0; i < num; i++) {
            junctions.add(new Junction());
        }
        creatingRoads();
        creatingTrafficLight();
    }
    public Map (ArrayList <Junction> junction, ArrayList <Road> road){
        junctions = junction;
        roads = road;
        creatingTrafficLight();
    }
//    }
//    public Map (ArrayList<Junction> junctions, ArrayList<Road> roads) {


    public void creatingRoads() {
        Random random = new Random();
        for (Junction start:junctions) {
            for (Junction end:junctions){
                if ((start != end) &&random.nextBoolean()){
                    Road newRoad = new Road(start, end);
                    roads.add(newRoad);
                    start.addEnteringRoads(newRoad);
                    end.addExitingRoads(newRoad);
                }
            }
        }
    }
    public void creatingTrafficLight(){
        Random r = new Random();
        for (Junction junc : junctions) {
            if(junc.getEnteringRoads().size()>0 && r.nextBoolean()&&r.nextBoolean()){
                if (r.nextBoolean()){
                    junc.setTrafficLight(new RandomTrafficLight(junc));
                }
                else {
                    junc.setTrafficLight(new RandomTrafficLight(junc));
                }
            }
        }
    }
    public ArrayList<Junction> getJunctions() {
        return junctions;
    }

    public void setJunctions(ArrayList<Junction> junctions) {
        this.junctions = junctions;
    }
    public void randomJunction(ArrayList<Junction> junctions) {
        int counter = 0;
        ArrayList <Road> randomRoads = new ArrayList<Road>();
        Random randomJunc = new Random();
        length1 = junctions.get(randomJunc.nextInt(junctions.size())-1);
        while (!length1.getExitingRoads().isEmpty()) {
            junctions.add(length1);
            counter ++;

//            length1 = junctions.get(randomJunc.nextInt(junctions.size())-1);
//        while (counter <= 4) { //TODO: inner while - while (!length1.getExitingRoads().isEmpty())
//            length1 = junctions.get(randomJunc.nextInt(junctions.size())-1);
//            randomRoads.add(length1.getExitingRoads().);
//            if ()
            }
        }
    public ArrayList<Road> randomizeRoutes()
    {
        Random random = new Random();
        ArrayList<Road> route = new ArrayList<Road>();
        Junction randomizedJunctions;
        do
        {
            int sum= random.nextInt(junctions.size());
            randomizedJunctions = junctions.get(sum);

        }
        while(randomizedJunctions.getExitingRoads().size()==0);

        do
        {
            Road road =randomizedJunctions.getExitingRoads().get(random.nextInt(randomizedJunctions.getExitingRoads().size()));
            route.add(road);
            randomizedJunctions=road.getEnd();
        }
        while(randomizedJunctions.getExitingRoads().size()>0 && route.size()<4 );

        return route ;
    }
    }

