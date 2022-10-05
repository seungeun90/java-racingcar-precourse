package racingcar.model;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class CarTest {

    @Test
    @DisplayName("자동차를 생성한다.")
    public void create_car() {
        Car car = new Car(new Name("carA"));
        assertThat(car).isEqualTo(new Car(new Name("carA")));
        assertThat(car.getPosition()).isEqualTo(new Position(0));
    }

    @Test
    @DisplayName("자동차 이름을 0자 이하, 6자 이상으로 한다.")
    public void create_Car_withNameException() {
        Assertions.assertThatThrownBy(() -> new Car(new Name("")))
                .isExactlyInstanceOf(IllegalArgumentException.class)
                .hasMessage("[Error] 차 이름은 1자 이상 5자 이하로 가능합니다.");

        Assertions.assertThatThrownBy(() -> new Car(new Name("carAAA")))
                .isExactlyInstanceOf(IllegalArgumentException.class)
                .hasMessage("[Error] 차 이름은 1자 이상 5자 이하로 가능합니다.");
    }

    @Test
    @DisplayName("자동차 위치를 앞으로 이동한다.")
    public void moveForward() {
        Car car = new Car(new Name("carA"));
        Car car1 = car.moveForward();
        assertThat(car1.getPosition()).isEqualTo(new Position(1));
        Car car2 = car1.moveForward();
        assertThat(car2.getPosition()).isEqualTo(new Position(2));
    }

    @Test
    @DisplayName("자동차를 멈추면 위치가 변하지 않는다.")
    public void moveBackward_oneTime() {
        Car car = new Car(new Name("carA"));
        Car car1 = car.stop();
        assertThat(car1.getPosition()).isEqualTo(new Position(0));

        Car car2 = car.moveForward().moveForward().stop();
        assertThat(car2.getPosition()).isEqualTo(new Position(2));
    }



}