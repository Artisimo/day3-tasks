public class Vehicle {
    protected String brand;
    protected String color;
    protected int nrOfGears;
    protected int gear;
    protected int speed;
    protected int maxSpeed;
    protected int directionOfTravelDegrees; // 90 degrees is north, 0 degrees is east

    public Vehicle(){}

    public Vehicle(String brand, String color, int maxSpeed, int nrOfGears){
        this.brand = brand;
        this.color = color;
        this.maxSpeed = maxSpeed;
        this.nrOfGears = nrOfGears;
        this.gear = 0;
        this.speed = 0;
        this.directionOfTravelDegrees = 90;
    }

    void printProperties(){
        System.out.println('\n' + "Current speed: " + this.speed);
        if(this.gear == -1){
            System.out.println("Current gear: reverse");
        }else{
            System.out.println("Current gear: " + this.gear);
        }
        System.out.println("Max speed: " + this.maxSpeed);
        System.out.println("Number of gears: " + this.nrOfGears);
        System.out.println("Color: " + this.color);
        System.out.println("Brand: " + this.brand);
    }

    public void setGear(int n){
        if(n > nrOfGears){
            this.gear = nrOfGears;
            System.out.println(this.nrOfGears + " is the highest gear. The car is now in gear " + this.gear);
        }else if(n <= -1){
            this.gear = -1;
            System.out.println("Lowest gear is reverse. The car is now in reverse");
        }else{
            this.gear = n;
            System.out.println("The car is now in gear: " + this.gear);
        }
    }
    public void setSpeed(int n){
        if(n > maxSpeed){
            this.speed = maxSpeed;    // Cars max speed is 200 km/h
            System.out.println("Cannot go quicker than 200 km/h. Speed is now: " + this.speed);
        }else if(n < 0){
            this.speed = 0;    // Cars min speed is 0 km/h
            System.out.println("Cannot go slower than 0 km/h. Speed is now: " + this.speed);
        }else{
            this.speed = n;
            System.out.println("Speed is now: " + this.speed);
        }
    }

    public void stop(){
        this.speed = 0;
        this.gear = 0;
        System.out.println("Stopped. Speed is now: " + this.speed);
    }

    public void turnRight(){
        this.directionOfTravelDegrees = (this.directionOfTravelDegrees - 90) % 360;
        System.out.println("Turned Right, now direction of travel is " + directionOfTravelDegrees + " degrees");
    }

    public void turnLeft(){
        this.directionOfTravelDegrees =  (this.directionOfTravelDegrees + 90) % 360;;
        System.out.println("Turned left, now direction of travel is " + directionOfTravelDegrees + " degrees");
    }

    public void turnAround(){
        this.directionOfTravelDegrees =  (this.directionOfTravelDegrees + 180) % 360;;
        System.out.println("Turned around, now direction of travel is " + directionOfTravelDegrees + " degrees");
    }

    public static void main(String[] args) {
        Vehicle v = new Vehicle("BMW", "Red", 200, 6);
        v.turnAround();
        v.turnLeft();
        v.turnRight();

        v.setGear(1);
        v.setSpeed(15);
        v.setGear(2);
        v.setSpeed(40);
        v.setGear(3);
        v.setSpeed(70);
        v.setGear(0);
        v.stop();
        v.printProperties();
    }
}
