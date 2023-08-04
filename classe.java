class Car {
        private String Door;
        private String Engine;
        private String Driver;
        private int speed;
        
        public void setspeed(int speed) {
            this.speed = speed;
        }

        public int getSpeed() {
            return speed;
        }
        public void setDoor(String Door) {
            this.Door = Door;
        }

        public String getDoor() {
            return Door;
        }
        public void setEngine(String Engine) {
            this.Engine = Engine;
        }

        public String getDriver() {
            return Driver;
        }
        public void setDriver(String Driver) {
            this.Driver = Driver;
        }

        public String getEngine() {
            return Engine;
        }

        public String run(){
            if(Door.equals("closed") && Engine.equals("on") && Driver.equals("seated") && (speed !=0)){
                return "car is running";

            }else{
                return "not moving";
            }
        }

    }
public class classe {
  

    public static void main(String[] args) throws NullPointerException {
        Car car = new Car();
        // car.setspeed(100);
        car.setDoor("closed");
        car.setEngine("on");
        car.setDriver("seated");
        // System.out.println(car.getSpeed());
        System.out.println(car.run());


    }
}
