package Aircraft;

public class Drone extends Aircraft {
    public Drone() {
        super("Drone");
        typeOfAircraft = "Drone";
    }

    public Drone(float tank, float fuelСonsumption, short maxSpeed, String serialNumber, String nameOfAircraft) {
        super(tank, fuelСonsumption, maxSpeed, "Drone", serialNumber, nameOfAircraft);
    }

    public void action() {
        System.out.println("VVVZZZVZVVSHHHHHHHHHHHHHH (drone noises)");
    }
}
