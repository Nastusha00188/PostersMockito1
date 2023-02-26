import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class PostersManagerTest {
    @Test
    public void adding() {
        PostersManager manager = new PostersManager();
        manager.addPoster("Poster1");
        manager.addPoster("Poster2");
        manager.addPoster("Poster3");

        String[] expected = {"Poster1", "Poster2", "Poster3"};
        String[] actual = manager.findAll();

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void last() {
        PostersManager manager = new PostersManager();
        manager.addPoster("Poster1");
        manager.addPoster("Poster2");
        manager.addPoster("Poster3");

        String[] expected = {
                "Poster3",
                "Poster2",
                "Poster1"};
        String[] actual = manager.findLast();

        Assertions.assertArrayEquals(expected, actual);
    }
}
