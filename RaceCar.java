public class RaceCar extends Car{
    protected int tyreWearPercent;

    public RaceCar(String brand, String color, int maxSpeed, int nrOfGears, String model, int tyreWearPercent){
        super(brand, color, maxSpeed, nrOfGears, model);

        if(tyreWearPercent > 100){
            this.tyreWearPercent = 100;
        }else if(tyreWearPercent < 0){
            this.tyreWearPercent = 0;
        }else{
            this.tyreWearPercent = tyreWearPercent;
        }
    }

    public void printProperties(){
        super.printProperties();
        System.out.println("Tyre health: " + this.tyreWearPercent +  "%" + '\n');
    }

    public void powerSlide(){
        if(tyreWearPercent - 5 <= 0){
            this.tyreWearPercent = 0;
            System.out.println("Lost grip and did a powerslide, tyre wear percent decreased by 5%. Tyres are at: " + this.tyreWearPercent + "%. Need a pitstop ASAP");
        }else{
            this.tyreWearPercent -= 5;
            System.out.println("Lost grip and did a powerslide, tyre wear percent decreased by 5%. Tyres are at: " + this.tyreWearPercent + "%");
        }
    }

    public void pitStop(){
        this.tyreWearPercent = 100;
        System.out.println("Put on new tires, now they are at " + this.tyreWearPercent);
    }

    public static void main(String[] args) {
        RaceCar raceCar = new RaceCar("Ferrari", "Red", 365, 8, "SF90", 10);
        raceCar.setGear(7);
        raceCar.setSpeed(300);
        raceCar.setSpeed(85);
        raceCar.setGear(2);
        raceCar.turnLeft();
        raceCar.powerSlide();
        raceCar.setGear(7);
        raceCar.setSpeed(300);
        raceCar.turnRight();
        raceCar.powerSlide();
        raceCar.pitStop();
        raceCar.turnLeft();
        raceCar.powerSlide();
        raceCar.printProperties();
    }
}
