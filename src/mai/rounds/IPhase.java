package mai.rounds;

import mai.Player;

/**
 * Интерфейс фазы раунда
 */
public interface IPhase {
    /**
     * Метод, определяющий действия игроков во время фазы
     *
     * @param players Текущие игроки
     */
    void action(Player[] players);
}
