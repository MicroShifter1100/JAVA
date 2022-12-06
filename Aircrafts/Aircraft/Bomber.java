package Aircraft;

public class Bomber extends Aircraft{
    private short numberOfBombs;

    public Bomber() {
        super("Bomber");
        numberOfBombs = 10;
    }

    public Bomber(float tank, float fuelСonsumption, short maxSpeed, String serialNumber, String nameOfAircraft, short numOfBombs) {
        super(tank, fuelСonsumption, maxSpeed, "Boomber", serialNumber, nameOfAircraft);
        this.numberOfBombs = numOfBombs;
    }

    public void action() {
        if (numberOfBombs > 0) {
            this.numberOfBombs--;
            System.out.println("They were all dead. The final bomb was an exclamation mark to everything that had led\n" +
                    "to this point. I released my finger from the trigger. And then it was over.");
        } else {
            System.out.println("We won't live until dawn");
        }
    }
}
