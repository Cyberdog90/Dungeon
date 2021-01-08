package game;

import core.io.std.Input;

public class Director implements core.game.Director {
    @Override
    public void gameLoop() {
        update();
        while (true) {
            input();
            processing();
            update();
        }
    }

    @Override
    public void input() {
        Input.readLine();
    }

    @Override
    public void processing() {

    }

    @Override
    public void update() {

    }
}
