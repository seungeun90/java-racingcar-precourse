package racingcar.model;


import java.util.Objects;

public class Car {
    private Name name;
    private Position position;
    public Car(Name name){
        this.name = name;
        this.position = new Position(0);
    }
    private Car(Name name, Position position){
        this.name = name;
        this.position = position;
    }

    public Car moveForward(){
        return new Car(this.name, this.position.moveForward());
    }
    public Car stop(){
        return new Car(this.name, this.position.stop());
    }

    public Name getName() {
        return name;
    }
    public Position getPosition() {
        return position;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Car car = (Car) o;
        return Objects.equals(name, car.name) && Objects.equals(position, car.position);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, position);
    }
}
