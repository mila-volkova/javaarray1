import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class FilmsManagerTest {
    @Test
    public void EnumerationOfFilmsTest() {

        FilmsManager manager = new FilmsManager();
        manager.addFilm("Movie first");
        manager.addFilm("Movie second");
        manager.addFilm("Movie third");
        manager.addFilm("Movie fourth");
        manager.addFilm("Movie fifth");
        String[] actual = manager.findAll();
        String[] expected = {"Movie first", "Movie second", "Movie third", "Movie fourth", "Movie fifth"};
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void EnumerationOfFilmsTest1() {

        FilmsManager manager = new FilmsManager();
        manager.addFilm("Movie first");

        String[] actual = manager.findAll();
        String[] expected = {"Movie first"};
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void OutputInReverseOrderTest1() {

        FilmsManager manager = new FilmsManager(5);
        manager.addFilm("Movie first");
        manager.addFilm("Movie second");
        manager.addFilm("Movie third");
        manager.addFilm("Movie fourth");
        manager.addFilm("Movie fifth");
        String[] actual = manager.findLast();
        String[] expected = {"Movie fifth", "Movie fourth", "Movie third", "Movie second", "Movie first"};
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void OutputInReverseOrderTest2() {

        FilmsManager manager = new FilmsManager();

        manager.addFilm("Movie third");
        manager.addFilm("Movie fourth");
        manager.addFilm("Movie fifth");
        String[] actual = manager.findLast();
        String[] expected = {"Movie fifth", "Movie fourth", "Movie third"};
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void OutputInReverseOrderTest3() {

        FilmsManager manager = new FilmsManager(7);
        manager.addFilm("Movie first");
        manager.addFilm("Movie second");
        manager.addFilm("Movie third");
        manager.addFilm("Movie fourth");
        manager.addFilm("Movie fifth");
        manager.addFilm("Movie sixth");
        manager.addFilm("Movie seventh");
        String[] actual = manager.findLast();
        String[] expected = {"Movie seventh", "Movie sixth", "Movie fifth", "Movie fourth", "Movie third", "Movie second", "Movie first"};
        Assertions.assertArrayEquals(expected, actual);
    }
}

