package Campus;

public class Table {
    public String color;
    public int length;
    public int breadth;
    public int height;

    public Table (String color, int length, int breadth, int height) {
        this.color = color;
        this.length = length;
        this.breadth = breadth;
        this.height = height;
    }

    public void setColor(String color) {
        this.color = color;
    }
}
