package racingcar.model;

import java.util.Objects;

public class Position {
    private int position;
    public Position(int position){
        validatePosition(position);
        this.position = position;
    }

    private void validatePosition(int position) {
        if(position < 0 ) throw  new IllegalArgumentException("[Error] 자동차의 위치는 0 이상이여야합니다.");
    }
    public Position moveForward(){
        return new Position(this.position+1);
    }
    public Position stop(){
        return this;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Position position1 = (Position) o;
        return position == position1.position;
    }

    @Override
    public int hashCode() {
        return Objects.hash(position);
    }
}
