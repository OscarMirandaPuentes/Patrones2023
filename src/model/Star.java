package model;

public class Star {
    private StarType star;
    private int x;
    private int y;

    public Star(StarType star, int x, int y) {
        this.star = star;
        this.x = x;
        this.y = y;
    }

    public StarType getStar() {
        return star;
    }

    public void setStar(StarType star) {
        this.star = star;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }
}

