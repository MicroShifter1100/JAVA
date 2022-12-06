import Aircraft.*;
import ControlRoom.*;
import java.util.logging.*;

public class Main {
    public static void main(String[] args) {
        Aircraft[] planes = new Aircraft[9];

        for (int i = 0; i < 3; i++) {
            planes[i] = new Drone();
        }

        for (int i = 3; i < 6; i++) {
            planes[i] = new Bomber();
        }

        for (int i = 6; i < 9; i++) {
            planes[i] = new PuddleJumper();
        }

        ControlRoom controlRoom = new ControlRoom();
        if (controlRoom.skyCheck(planes ,"Moscow")) {
            System.out.println("Sky is free");
        } else {
            System.out.println("Sky isn't free");
        }
    }
}