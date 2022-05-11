public class Car extends Vehicle{
    protected String model;
    public Car(){};
    public Car(String brand, String color, int topSpeed, int nrOfGears, String model){
        super(brand, color, topSpeed, nrOfGears);
        this.model = model;
    }
    public void printProperties(){
        super.printProperties();
        System.out.println("Model: " + this.model);
    }

    public static void main(String[] args) {
        Car car = new Car("BMW", "Red", 200, 6,"335i");
        car.printProperties();
        car.setGear(-1);
        car.setSpeed(10);
        car.stop();
        car.setGear(1);
        car.setSpeed(50);
        car.setGear(2);
        car.turnLeft();
        car.stop();
        car.printProperties();
    }
}
