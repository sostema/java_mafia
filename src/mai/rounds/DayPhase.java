package mai.rounds;

import mai.Player;

/**
 * Класс, представляющий дневную фазу во время раунда
 *
 * @see IPhase
 */
public class DayPhase implements IPhase {
    @Override
    public void action(Player[] players) {
        votePhase(players);
        checkVotes(players);
    }

    /**
     * Метод, который реализует фазу голосования персонажами
     *
     * @param players Текущие игроки
     */
    private void votePhase(Player[] players) {
        for (Player p : players) {
            Player chosenPlayer = p.getPlayer();
            p.vote(chosenPlayer);
        }
    }

    /**
     * Метод, который реализует фазу решения, кто умрёт в результате голосования
     *
     * @param players Текущие игроки
     */
    private void checkVotes(Player[] players) {
        Player mostVotedPlayer = players[0];
        for (Player p : players) {
            if (p.getVotes() >= mostVotedPlayer.getVotes()) {
                mostVotedPlayer = p;
            }
        }
        mostVotedPlayer.kill();
    }
}
