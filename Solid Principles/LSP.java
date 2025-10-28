// Violation of this rule 
public class Rectangle {
    protected int width, height;
    public void setWidth(int w) { width = w; }
    public void setHeight(int h) { height = h; }
    public int getArea() { return width * height; }
}

public class Square extends Rectangle {
    @Override
    public void setWidth(int w) {
        width = height = w;
    }
    @Override
    public void setHeight(int h) {
        width = height = h;
    }
}

Rectangle r = new Square();
r.setWidth(5);
r.setHeight(4);
// Imagine code expecting r.getArea() == 20, but gets 16 instead!


// LSP supporting code 
// Both have different class rather than extenting each other and making it work
// or we can use a general class such as shape or polygon and rectangle, square extends it 

public class Rectangle {
    private int width;
    private int height;
    public Rectangle(int width, int height) { this.width = width; this.height = height; }
    public void setWidth(int w) { this.width = w; }
    public void setHeight(int h) { this.height = h; }
    public int getArea() { return width * height; }
}

public class Square {
    private Rectangle rectangle;
    public Square(int side) { rectangle = new Rectangle(side, side); }
    public void setSide(int side) {
        rectangle.setWidth(side);
        rectangle.setHeight(side);
    }
    public int getArea() { return rectangle.getArea(); }
}
