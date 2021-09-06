public class Road {
    private Junction start;
    private Junction end;
    private double len;

    public double getLength() {
        return len;
    }

    public Road(Junction start, Junction end) {
        if (start == end) {
            this.start = start;
            this.end = new Junction();
            len = this.start.calcDistance(this.end);
            start.addEnteringRoads(this);
            end.addExitingRoads(this);
            System.out.println("Road can not connect a junction to itself, " +
                    "the end of this junction has been replaced with: " + this.end);
        }
        else {
            this.start = start;
            this.end = end;
//    buildRoad(start, end);
            len = start.calcDistance(end);
            start.addExitingRoads(this);
            end.addEnteringRoads(this);
        }
    System.out.println("Creating " + this + " length is: " + len);

}
public Junction getStart() {
    return start;
}
public Junction getEnd() {
    return end;
}
    @Override
    public String toString(){
        return "Road from " + this.start + " to " + this.end;
    }
}

