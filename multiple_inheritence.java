interface isAlive{
    abstract void breathe();

}
interface Livelife{
    abstract void breathe();

}
class Person implements isAlive,Livelife{
    public void breathe(){
        System.out.println("breathing");
    }
}

public class multiple_inheritence {
    
}
