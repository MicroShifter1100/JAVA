package ControlRoom;

import Aircraft.Aircraft;

public class ControlRoom {
    public static boolean skyCheck(Aircraft[] planes, String location) {
        boolean skyFree = true;

        for (Aircraft plane : planes) {
            if (plane.getCurrentLocation().equals(location)) {
                skyFree = false;
            }
        }

        return skyFree;
    }
}
