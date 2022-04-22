package racingcar.model;

import java.util.ArrayList;
import java.util.List;

public class WinnerCars extends Cars{
    public void findWinnerCars() {
        List<Car> winnerCars = new ArrayList<>();

        for(Car car : this.cars){
            compareMaxScore(winnerCars, car);
        }

        this.cars = winnerCars;
    }

    private void compareMaxScore(List<Car> winnerCars, Car car) {
        if(car.isWinner()){
            winnerCars.add(car);
        }
    }
}
