package racingcar.model;

import java.util.List;

public class RacingCars extends Cars{
    public RacingCars(){
        super();
    }

    public RacingCars(List<Car> cars){
        super(cars);
    }

    public void registerCars(List<String> carNames){
        for (String name : carNames) {
            addCar(new Car(name));
        }
    }
}
