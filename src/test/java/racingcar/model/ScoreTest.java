package racingcar.model;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class ScoreTest {

    @Test
    void maxScoreCompare() {
        Score score = new Score(3);
        score.maxScoreCompare();

        assertThat(Score.getMaxScore()).isEqualTo(3);
    }
}