package racingcar.model;

public class GamePlayer {
    private int numberOfPlay;
    private int numberOfMovement;
    private final MovingStrategy movingStrategy;

    public GamePlayer(int number){
        this.numberOfPlay = number;
        movingStrategy = new RandomMoveStrategy();
    }

    public Cars play(Cars cars){
        if( ! isGameOver() ) {
            numberOfMovement += 1;
        }
        cars.move(movingStrategy);

        return cars;
    }

    public boolean isGameOver(){
        if(numberOfMovement < numberOfPlay ) return false;
        return true;
    }



}
