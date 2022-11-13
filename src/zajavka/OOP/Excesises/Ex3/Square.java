package zajavka.OOP.Excesises.Ex3;

import java.util.Objects;

public class Square {
    private int edge = 5;

    public Square(int edge) {
        this.edge = edge;
    }

    public Square() {
    }

    public int getEdge() {
        return edge;
    }

    public void setEdge(int edge) {
        this.edge = edge;
    }
    public int aeraCalculate(){
        return this.edge*2;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Square square = (Square) o;
        return edge == square.edge;
    }

    @Override
    public int hashCode() {
        return Objects.hash(edge);
    }

    @Override
    public String toString() {
        return "Square{" +
                "edge=" + edge +
                '}';
    }
}
