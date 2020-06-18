package mai;

/**
 * Абстрактный класс игрока, от которого наследуются разные роли
 */
public abstract class Player {
    private final String name;
    private boolean isAlive;
    private boolean isShielded;
    private int votes = 0;

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
     */
    public boolean getStatus() {
        return isAlive;
    }

    /**
     * Свойство, возвращяющее текущие голоса за персонажа
     */
    public int getVotes() {
        return votes;
    }

    /**
     * Метод, который вызывется при голосовании
     *
     * @param vote Игрок, за которого проголосовали
     */
    public void vote(Player vote) {
        vote.votes++;
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
     * Метод, возвращающий игрока
     *
     * @return Выбранного игрока
     */
    public Player getPlayer() {
        return this;
    }
}
