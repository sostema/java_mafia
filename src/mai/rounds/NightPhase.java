package mai.rounds;

import mai.Player;
import mai.roles.DetectiveRole;
import mai.roles.DoctorRole;
import mai.roles.MafiaRole;

/**
 * Класс, реализующий ночную фазу в раунде
 */
public class NightPhase implements IPhase {
    @Override
    public void action(Player[] players) {
        MafiaPhase(players);
        DetectivePhase(players);
        DoctorPhase(players);
    }

    /**
     * Метод, который реализует фазу голосования Мафией
     * @param players Текущие игроки
     */
    private void MafiaPhase(Player[] players){
        for (Player p:players) {
            if (p instanceof MafiaRole){
                Player chosenPlayer = p.getPlayer();
                p.vote(chosenPlayer);
            }
        }
    }
    /**
     * Метод, который реализует фазу проверки игрока Детективом
     * @param players Текущие игроки
     */
    private void DetectivePhase(Player[] players){
        for (Player p:players) {
            if (p instanceof DetectiveRole){
                Player chosenPlayer = p.getPlayer();
                ((DetectiveRole) p).checkPlayer(chosenPlayer);
            }
        }
    }
    /**
     * Метод, который реализует фазу лечения Доктором
     * @param players Текущие игроки
     */
    private void DoctorPhase(Player[] players){
        for (Player p:players) {
            if (p instanceof DoctorRole){
                Player chosenPlayer = p.getPlayer();
                ((DoctorRole) p).healPlayer(chosenPlayer);
            }
        }
    }
}
