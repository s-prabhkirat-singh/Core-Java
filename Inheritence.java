class vehicle{
    private String Engine;
    private int  wheel;
    private String seat;
    vehicle(String Engine,int wheel, String seat){
        this.Engine=Engine;
        this.wheel=wheel;
        this.seat=seat;
    }
    vehicle(){
        System.out.println("default constructor");
    }
    String getEngine(){
        return Engine;
    }
    void run(){
        System.out.println("running vehicle");
    }
}
class car extends vehicle{
    private String headlamp;
    private String ac;

    car(){
        this. headlamp="off";
        this.ac="off";
    }
    car(String headlamp, String ac, String Engine, int wheel, String seat){
        super();
        // super(Engine,wheel,seat);
        this.headlamp=headlamp;
        this.ac=ac;
        

    }
    // @Override
    //   void run(){
    //     System.out.println("running car");
    // }
    }



public class Inheritence{
    public static void main(String[] args) {
        System.out.println("run");
        // car car= new car();
        car car= new car("on","on","start",4,"four");
        System.out.println(car.getEngine());
          car.run();
    }
  
    
}
