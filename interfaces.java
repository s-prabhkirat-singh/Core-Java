interface Phone{
    // String processor;   we cannot define a property by using interfaces 
    String processor();
    String os();
    int ram();

}
class S20 implements Phone{
    @Override
    public String processor() {
        
        return "Snapdragon 865";
    }
    public String os(){
        return "Android";
    }
    public int ram(){
        return 8;
    }
    
}
class appleI14 implements Phone{
    @Override
    public String processor() {
        
        return "A11";
    }
    public String os(){
        return "ios";
    }
    public int ram(){
        return 8;
    }
    
}


public class interfaces {
    public static void main(String[] args) {
        
    
    Phone s= new S20();
    Phone A= new appleI14();
    S20 c= new S20();
    System.out.println(s.os());
    System.out.println(c.os());
    }

}
