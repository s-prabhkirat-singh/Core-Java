class Door{
    private Lock lock;
    Door(){
        lock= new Lock(true);
    }
    Door(boolean locka){
        lock= new Lock(locka);
    }
    void shopStatus(){
        if(lock.isLock()){
            System.out.println("Sorry, the shop is closed right now.");
        }
        else{
            System.out.println("You are welcome in our shop");
        }
    }
    public Lock getLock() {
		return lock;
	}
    class Lock{
        private boolean lock;
        Lock(boolean lock){
            this.lock=lock;
        }
        boolean isLock(){
            return lock;
        }
        void setLock(boolean lock){
            this.lock=lock;

        }
    }
}


public class inner_class {
    public static void main(String[] args) {
        Door door= new Door(false);
        door.shopStatus();
        door.getLock().setLock(true);
             door.shopStatus();
    }
}
