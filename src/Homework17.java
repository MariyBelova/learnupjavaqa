public class Homework17 {
    public static int cnt(int[] speedOfPlayers) {
        int cntLosers = 0;
        if (Main.isGreenLight == false) {
            for (int speed : speedOfPlayers) {
                if (speed > 0) {
                    cntLosers++;
                }
            }
        }
        return cntLosers;
    }

    public static int[] loser(int[] speedOfPlayers) {
        int[] losers = new int[cnt(speedOfPlayers)];
        int i = 0;
        for (int speedOfPlayer : speedOfPlayers) {
            if (Main.isGreenLight == false && speedOfPlayer != 0) {
                losers[i] = speedOfPlayer;
                i++;
            }
        }
        return losers;
    }

    public static int[] winner(int[] speedOfPlayers) {
        int cnt = 0;
        if (Main.isGreenLight == false) {
            for (int speed : speedOfPlayers) {
                if (speed == 0) {
                    cnt++;
                }
            }
        } else {
            cnt = speedOfPlayers.length;

        }
        int[] winners = new int[cnt];
        int i = 0;
        for (int speedOfPlayer : speedOfPlayers) {
            if (Main.isGreenLight) {
                winners[i] = speedOfPlayer;
                i++;
            } else {
                if (Main.isGreenLight == false && speedOfPlayer == 0) {
                    winners[i] = speedOfPlayer;
                    i++;
                }
            }
        }
        return winners;
    }
}
