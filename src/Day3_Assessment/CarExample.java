package Day3_Assessment;

class Base_Car {
    private boolean engineOn;
    private double speed;
    private double fuelLevel = 100.0;

    public void drive() {
        if (fuelLevel > 0) {
            engineOn = true;
            speed = 60;
            fuelLevel -= 10;
            System.out.println("Car is running at " + this.speed + " kmph." );
            System.out.println("Remaining feulLevel: " + this.fuelLevel);
        } else {
            engineOn = false;
            speed = 0;
            System.out.println("Out of fuel!");
        }
    }
}

public class CarExample {
	public static void main(String[] args) {
		Base_Car c = new Base_Car();
		c.drive();
	}
}
