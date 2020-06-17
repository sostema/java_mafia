package mai.roles;

import mai.Player;

/**
 * Класс, представляющий игрока роли Доктор
 * @see Player
 */
public class DoctorRole extends Player {
    public DoctorRole(String name) {
        super(name);
    }

    /**
     * Позволяет доктору защитить персонажа от смерти Мафии
     * @see Player
     */
    public void healPlayer(Player player){
        player.heal();
    }
}
