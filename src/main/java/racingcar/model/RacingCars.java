package racingcar.model;

import java.util.List;

public class RacingCars extends Cars{
    Cars winnerCars;

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

    public void findWinnerCars() {
        this.winnerCars = new Cars();

        for(Car car : this.cars){
            compareMaxScore(car);
        }
    }

    private void compareMaxScore(Car car) {
        if(car.isWinner()){
            winnerCars.addCar(car);
        }
    }
}
