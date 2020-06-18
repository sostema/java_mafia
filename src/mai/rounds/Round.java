package mai.rounds;

import mai.GameState;
import mai.Player;

/**
 * Класс, реализующий раунд
 */
public class Round {
    private final NightPhase nightPhase;
    private final DayPhase dayPhase;

    public Round() {
        this.dayPhase = new DayPhase();
        this.nightPhase = new NightPhase();
    }

    /**
     * Метод, реализующий фазы во время раунда (ночная фаза, дневная фаза)
     * и проверка текущего игрового состояния
     *
     * @param players Текущие игроки
     */
    public GameState playRound(Player[] players) {
        this.nightPhase.action(players);
        GameState gameState = this.checkGameState(players);
        if (gameState != GameState.CONTINUE) {
            return gameState;
        }
        dayPhase.action(players);
        this.checkGameState(players);
        gameState = this.checkGameState(players);
        return gameState;
    }

    /**
     * Метод, проверяющий текущее состояние игры
     *
     * @param players Текущие игроки
     * @return Текущее состояние игры
     */
    private GameState checkGameState(Player[] players) {
        return GameState.MAFIA_WIN;
    }
}
