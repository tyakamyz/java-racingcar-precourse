package racingcar.model;

public class Car {

    private final Name name;
    private final Score score;

    public Car(String name) {
        this.name = new Name(name);
        this.score = new Score();
    }
}
