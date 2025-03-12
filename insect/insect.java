public class insect {

    public static final int DEAFAULT_X = 0;
    public static final int DEFAULT_Y = 0;
    public static final double DIST_WEIGHT_LOSS_FACTOR = 0.0001;

    private double weight;
    private int x;
    private int y;

    private static int population = 0;

    //public insect(double initWeight){
        //this(initWeight, DEFAULT_X, DEFAULT_Y);
    //}

    public insect(double weight, int x, int y){
        this.weight = weight;
        this.x = x;
        this.y = y;
        population++;
    }

    public static void main(String[] args){
        
    }

    public void BugUpdate(){
        System.out.println(this.weight);

    }

    public double getWeight(){
        return weight;
    }

    public void setWeight(double newWeight){
        if (newWeight > 0){
            weight = newWeight;
        }
    }

    public String toString(){
        return ("Weight: " + weight + ", X: " + x + ", Y: " + y);
    }

}