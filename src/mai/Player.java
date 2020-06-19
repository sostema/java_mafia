package mai;

/**
 * Абстрактный класс игрока, от которого наследуются разные роли
 */
public abstract class Player {
    private final String name;
    private boolean isAlive;
    private boolean isShielded;
    private int votes = 0;


    /**
     * Конструктор, создающий игрока (используется в наследуемых классах)
     *
     * @param name - имя игрока
     */
    public Player(String name) {
        this.isAlive = true;
        this.isShielded = false;
        this.name = name;
    }

    /**
     * Метод, реализующий смерть игрока
     */
    public void kill() {
        if (isShielded) {
            isShielded = false;
        } else {
            isAlive = false;
        }
    }

    /**
     * Метод, реализующий лечение Доктора
     */
    public void heal() {
        isShielded = true;
    }

    /**
     * Свойство, возвращяющее состояние игрока
     *
     * @return состояние игрока, жив он или нет
     */
    public boolean getStatus() {
        return isAlive;
    }

    /**
     * Свойство, возвращяющее текущие голоса за персонажа
     *
     * @return количество голосов за игрока
     */
    public int getVotes() {
        return votes;
    }

    /**
     * Метод, который вызывется при голосовании
     *
     * @param votedPlayer - игрок, за которого проголосовали
     */
    public void vote(Player votedPlayer) {
        votedPlayer.votes++;
    }

    /**
     * Метод, реализующий текстовое сообщение между игроками
     *
     * @param speech Текстовое сообщение
     */
    public void say(String speech) {
        //TODO implement this
    }

    /**
     * Метод, возвращающий игрока из списка
     *
     * @param players - текщущие игроки, из которых выбираем
     * @return выбранный игрок из списка
     */
    public Player getPlayer(Player[] players) {
        return players[0];
    }
}
