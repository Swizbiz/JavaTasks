package com.javarush.task.task25.task2515;

public class SpaceShip extends BaseObject {
    private double dx = 0;

    public SpaceShip(double x, double y) {
        super(x, y, 3);
    }

    public void moveLeft() {
        this.dx = -1.0;
    }

    public void moveRight() {
        this.dx = 1.0;
    }

    @Override
    public void move() {
        x += dx;
        checkBorders(0, Space.game.getWidth(), 0, Space.game.getHeight());
    }

    @Override
    public void draw(Canvas canvas) {
    }

    public void fire() {
        Rocket rocket1 = new Rocket(x - 2.0, y);
        Rocket rocket2 = new Rocket(x + 2.0, y);
        Space.game.getRockets().add(rocket1);
        Space.game.getRockets().add(rocket2);
    }
}
