package logic;

public class Test {
    public static void main(String[] args) {
        Runner runner = new Runner("komal",120);
        Runner runner1 = new Runner("Akshit",100);
        Runner runner2 = new Runner("Akshit",90);
        Runner runner3 = new Runner("Akshit",300);
        Race race = new Race();
        race.add(runner);
        race.add(runner1);
        race.add(runner2);
        race.add(runner3);
        System.out.println(race.getRunners());
        System.out.println("Winner"+":- "+race.getWinner());
    }
}
