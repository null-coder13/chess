package Pieces;

import java.awt.*;

public class Pawn extends Piece {

    public boolean initialMove = false;
    public int team;
    public Point location;

    public Pawn(int team, Point location) {
        //add a location based on the team
        this.team = team;
        this.location = location;
    }

    public void setX(int x) {
        this.location.x = x;
    }

    public void setY(int y) {
        this.location.y = y;
    }

    @Override
    public void move() {

    }
}
