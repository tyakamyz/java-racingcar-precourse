package racingcar.model;

import java.util.ArrayList;
import java.util.List;

public class Cars {
    private final List<Car> cars;

    public Cars() {
        this.cars = new ArrayList<>();
    }

    public Cars(List<Car> cars) {
        this.cars = cars;
    }

    private void addCar(Car car){
        this.cars.add(car);
    }

    public void registerCars(List<String> carNames){
        for (String name : carNames) {
            addCar(new Car(name));
        }
    }
}
