package mai.roles;

import mai.Player;

/**
 * Класс, представляющий игрока роли Детектив
 * @see Player
 */
public class DetectiveRole extends Player {
    public DetectiveRole(String name) {
        super(name);
    }

    /**
     * Проверка данного игрока на принадлежность к роли Мафия
     * @param player Игрок, которого проверяет детектив.
     */
    public void checkPlayer(Player player){
        boolean isPlayerMafia = (player instanceof MafiaRole);
    }
}
