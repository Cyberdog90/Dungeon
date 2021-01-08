package core.game;

public interface Director {
    public void gameLoop();

    public void input();

    public void processing();

    public void update();
}
