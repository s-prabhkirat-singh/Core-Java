class Car {
        private String Door;
        private String engine;
        private String Driver;
        private int speed;

        public void setspeed(int speed) {
            this.speed = speed;
        }

        public int getSpeed() {
            return speed;
        }

    }
public class classe {
  

    public static void main(String[] args) {
        Car car = new Car();
        car.setspeed(100);
        System.out.println(car.getSpeed());

    }
}
