public class UtilsHw16 {
    public static boolean isGreenLight = false;

    public static boolean valueSpeed(int speedOfPlayer) {
        int speed = speedOfPlayer;
        if (isGreenLight && speed > 0) {
            return true;
        } else {
            return false;
        }
    }
}
