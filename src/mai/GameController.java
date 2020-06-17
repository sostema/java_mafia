package mai;

import mai.rounds.Round;

/**
 * Класс, отвечающий за состояние игры
 */
public class GameController {

    public GameController(Player[] players, Round round){
        this.round = round;
        this.players = players;

        initializeGame();
    }

    /**
     * Метод, инициализурющий игроков и саму игру
     */
    private void initializeGame(){
        //TODO implement this
    }

    /**
     * Метод, который запускает раунды, пока не закончится игра
     */
    public void play(){
        GameState gameState = GameState.CONTINUE;
        while (gameState == GameState.CONTINUE){
            gameState = this.round.playRound(players);
        }
        endGame(gameState);
    }

    /**
     * Метод, в котором реализуется конец игры
     * @param gameState Состояние игры (MAFIA_WIN или CITIZEN_WIN)
     */
    private void endGame(GameState gameState){
        if (gameState == GameState.MAFIA_WIN){
            this.mafiaWinGame();
        }
        else{
            this.citizenWinGame();
        }
    }

    /**
     * Метод, реализующий победу гражданских
     */
    private void citizenWinGame(){

    }

    /**
     * Метод, реализующий победу мафии
     */
    private void mafiaWinGame(){

    }

    private final Round round;
    private final Player[] players;
}
