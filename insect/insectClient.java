public class InsectClient{
    public static void main(String[] args){
        Insect bug1 = new Insect(5, 100, 100);
        bug1.getWeight();
        System.out.println("original weight:" + bug1.getWeight());
        bug1.setWeight(10);
        System.out.println("new weight:" + bug1.getWeight());
        System.out.println(bug1.toString());
    }


}