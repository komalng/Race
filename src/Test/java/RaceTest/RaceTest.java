package RaceTest;

import logic.Race;
import logic.Runner;
import org.junit.Test;
import static org.junit.Assert.*;


import java.util.ArrayList;
import java.util.List;

public class RaceTest {
    @Test public void shouldAddRunnerInRunners(){
        Runner runner = new Runner("komal",120);
        Runner runner1 = new Runner("Akshit",100);
        Race race = new Race();
        List<Runner>expected = new ArrayList<>();
        expected.add(runner);
        expected.add(runner1);
        race.add(runner);
        race.add(runner1);
        race.getRunners();
        assertEquals(expected,race.getRunners());
    }

    @Test public void shouldGiveWinner(){
        Runner runner = new Runner("komal",120);
        Runner runner1 = new Runner("Akshit",100);
        Race race = new Race();
        List<Runner>expected = new ArrayList<>();
        expected.add(runner);
        expected.add(runner1);
        race.add(runner);
        race.add(runner1);
        race.getRunners();
        assertEquals("Akshit",race.getWinner().name);
    }

}
