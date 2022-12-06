package Aircraft;

public class PuddleJumper extends Aircraft{
    public PuddleJumper() {
        super("Puddle Jumper");
    }

    public PuddleJumper(float tank, float fuelСonsumption, short maxSpeed, String serialNumber, String nameOfAircraft) {
        super(tank, fuelСonsumption, maxSpeed, "Puddle Jumper", serialNumber, nameOfAircraft);
    }

    public void action() {
        System.out.println("Brbrbrbrbrbrrrrrrbbbbrrrrbrbrbr (rotor noise)");
    }
}
