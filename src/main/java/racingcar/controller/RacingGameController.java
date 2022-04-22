package racingcar.controller;

import racingcar.model.Car;
import racingcar.model.Cars;
import racingcar.model.RacingCars;
import racingcar.util.StringUtil;
import racingcar.view.InputView;
import racingcar.view.ResultView;

public class RacingGameController {

    public void racingStart(){
        RacingCars racingCars = new RacingCars();
        racingCars.registerCars(StringUtil.splitStringToList(InputView.inputCarsName()));

        int tryNumber = InputView.inputTryNumber();

        System.out.println();
        ResultView.getResultTitleMessage();
        for (int i = 0; i < tryNumber; i++) {
            playing(racingCars);
        }

        racingCars.findWinnerCars();
        ResultView.getResultFinalWinnerMessage(racingCars.getWinners());

    }

    private void playing(RacingCars racingCars){
        racingCars.compete();
        System.out.println();
    }
}
