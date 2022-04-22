package racingcar.model;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.assertj.core.api.Assertions.assertThat;

class CarsTest {

    @Test
    void registerCars() {
        Cars cars = new Cars();
        cars.registerCars(Arrays.asList("pobi","woni","jun"));

        assertThat(cars)
                .usingRecursiveComparison()
                .isEqualTo(new Cars(Arrays.asList(new Car("pobi"), new Car("woni"), new Car("jun"))));
    }
}