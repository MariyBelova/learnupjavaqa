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
        int[] speedOfPlayers = {5, 0, 2};
        System.out.println("Количество выбывших игроков " + Homework17.cnt(speedOfPlayers));
        int[] losers1 = Homework17.loser(speedOfPlayers);
        int[] winners1 = Homework17.winner(speedOfPlayers);
        System.out.println("Скорости выбывших игроков:");
        System.out.println(Arrays.toString(losers1));
        System.out.println("Скорости не выбывших игроков:");
        System.out.println(Arrays.toString(winners1));
    }

}

