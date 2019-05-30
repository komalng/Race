package logic;

public class Runner {
    public String name;
    public int finishingTime;

    public Runner(String name,int finishingTime){
        this.name = name;
        this.finishingTime = finishingTime;
    }

    public String toString(){
        return name+" "+finishingTime;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Runner runner = (Runner) o;
        return Double.compare(runner.finishingTime, finishingTime) == 0;
    }

}
