import java.util.Random;

public class Point {
    Random myRandom = new Random();
    double x;
    double y;
    final int maxX = 800;
    final int maxY = 600;

    public Point(double x,double y){
        this.x = x;
        this.y = y;
        if (!checkNum(x, 0, maxX)){
            this.x = myRandom.nextDouble()*maxX;
            System.out.println("The value"+ x + "is illegal and has been replaced with " + this.x );
        }
        //TODO: the same for y
        if (!checkNum(y, 0, maxY)){
            this.y = myRandom.nextDouble()*maxY;
            System.out.println("The value"+ y + "is illegal and has been replaced with " + this.y );
        }
        System.out.print(create());
    }

    private boolean checkNum(double num, double min, double max){
        if(num<min || num > max)
            return false;
        return true;
    }

    public Point(){
        x = myRandom.nextDouble()*maxX;
        y = myRandom.nextDouble()*maxY;
        System.out.print(create());
    }

    public double calcDistance(Point other){
//        double dx=other.x-this.x;
//        double dy=other.y-this.y;
//        double result=Math.sqrt(dx*dx+dy*dy);
//        return result;
        return Math.sqrt(Math.pow(other.x-this.x, 2)+(Math.pow(other.y-this.y, 2)));
    }
    @Override
    public String toString(){
        return "Point (" + x + ", " + y + ")";
    }

    protected String create() {
        return ("Creating " + this.toString() + "\n");
    }
}
