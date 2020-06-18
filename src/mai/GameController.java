package mai;

import mai.roles.CitizenRole;
import mai.roles.DetectiveRole;
import mai.roles.DoctorRole;
import mai.roles.MafiaRole;
import mai.rounds.Round;

/**
 * Класс, отвечающий за состояние игры
 */
public class GameController {

    private Round round;
    private Player[] players;

    public GameController() {
        this.initializeGame();
    }

    public GameController(Player[] players, Round round) {
        this.round = round;
        this.players = players;
    }

    public static void main(String[] args) {
        GameController gameController = new GameController();
        gameController.play();
    }

    /**
     * Метод, инициализурющий игроков и раунд (на случай, если
     */
    private void initializeGame() {
        this.round = new Round();
        this.players = new Player[]{new MafiaRole("Mafia Michael"), new MafiaRole("Mafia Nikola"),
                new DetectiveRole("Detective"), new DoctorRole("Doc"), new CitizenRole("Citizen Andrew"),
                new CitizenRole("Citizen Alexey"), new CitizenRole("Citizen Kola")};
    }

    /**
     * Метод, который запускает раунды, пока не закончится игра
     */
    public void play() {
        GameState gameState = GameState.CONTINUE;
        while (gameState == GameState.CONTINUE) {
            gameState = this.round.playRound(players);
        }
        endGame(gameState);
    }

    /**
     * Метод, в котором реализуется конец игры
     *
     * @param gameState Состояние игры (MAFIA_WIN или CITIZEN_WIN)
     */
    private void endGame(GameState gameState) {
        if (gameState == GameState.MAFIA_WIN) {
            this.mafiaWinGame();
        } else {
            this.citizenWinGame();
        }
    }

    /**
     * Метод, реализующий победу гражданских
     */
    private void citizenWinGame() {

    }

    /**
     * Метод, реализующий победу мафии
     */
    private void mafiaWinGame() {

    }
}
