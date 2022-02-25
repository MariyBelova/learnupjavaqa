import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class Homework17Test {
    @Test
    public void shouldFindCntLosers() {
        int[] speedOfPlayers = {2, 0, 5};
        int expected = 2;
        int actual = Homework17.cnt(speedOfPlayers);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldFindCntLosersZero() {
        int[] speedOfPlayers = {0, 0, 0};
        int expected = 0;
        int actual = Homework17.cnt(speedOfPlayers);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldFindCntLosersSame() {
        int[] speedOfPlayers = {5, 5, 5};
        int expected = 3;
        int actual = Homework17.cnt(speedOfPlayers);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldFindCntLosersMinus() {
        int[] speedOfPlayers = {-1, -2, -3};
        int expected = 0;
        int actual = Homework17.cnt(speedOfPlayers);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldFindSpeedOfLosers() {
        int[] speedOfPlayers = {2, 0, 5};
        int[] expected = {2, 5};
        int[] actual = Homework17.loser(speedOfPlayers);
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldFindSpeedOfLosersSame() {
        int[] speedOfPlayers = {5, 5, 5};
        int[] expected = {5, 5, 5};
        int[] actual = Homework17.loser(speedOfPlayers);
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldFindSpeedOfWinners() {
        int[] speedOfPlayers = {2, 0, 5};
        int[] expected = {0};
        int[] actual = Homework17.winner(speedOfPlayers);
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldFindSpeedOfWinnersZero() {
        int[] speedOfPlayers = {0, 0, 0};
        int[] expected = {0, 0, 0};
        int[] actual = Homework17.winner(speedOfPlayers);
        Assertions.assertArrayEquals(expected, actual);
    }

}

