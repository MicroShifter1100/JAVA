package Aircraft;

public class Aircraft {
    protected float tank;
    protected float fuelСonsumption; // l/1000km
    private short maxSpeed;
    private String nameOfAircraft;
    protected String typeOfAircraft;
    private String serialNumber;
    private String currentLocation;

    public void fly(float distance, String endLocation) {
        this.tank -= distance/1000 * this.fuelСonsumption;
        this.currentLocation = endLocation;
    }

    public void refuel(float additional_fuel) {
        this.tank += additional_fuel;
    }

    public Aircraft(String typeOfAircraft) {
        this.tank = 1000;
        this.fuelСonsumption = 250;
        this.maxSpeed = 300;
        this.typeOfAircraft = typeOfAircraft;
        this.serialNumber = "UNDEFINED";
        this.nameOfAircraft = "UNDEFINED";
        this.currentLocation = "Moscow";
    }

    public Aircraft(float tank, float fuelСonsumption, short maxSpeed) {
        this.tank = tank;
        this.fuelСonsumption = fuelСonsumption;
        this.maxSpeed = maxSpeed;
        typeOfAircraft = "UNDEFINED";
        serialNumber = "UNDEFINED";
        nameOfAircraft = "UNDEFINED";
    }

    public Aircraft(float tank, float fuelСonsumption, short maxSpeed, String typeOfAircraft, String serialNumber,
             String nameOfAircraft) {
        this(tank, fuelСonsumption, maxSpeed);
        this.typeOfAircraft = typeOfAircraft;
        this.serialNumber = serialNumber;
        this.nameOfAircraft = nameOfAircraft;
    }


    public float getTank() {
        return this.tank;
    }

    public float getFuelСonsumption() {
        return this.fuelСonsumption;
    }

    public void setNameOfAircraft(String nameOfAircraft) {
        this.nameOfAircraft = nameOfAircraft;
    }

    public String getNameOfAircraft() {
        return this.nameOfAircraft;
    }

    public String getTypeOfAircraft() {
        return this.typeOfAircraft;
    }

    public String getSerialNumber() {
        return this.serialNumber;
    }

    public short getMaxSpeed() {
        return this.maxSpeed;
    }

    public String getCurrentLocation() { return this.currentLocation; }

    public void action() {
        System.out.println("doing something");
    }
}
