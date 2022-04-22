package racingcar.model;

public class Car {
    private final int STANDARD_NUMBER = 4;

    private final Name name;
    private final Score score;

    public Car(String name) {
        this.name = new Name(name);
        this.score = new Score();
    }

    public Car(String name, int score) {
        this.name = new Name(name);
        this.score = new Score(score);
    }

    public void moveCar(int randomNumber){
        if(randomNumber >= STANDARD_NUMBER){
            this.score.addScore();
            this.score.maxScoreCompare();
        }
    }
}
