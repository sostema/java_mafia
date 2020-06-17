package mai.rounds;

import mai.Player;

/**
 * Интерфейс фазы раунда
 */
public interface IPhase {
    /**
     * Реализация действий игроков
     * @param players Текущие игроки
     */
    void action(Player[] players);
}
