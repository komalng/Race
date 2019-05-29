import java.util.ArrayList;
import java.util.List;

public class Race {
    private List<Runner> runners = new ArrayList<>();

    public List<Runner> getRunners() {
        return runners;
    }

    public void add(Runner runner) {
        runners.add(runner);
    }

    public Runner getWinner() {
        Runner runner1 = runners.get(0);
        for (Runner runner : runners) {
            if(runner.finishingTime < runner1.finishingTime){
                runner1 = runner;
            }
        }
        return runner1;
    }


}
