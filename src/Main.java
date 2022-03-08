import java.util.Arrays;

public class Main {
    public static boolean isGreenLight = false;

    public static void main(String[] args) {
        int speedOfPlayer1 = 5;
        int speedOfPlayer2 = 0;
        int speedOfPlayer3 = 2;
        int numberOfRetiredPlayers = 0;
        if (isGreenLight == false && speedOfPlayer1 > 0) {
            numberOfRetiredPlayers = numberOfRetiredPlayers + 1;
        }
        if (isGreenLight == false && speedOfPlayer2 > 0) {
            numberOfRetiredPlayers = numberOfRetiredPlayers + 1;
        }
        if (isGreenLight == false && speedOfPlayer3 > 0) {
            numberOfRetiredPlayers = numberOfRetiredPlayers + 1;
        }
        System.out.println("Количество игроков, которые выбывают:" + numberOfRetiredPlayers);

        boolean p = UtilsHw16.valueSpeed(speedOfPlayer1);
        if (p) {
            System.out.println("игрок 1 выбыл");
        } else {
            System.out.println("игрок 1 остается в игре");
        }
        boolean p1 = UtilsHw16.valueSpeed(speedOfPlayer2);
        if (p1) {
            System.out.println("игрок 2 выбыл");
        } else {
            System.out.println("игрок 2 остается в игре");
        }
        boolean p2 = UtilsHw16.valueSpeed(speedOfPlayer3);
        if (p2) {
            System.out.println("игрок 3 выбыл");
        } else {
            System.out.println("игрок 3 остается в игре");
        }
        
    }

}

